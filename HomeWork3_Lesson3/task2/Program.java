package task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */
    static Employee generateEmployee(){// замена типа на Employee
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(20000, 80000);
        int age = random.nextInt(18, 20);// генератор возраста

        Worker workers = new Worker(names[random.nextInt(3)], surnames[random.nextInt(surnames.length)], salary, age);
        Freelancer freelancers = new Freelancer(names[random.nextInt(10)], surnames[random.nextInt(surnames.length)], salary, age);
        
        int anyNumber = random.nextInt(2);// случайное число 0 или 1
        if (anyNumber == 0) { 
            return workers;
        }
        else{
            return freelancers;
        }
    }


    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *   Придумать несколько Comparator'ов для сортировки сотрудников
     *   по фамилии + имени или по возрасту + уровню зп.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
        {
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees); // Имя + Зарплата или Имя + Фамилия

        // AgeSalaryComparator ageSalaryComparator = new AgeSalaryComparator();
        // Arrays.sort(employees, ageSalaryComparator);// Возраст + Зарплата

        for (Employee employee: employees) {
            System.out.println(employee);
        }

    }

}
