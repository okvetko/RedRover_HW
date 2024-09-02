package HW_3;

public class HW_3_2_2 {
    public static void main(String[] args) {
        /*
        Необходимо вывести все положительные степени числа 5 которые меньше 10000,
        вывести результат возведения в степень.

         */
        int base = 5;
        for (int i = 1; ; i++) {
            if( base < 10000){
                base = base * 5;
                System.out.println(i);
            }
            }

        // второй вариант
//        for (int i = 0; i < 10000; i = i * 5) {
//            System.out.println(i);

        }
        }


    }
