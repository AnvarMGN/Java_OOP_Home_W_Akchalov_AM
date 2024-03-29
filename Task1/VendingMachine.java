package Task1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;


    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                if (((BottleOfWater)product).getVolume()  == volume){
                    return (BottleOfWater)product;
                }
            }
        }
        return null;
    }

    public Chokolate getChokolate(double calories){
        for (Product product : products){
            if (product instanceof Chokolate){
                if (((Chokolate)product).getCalories()  == calories){
                    return (Chokolate)product;
                }
            }
        }
        return null;
    }

}