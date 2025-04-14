//package org.example;
//
//import org.example.model.Department;
//import org.example.model.Employee;
//
//import java.util.Comparator;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//public class TestDemo {
//
////    abstract person {
////        name;
////    }
////
////    Employee extends Person {
////        ID,
////        DOB,
////                cache(Map<Employee, Integer>) (10 -100)
////        Dept { // 10 dept with heads
////            id, name
////        }
////        <Employee> Supervisor
////    }
//
//
//
//    public static void main(String[] args) {
////        Employee emp = new Employee(101L, new Date(),
////                new Employee(101L, "Emp1", new Date(), null, new Department(1001L, "CSE")),
////                new Department(1001L, "CSE"));
//
////        emp.getDateOfBirth();
//
////        System.out.println(emp);
//
//        Map<org.example.model.Employee, Integer> employeeMap = new HashMap<>();
//
//
//
//        for(int i=0;i <10; i++) {
//            Department dept = new Department(Long.parseLong(i+""), "CSE");
//            Employee tempEmp = new Employee(Long.parseLong(i+""), "emp"+i, new Date(),
//                    new Employee(101L, "emp1"+i, new Date(), null,dept),
//                    dept);
//
//            employeeMap.put(tempEmp, i);
//
//        }
//
//        System.out.println(employeeMap);
//        Map<Employee, Integer> result = employeeMap.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue())
//                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
//
//        System.out.println(result);
//    }
//}
