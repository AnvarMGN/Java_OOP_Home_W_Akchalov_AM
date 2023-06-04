package HomeWork2_Lesson2;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 5, false);
        Cat cat2 = new Cat("Шумахер", 50, false);
        Cat cat3 = new Cat("Боб", 30, false);
        Cat cat4 = new Cat("Жорка", 100, false);
        Cat cat5 = new Cat("Мурзик", 20, false);
        Cat cat6 = new Cat("Чубайс", 201, false);

        Plate plate1 = new Plate(200);
        
        Cat[] Cats = {
            new Cat("Барсик", 5, false),
            new Cat("Шумахер", 50, false),
            new Cat("Боб", 30, false),
            new Cat("Жорка", 100, false),
            new Cat("Мурзик", 20, false),
            new Cat("Чубайс", 201, false)
        };
        // cat.eat();

        processEat(cat6, plate1);
        System.out.println();

        processCatsEat(Cats, plate1);
        System.out.println();

        plate1.addFood(100);
        plate1.info();
    }

    static void processEat(Cat cat, Plate plate){
        if(cat.getAppetite() > plate.getFood()){
            System.out.println("Котэ остался голодный...");
        }
        else{
            plate.setFood(plate.getFood() - cat.getAppetite());
            cat.setFullness(true);
            System.out.println("Котэ накормлен.\nСытость: " + cat.isFullness());
            plate.info();
        }
    }

    static void processCatsEat(Cat[] cat, Plate plate){
        for (Cat allCats : cat) {
            if(allCats.getAppetite() > plate.getFood()){
                System.out.println(allCats.getName() + " - котэ остался голодный... Сытость: " 
                + allCats.isFullness());
            }
            else{
                plate.setFood(plate.getFood() - allCats.getAppetite());
                allCats.setFullness(true);
                System.out.println(allCats.getName() + " - котэ накормлен. Сытость: " 
                + allCats.isFullness());
                plate.info();
            }
        }
    }
}
