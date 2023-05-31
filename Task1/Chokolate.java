package Task1;

public class Chokolate extends Product {
    double calories;
    double percentOfChok;

    public double getCalories() {
        return calories;
    }
    public void setCalories(double calories) {
        this.calories = calories;
    }
    public double getPercentOfChok() {
        return percentOfChok;
    }
    public void setPercentOfChok(double percentOfChok) {
        this.percentOfChok = percentOfChok;
    }

    public Chokolate(String brand, String name, double price, double calories, double percentOfChok) {
        super(brand, name, price);
        this.calories = calories;
        this.percentOfChok = percentOfChok;
    }
    @Override
    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %f - [Процент содеражания шоколада: %f; калории: %f]", brand, name, price, percentOfChok, calories);
    }

    

    


    
}
