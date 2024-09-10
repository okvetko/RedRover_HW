package HW_6;

public class Manager {
    int numberOfSubordinates;
    int salary;
    int baseSalary;
    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }
    public int setNumberOfSubordinates(int numberOfSubordinates){
        numberOfSubordinates = 10;
    }
    public int getSalary(int baseSalary){
        baseSalary = 50;
        salary = baseSalary * numberOfSubordinates/100 * 3;
        if(numberOfSubordinates == 0){
            salary = baseSalary;
        }
    }
}
