package HW_9;

public class Person {

    private String  name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName(){
        if(sex.equals("male")) {
            name = "Mr. " + name;
        }
        else if (sex.equals("female")) {
            name = "Mrs. " + name;
        }
         return name;

    }


    }
