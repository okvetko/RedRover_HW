package Video14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        String[] strArr = new String[5];
//        List<String> strings = new ArrayList<>(List.of("aa", "bb", "cc", "ac", "ad", "tt"));
//
//        strings.add(2, "xx");
//        System.out.println(strings.size());
//
//        System.out.println(filterStartWithA(strings));
//
//        Iterator<String> iter = strings.iterator(); // основа для перебора списков
//        while (iter.hasNext()) {
//            String s = iter.next();
//            System.out.println(s );
//        }
//
//
//    }
//
//    private static List<String> filterStartWithA(List<String> strs) {
//        List<String> result = new ArrayList<>();
//        for (int i = 0; i < strs.size(); i++) {
//            String element = strs.get(i);
//            if(element.startsWith("a")) {
//                result.add(element);
//            }
//        }
//
//        return result;
//    }

//        Set<Integer> intSet = new HashSet<>();
//        intSet.add(1);
//        intSet.add(2);
//        intSet.add(3);
//        System.out.println(intSet);

//        Map<String, Integer> employeeAges = new HashMap<>();
//        employeeAges.put("John", 50);
//        employeeAges.put("Mary", 55);
//        employeeAges.put("Bob", 55);
//        System.out.println(employeeAges.get("Bob"));

//        String string = "kjhfowiefgfdghtyudd";
//        Map<Character, Integer> resullt = new HashMap<>();
//        for (char c : string.toCharArray()) {
//            int count = resullt.getOrDefault(c, 0) + 1;
//            resullt.put(c, count);
//            }
//        System.out.println(resullt);

        List<Employee> employees = List.of(
                new Employee("John", "Madrid"),
                new Employee("Sam", "Madrid"),
                new Employee("bob", "York")
        );

        Map<String , List<Employee>> byOffice = new HashMap<>();
        for (Employee employee: employees) {
            List<Employee> employeeInOffice =
                    byOffice.getOrDefault(employee.getOffice(), new ArrayList<>());
            employeeInOffice.add(employee);
            byOffice.put(employee.getOffice(), employeeInOffice);
        }
        System.out.println(byOffice);
    }
}
