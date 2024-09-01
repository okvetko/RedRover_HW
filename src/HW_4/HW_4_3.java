package HW_4;

public class HW_4_3 {
    /*Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо увеличить все значения массива на 15.
*/
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 15;
            System.out.println(array[i]);
        }

    }
}
