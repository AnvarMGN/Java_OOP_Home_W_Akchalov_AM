
public enum VacancyType {
    Developer("Разработчик"),
    Tester("Тестировщик"),
    Analyst("Аналитик"),
    ProductManager("Product-менеджер");

    private String vacancy;
    
    VacancyType(String vacancy) {
        this.vacancy = vacancy;
    }

    public String getVacancy() {
        return vacancy;
    }
}
