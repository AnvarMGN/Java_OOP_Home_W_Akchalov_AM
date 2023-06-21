
public class Student extends Worker {

    public Student(String name, String vacancy) {
        this.name = name;
        this.nameVacancy = vacancy;
        minSalary = random.nextDouble(10000, 15000);
        hasJob = false;
    }

    @Override
    public String toString() {
        return "Студент";
    }
}