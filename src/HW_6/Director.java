package HW_6;

public class Director {
    double baseSalary;
    String name;
    int numberOfSubordinates;


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

    public int getNumberOfSubordinates(){
        return getNumberOfSubordinates();
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary() {
        return getBaseSalary() * getNumberOfSubordinates() / 100 * 9;
    }
}
