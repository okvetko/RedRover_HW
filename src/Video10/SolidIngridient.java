package Video10;

public class SolidIngridient extends Ingridient {
    public SolidIngridient(String name, double weightInKg){
        super(name, weightInKg + " kg");
    }

    @Override
    public String howToMeasure(){
        return "weight on a scale";
    }
}
