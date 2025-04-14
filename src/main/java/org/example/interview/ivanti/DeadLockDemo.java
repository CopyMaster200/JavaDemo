package org.example.interview.ivanti;

import java.util.concurrent.locks.ReentrantLock;

class Resource {
    String name;

    Resource(String name) {
        this.name = name;
    }
}

class SafeResource {
    String name;
    ReentrantLock lock = new ReentrantLock();

    SafeResource(String name) {
        this.name = name;
    }
}

public class DeadLockDemo {
    public static void main(String[] args) {
//        deadlock();
        lockOrdering();
//        reentrantLock();
    }

    /**
     * 2️⃣ Try-Lock Mechanism (ReentrantLock.tryLock())
     * Instead of blocking indefinitely, tryLock() attempts to acquire a lock.
     * If it fails, the thread can release other locks and try again later, avoiding deadlock.
     * ✅ Solution: If one lock isn’t available, release acquired locks and retry.
     */
    private static void reentrantLock() {
        SafeResource resource1 = new SafeResource("Resource 1");
        SafeResource resource2 = new SafeResource("Resource 2");

        Thread thread1 = new Thread(() -> {
            while (true) {
                if (resource1.lock.tryLock()) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " locked " + resource1.name);
                        Thread.sleep(50); // Simulate work
                        if (resource2.lock.tryLock()) {
                            try {
                                System.out.println(Thread.currentThread().getName() + " locked " + resource2.name);
                                break; // Success, exit loop
                            } finally {
                                resource2.lock.unlock();
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        resource1.lock.unlock();
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                if (resource2.lock.tryLock()) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " locked " + resource2.name);
                        Thread.sleep(50);
                        if (resource1.lock.tryLock()) {
                            try {
                                System.out.println(Thread.currentThread().getName() + " locked " + resource1.name);
                                break;
                            } finally {
                                resource1.lock.unlock();
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        resource2.lock.unlock();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    /**
     * 1️⃣ Lock Ordering (Fixed Lock Acquisition Order)
     * Always acquire locks in a consistent order across all threads.
     * If Thread-1 locks resource1 first, Thread-2 must also lock resource1 first.
     * ✅ Solution: Ensure all threads acquire locks in the same order.
     */
    private static void lockOrdering() {
        Resource resource1 = new Resource("Resource 1");
        Resource resource2 = new Resource("Resource 2");

        // Thread 1 locks resources in order (resource1 -> resource2)
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + " locked " + resource1.name);

                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + " locked " + resource2.name);
                }
            }
        });

        // Thread 2 also locks resources in the SAME order (resource1 -> resource2)
        Thread thread2 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + " locked " + resource1.name);

                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + " locked " + resource2.name);
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    private static void deadlock() {
        Resource r1 = new Resource("Resource 1");
        Resource r2 = new Resource("Resource 2");

        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                System.out.println(Thread.currentThread().getName() + " locked " + r1.name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (r2) {
                    System.out.println(Thread.currentThread().getName() + " locked " + r2.name);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (r2) {
                System.out.println(Thread.currentThread().getName() + " locked " + r2.name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (r1) {
                    System.out.println(Thread.currentThread().getName() + " locked " + r1.name);
                }
            }
        });

        t1.setName("First");
        t2.setName("Second");

        t1.start();
        t2.start();
    }
}
