package HW_8;

public class HW_8_1 {
    public static void main(String[] args) {
        System.out.println(numberToText(444));
    }
    public static String numberToText (int number){

        String[] words = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};

        char[] digitChars = String.valueOf(number).toCharArray(); //char[]

        String result = "";
        String separator = "";
         for (char digitChar: digitChars) {
            int digitInt = Integer.parseInt(String.valueOf(digitChar));
            String word = words[digitInt];
            result += separator + word;
            separator = " ";

        }
        return result;
    }
}
