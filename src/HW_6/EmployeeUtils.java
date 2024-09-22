package HW_6;

public class EmployeeUtils {
    // поиск сотрудника в массиве по имени
    public static Employee findName(Employee[] employees, String byName) {
        for (Employee employee : employees) {
            if (employee.getName().equals(byName)) {
                return employee;
            }
        }
        return null;
    }

    //поиск сотрудника в массиве по вхождению указаной строки в его имени

    public static Employee findbySubstring(Employee[] employees, String substring) {
        for (Employee employee : employees) {
            if (employee.getName().contains(substring)) {
                return employee;
            }
        }
        return null;
    }

    // подсчет зарплатного бюджета для всех сотруников в массиве

    public static double getTotalSalsry(Employee[] employees, double total) {
        total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }

    //поиск наименьшей зарплаты в массиве

    public static double minSalary(Employee[] employees) {
        double minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }


    // поиск наибольшей зарплаты

    public static double maxSalary(Employee[] employees) {
        double maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    //поиск наименьшего количества подчиненных в массиве менеджеров

    public static int minSubordinates(Manager[] managers) {
        if (managers.length == 0) {
            System.out.println("Can't return");
            return -1;
        }
        int min = managers[0].getNumberOfSubordinates();
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() < min) {
                min = manager.getNumberOfSubordinates();
            }
        }
        return min;
    }

    //поиск наибольшего количество подчиненных

    public static int maxSubordinates(Manager[] managers) {
        if (managers.length == 0) {
            System.out.println("Can't return");
            return -1;
        }
        int max = managers[0].getNumberOfSubordinates();
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() > max) {
                max = manager.getNumberOfSubordinates();
            }
        }
        return max;

    }

    //поиск наибольшей надбавки в массиве менеджеров

    public static double maxAdd (Manager[] managers){
        double maxAdd = managers[0].getSalary()- managers[0].getBaseSalary() {
            for (Manager manager : managers) {
                double add = manager.getSalary() - manager.getBaseSalary();
                if(add > maxAdd) {
                    maxAdd = add;
                }
            }

            }
        return maxAdd;
    }

    // поиск наименьшей надбавки

    public static double getBonus (Manager managers) {
        return managers.getSalary() - managers.getBaseSalary();
    }

    public static double getMinBonus (Manager[] managers) {
        double minBonus = getBonus(managers[0]);
        for (Manager manager : managers) {
            double bonus = getBonus(manager);
            if (bonus > minBonus) {
                minBonus = bonus;
            }
        }
        return minBonus;
    }
}



