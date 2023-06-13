
public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {

        Box<Apple> apples = new Box<>();
        Box<Orange> oranges = new Box<>();

        for (int i = 0; i < 10; i++) {
            apples.addFruit(new Apple());
        }
        for (int i = 0; i < 5; i++) {
            oranges.addFruit(new Orange());
        }
        apples.showBox();
        oranges.showBox();
        System.out.printf("Вес коробки %s: %.2f f.\n", apples.toString(), apples.getWeight());
        System.out.printf("Вес коробки %s: %.2f f.\n", oranges.toString(), oranges.getWeight());

        apples.compare(oranges);
        System.out.println();

        Box<Orange> box = new Box<>();
        for (int i = 0; i < 10; i++) {
            box.addFruit(new Orange());
        }

        box.showBox();
        box.pourTo(oranges);
        box.showBox();
        oranges.showBox();
        System.out.printf("Вес коробки %s: %.2f f.\n", box.toString(), box.getWeight());

    }

}


