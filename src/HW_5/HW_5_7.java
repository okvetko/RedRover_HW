package HW_5;

public class HW_5_7 {
    public static void main(String[] args) {
        /*Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести количество элементов в массиве.
*/
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i].length;
            }
        System.out.println(result);
        }
    }

