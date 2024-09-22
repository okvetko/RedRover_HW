package HW_6;

public class Employee {
    double baseSalary;
    String name;


    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public double getSalary() {
        return getBaseSalary();
    }
}

