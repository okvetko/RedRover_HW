package Video10;

import java.net.SocketOption;

public class Cooking {
    public static void main(String[] args) {
        Ingridient potatoes = new SolidIngridient("potatoes", 1.5);

        Ingridient milk = new LiquidIngredient("milk", 100);

        Ingridient[] allIngridients = {potatoes, milk};
        for (Ingridient ingridient : allIngridients) {
            System.out.println(ingridient.howToMeasure() + "" + ingridient.getDescription());
        }


    }
}
