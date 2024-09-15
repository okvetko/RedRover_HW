package HW_5;

public class HW_5_1_3 {
    public static void main(String[] args) {
        /*Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.
*/
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(result > array[i]){
                result=array[i];
            }
        }
        System.out.println(result);
    }
}
