package employeenumsix;

public class EmployeeMain {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee("RmenJhyd Glodobe", "Senior Software Developer", 100000.0);

        updateSalary(employee1, 150000);

        System.out.println(calculateSalary(employee1, 2));
    }

    // redundant, wala ko kasabot sa instruction medyo 
    public static void updateSalary(Employee employee, double newSalary){
        employee.setSalary(newSalary);
    }

    public static double calculateSalary(Employee employee, int months){
        double salary = employee.getSalary();

        return salary * months;
    }
}
