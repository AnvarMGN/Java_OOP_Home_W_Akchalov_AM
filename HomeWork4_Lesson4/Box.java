import java.util.ArrayList;

public class Box <T extends Fruit>{

    private static int count = 0;

    private int id = ++count;

    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit){
        fruits.add(fruit);
    }

    public double getWeight(){
        double sum = 0;
        for (T fruit: fruits){
            sum += fruit.getWeight();
        }
        return sum;
    }

    public boolean compare(Box<? extends Fruit> box){
        if (this.getWeight() == box.getWeight()){
            System.out.println("Коробки одинаковы по весу.");
            return true;
        } else if (this.getWeight() > box.getWeight()){
            System.out.printf("Коробка %s тяжелее чем коробка %s.\n", this.toString(), box.toString());
            return false;
        } else {
            System.out.printf("Коробка %s тяжелее чем коробка %s.\n",box.toString(),this.toString());
            return false;
        }
    }

    public void pourTo(Box<T> box){
        this.fruits.addAll(box.fruits);
        box.fruits.clear();
        System.out.println("Фрукты пересыпали из коробки " + box.toString() + " в коробку " + this.toString() + ".");
    }

    public void showBox(){
        System.out.printf("В коробке %s %d фруктов.\n", id, fruits.size());
    }

    @Override
    public String toString() {
        return "" + id;
    }
}

