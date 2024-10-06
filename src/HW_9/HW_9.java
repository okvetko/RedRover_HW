package HW_9;

public class HW_9 {
    /*Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод -
    getName, метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ”
    если женский.
     */
    public static void main(String[] args) {
        Person person = new Person("John", 22, "male");
        Employee employee = new Employee("Bob", 33, "male", 1000);
        Employee employee1 = new Employee("Bob", 55, "male", 50);

        Employee[] employeeArray = {
                new Employee("Bob", 25, "male", 1000),
                new Employee("Sam", 55, "male", 50),
                new Employee("Kate", 88, "male", 89),
        };

        Salary calculateSalary = new Salary();
        int sumSalary = calculateSalary.getSum(employeeArray);

        System.out.println(person.getName());
        System.out.println(employee.isSameName(employee1));
        System.out.println(sumSalary);



    }

}
