
public class Developer extends Worker{

    public Developer(String name, String vacancy) {
        this.name = name;
        this.nameVacancy = vacancy;
        minSalary = random.nextDouble(100000, 300000);
        hasJob = false;
    }

    @Override
    public String toString() {
        return "Разработчик";
    }
}
