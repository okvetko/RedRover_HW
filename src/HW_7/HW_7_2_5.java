package HW_7;

import java.beans.PropertyEditorSupport;

public class HW_7_2_5 {
    public static void main(String[] args) {
countingSheep(1);
    }
    public static String countingSheep(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            result += i + " sheep...";

            }

        return result;
    }
}
