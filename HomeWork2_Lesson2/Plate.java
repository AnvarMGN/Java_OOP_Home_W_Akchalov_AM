package HomeWork2_Lesson2;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }
    
    public void info(){
        System.out.println("В тарелке осталось: " + food);
    }

    public void addFood(int food){
       this.food += food;
       System.out.println("Насыпим корма котейкам: + " + food);
    }

}
