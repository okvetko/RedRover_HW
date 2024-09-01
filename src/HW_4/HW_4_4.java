package HW_4;
import java.util.Arrays;
public class HW_4_4 {
    /*Дан массив из десяти произвольных целых чисел (например, { 1, 2, …, 9, 10 } )

Необходимо изменить порядок элементов массива на противоположный (т.е. чтобы получилось { 10, 9, …, 2, 1 } ). Не НАПЕЧАТАТЬ в обратном порядке, а переставить элементы массива.
*/
    public static void main(String[] args) {
        int[] array = {7, 3, 8, 41, 5, 6, 7, 81, 55, 10};

        for (int i = 0; i < array.length/2; i++) {
         int temp = array[i];
         array[i] = array[array.length-1 - i];
         array[array.length-1 - i] = temp;


        }
        System.out.println(Arrays.toString(array));
    }
}
