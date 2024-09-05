package HW_5;

public class HW_5_1 {
    public static void main(String[] args) {
        /*Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести сумму всех значений массива.
*/
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];


        }
        System.out.println(result);
    }
}
