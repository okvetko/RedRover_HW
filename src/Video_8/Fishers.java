package Video_8;

import javax.print.attribute.standard.PresentationDirection;

public class Fishers {
    public static void main(String[] args) {


        Catch[] allCatches = {
                makeCatch("John", "Sturgeon", 20, false),
                makeCatch("Bob", "Salmon", 15, false),
                makeCatch("Peter", "Salmon", 17, true)
        };
        printArray(allCatches);
        System.out.println(totalWeight(allCatches, "Salmon", 1));
        System.out.println(totalWeight(allCatches, "Sturgeon", 2));
        System.out.println(totalWeight(allCatches, "Trout", 0.5));

        MinMaxCatches records = getMinAndMax(allCatches);
        System.out.println("Congrats " + records.maxCatch.fisher + " for " + records.maxCatch.weight + " kg "
                + records.maxCatch.fishKind);

        System.out.println("Shame " + records.minCatch.fisher + " for " + records.minCatch.weight + " kg "
                + records.minCatch.fishKind);
    }
    
    static void printArray(Catch[] arr){
        for (Catch aCatch: arr) {
            System.out.println(aCatch.makeString());
        }
    }

    static double totalWeight(Catch[] catches, String fishKind, double multiplier){
        double weight = 0;
        for (int i = 0; i < catches.length; i++) {
            Catch elem = catches[i];
            if (elem.fishKind.equals(fishKind) && !elem.released) {
                weight += elem.weight;
            }

        }
        return weight * multiplier;
    }
    static Catch makeCatch(String fisher, String fishKind, double weight, boolean released) {
        Catch c = new Catch();
        c.fisher = fisher;
        c.fishKind = fishKind;
        c.weight = weight;
        c.released = released;
        return c;
    }

    static MinMaxCatches getMinAndMax(Catch[] catches) {
        MinMaxCatches result = new MinMaxCatches();
        for (Catch element: catches) {
            if (result.maxCatch == null || element.weight > result.maxCatch.weight) {
                result.maxCatch = element;
            }
            if (result.minCatch == null || element.weight < result.minCatch.weight) {
                result.minCatch = element;
            }
        }
        return result;
    }
}
