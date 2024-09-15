package HW_7;

public class HW_7_2_2 {
    public static void main(String[] args) {
        System.out.println(isLove(4, 3));


    }
    public static boolean isLove(final int flower1, final int flower2) {
        boolean result;
        if(flower1 % 2 == 0 && flower2 % 2 == 0){
            return false;
        }
        else if ((flower1 % 2 == 0 && flower2 % 2 != 0)|| (flower1 % 2 != 0 && flower2 % 2 == 0)){
            return true;
        }
return result = false;
    }


}
