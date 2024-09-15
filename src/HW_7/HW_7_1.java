package HW_7;

public class HW_7_1 {
    public static void main(String[] args) {
        int result = sum(10, 15);
        System.out.println(result);
        int result2 = deduction(5, 7);
        System.out.println(result2);
        System.out.println(mult(4, 5));
        System.out.println(dev(8, 2));


        }
    public static int sum(int a, int b){
        int result = a + b;
        return result;}


    public static int deduction(int c, int d){
        int result2 = c - d;
        return result2;
        }

    public  static  int mult(int s, int z){
        int result = s * z;
        return result;
    }

    public static int dev(int e, int z){
        int result = e/z;
        return result;
    }

}
