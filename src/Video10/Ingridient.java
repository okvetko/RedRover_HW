package Video10;

public abstract class Ingridient {
    private final String  name;
    private final String amount;




    public Ingridient(String name, String amount){
        this.name = name;
        this.amount = amount;
       }

    public String getName(){
        return name;
    }

    public String getAmount(){
        return amount;
    }


    public String getDescription(){
        return amount + " of" + name;
    }

    public abstract String howToMeasure();
}


