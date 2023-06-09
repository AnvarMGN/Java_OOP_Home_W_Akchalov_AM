package task2;

import java.util.Comparator;

/**
 * AgeSalaryComparator
 */
public class AgeSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int resalt = o1.age - o2.age;
        if(resalt == 0){
            return Double.compare(o1.calculateSalary(), o2.calculateSalary());
            //return o1.calculateSalary() == o2.calculateSalary() ? 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
        }
        return resalt;
    }
}