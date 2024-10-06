package HW_9;

public class Salary {
    /*Необходимо создать класс Salary с единственным методом -
    getSum(Employee[] employeeArray), метод должен возвращать сумму
    зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
     */

    public int getSum(Employee[] employeeArray) {
        int salary = 0;
        for(Employee salarys : employeeArray) {
            salary += salarys.getSalary();
        }
        return salary;
    }
}
