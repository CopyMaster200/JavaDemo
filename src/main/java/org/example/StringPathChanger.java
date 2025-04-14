package org.example;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class StringPathChanger {
    public static void main(String[] args) {
        StringPathChanger changer = new StringPathChanger();

        // Test cases
        System.out.println(changer.changeDirectoryString("/dev/task", "cd /")); // "/"
        System.out.println(changer.changeDirectoryString("/dev/task", "cd ..")); // "/dev"
        System.out.println(changer.changeDirectoryString("/dev/task", "cd java")); // "/dev/task/java"
        System.out.println(changer.changeDirectoryString("/dev/task", "cd ../solution")); // "/dev/solution"
        System.out.println(changer.changeDirectoryString("/dev/task/java", "cd ../..")); // "/dev"
        System.out.println(changer.changeDirectoryString("/dev/task", "cd java/")); // "/dev/task/java"

        try {
            System.out.println(changer.changeDirectoryString("/dev/task", "wrong command"));
        } catch (IllegalStateException e) {
            System.out.println(e); // IllegalStateException
        }
    }

    public String changeDirectoryString(String currentDirectory, String command) {
        // Validate that the command starts with "cd "
        if (!command.startsWith("cd ")) {
            throw new IllegalStateException("Command must start with 'cd'");
        }

        // Extract the directory path from the command
        String targetPath = command.substring(3).trim();

        // If the command is "cd /", return the root directory
        if (targetPath.equals("/")) {
            return "/";
        }

        // Split the current directory into components
        Deque<String> pathStack = new ArrayDeque<>(Arrays.asList(currentDirectory.split("/")));

        // Remove any empty strings caused by leading slash
        if (pathStack.peekFirst().isEmpty()) {
            pathStack.pollFirst();
        }

        // Split the target path into components
        String[] commands = targetPath.split("/");

        for (String part : commands) {
            if (part.isEmpty() || part.equals(".")) {
                // Ignore empty parts or '.' (current directory)
                continue;
            } else if (part.equals("..")) {
                // Move up one directory
                if (!pathStack.isEmpty()) {
                    pathStack.pollLast();
                }
            } else {
                // Move into a subdirectory
                pathStack.addLast(part);
            }
        }

        // Construct the resulting path
        StringBuilder resultPath = new StringBuilder("/");
        for (String dir : pathStack) {
            resultPath.append(dir).append("/");
        }

        // Remove the trailing slash, if any
        if (resultPath.length() > 1) {
            resultPath.setLength(resultPath.length() - 1);
        }

        return resultPath.toString();
    }
}
