package HW_5;

public class HW_5_3_2 {
    public static void main(String[] args) {
        /*Задача №2

0  1  2  3  4  5  6  7  8  9
    0  1  2  3  4  5  6  7  8
        0  1  2  3  4  5  6  7
             0  1  2  3  4  5  6
                 0  1  2  3  4  5
                     0  1  2  3  4
                         0  1  2  3
                             0  1  2
                                 0  1
                                     0
*/

        int n = 10;  // Количество строк в треугольнике
        for (int i = 0; i < n; i++) {
            // Печатаем пробелы
            for (int j = 0; j <= i; j++)
            {
                System.out.print(" ");
            }
            // Печатаем цифры
            for (int j = 0; j < n - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}




