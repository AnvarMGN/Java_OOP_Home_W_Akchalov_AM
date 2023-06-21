import java.util.Random;

public class Program {

    /**
     * TODO: 1. Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить свой собственный тип/типы соискателя.
     *  2**. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  3**. Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", jobAgency);
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);

        jobAgency.registerObserver(new Master("Galkin", "Разработчик"));
        jobAgency.registerObserver(new Master("Ivanov", "Аналитик"));
        jobAgency.registerObserver(new Developer("Laptov", "Product-менеджер"));
        jobAgency.registerObserver(new Developer("Kravcov", "Product-менеджер"));
        jobAgency.registerObserver(new Student("Laptov", "Тестировщик"));
        jobAgency.registerObserver(new Student("Fomin", "Тестировщик"));

        for (int i = 0; i < 5; i++){
            geekBrains.needEmployee(VacancyType.Analyst, randomSalary(50000, 100000));
            google.needEmployee(VacancyType.Developer, randomSalary(80000, 300000));
            google.needEmployee(VacancyType.ProductManager, randomSalary(150000, 500000));
            yandex.needEmployee(VacancyType.Tester, randomSalary(50000, 150000));

            System.out.println();
        }
    }

    static double randomSalary(double min, double max){
        Random random = new Random();
        return random.nextDouble(min, max);
    }

}
