package task2;

// 20 * 8

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания
 */
public class Freelancer extends Employee {

    double workHours = 4;

    public double getWorkHours() {
        return workHours;
    }
    
    public Freelancer(String name, String surname, double salary, int age) {
        super(name, surname, salary, age);
    }

    @Override
    public double calculateSalary(){
        return salary * workHours;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Заработная плата (почасовая): %.2f (руб.); Возраст: %o",
        surname, name, calculateSalary(), age);
    }
}
