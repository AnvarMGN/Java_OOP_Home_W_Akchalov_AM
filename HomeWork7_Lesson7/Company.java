
public class Company {

    private String companyName;

    private Publisher jobAgency;

    public Company(String companyName, Publisher jobAgency) {
        this.companyName = companyName;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(VacancyType nameVacancy, double maxSalary){
        Vacancy vacancy = new Vacancy(nameVacancy, maxSalary);
        jobAgency.sendOffer(companyName, vacancy);
    }
}