package HW_7;

public class HW_7_2_4 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 20, -5};
        System.out.println(findSmallestInt(arr));
    }
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 0; i < args.length; i++) {
            if(min > args[i]){
                min = args[i];
            }

        }
        return min;
    }
}
