package HomeWork2_Lesson2;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public boolean isFullness() {
        return fullness;
    }
    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void infoCat(){
        System.out.println("Имя котэ: " + name + ", Аппетит котэ: " + appetite + ", Сыт ли котэ? - " + fullness);
    }
    
    public void eat(){

    }
    
}

