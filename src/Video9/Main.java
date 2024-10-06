package Video9;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {


        Person person2 = new Person();
        person2.setName("Anna");

        Worker worker = new Worker();
        worker.setName("Sergey");

        System.out.println(worker.getAge());
        System.out.println(worker.getName());
    }
}
