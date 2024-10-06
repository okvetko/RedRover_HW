package Video10;

public class LiquidIngredient extends Ingridient {
    public LiquidIngredient(String name, int volumeInMl) {
        super(name, volumeInMl + " ml");
    }

    @Override
    public String howToMeasure() {
        return "pour into a cup";
    }
}
