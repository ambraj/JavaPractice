package corejava.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeApp {
    private static List<Employee> empList = new ArrayList<Employee>();

    public static void main(String[] args) {
        empList.add(new Employee(111, "John", 25, "Male", "Dev", 2012, 10000));
        empList.add(new Employee(111, "Malta", 34, "Female", "HR", 2000, 100100));
        empList.add(new Employee(111, "Piku", 56, "Female", "Testing", 2010, 1000));
        empList.add(new Employee(111, "Sopa", 23, "Male", "Accounts", 2016, 100100));
        empList.add(new Employee(111, "Lepa", 45, "Female", "Dev", 2015, 50000));
        empList.add(new Employee(111, "Tepa", 34, "Male", "Dev", 2010, 40000));
        empList.add(new Employee(111, "Nupa", 45, "Female", "Accounts", 2005, 130000));
        empList.add(new Employee(111, "Thappa", 45, "Female", "HR", 2020, 20000));
        empList.add(new Employee(111, "Rappa", 45, "Female", "Testing", 2018, 10000));
        empList.add(new Employee(111, "Kuppa", 23, "Male", "Dev", 2012, 1001));

        // 1. How many Males and Females are there in the organization?
        System.out.println(empList.stream()
                .collect(Collectors.groupingBy(emp -> emp.getGender(), Collectors.counting())));

        // 2. Print the name of all departments in the organization?
        empList.stream()
                .map(emp -> emp.getDepartment())
                .distinct()
                .forEach(System.out::println);

        // 3. What is the average age of male and female employees?
        System.out.println(empList.stream()
                .collect(Collectors.groupingBy(emp -> emp.getGender(), Collectors.averagingInt(emp -> emp.getAge()))));

        // 4. Get the details of highest paid employee in the organisation?
        System.out.println(empList.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(emp -> emp.getSalary())))
                .map(emp -> emp.getName())
                .get());

        // 5. Get the names of all employees who have joined after 2015?
        System.out.println(empList.stream()
                .filter(emp -> emp.getYearOfJoining() > 2015)
                .map(emp -> emp.getName())
                .collect(Collectors.toList()));

        // 6. Count the number of employees in each department?
        System.out.println(empList.stream()
                .collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.counting())));

        // 7. What is the average salary of each department?
        System.out.println(empList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary))));

        // 8. Get the details of youngest male employee in the "HR" department:
        System.out.println(empList.stream()
                .filter(emp -> emp.getGender().equals("Male") && emp.getDepartment().equals("Dev"))
                .min(Comparator.comparingInt(Employee::getAge)));

        // 9. Who has the most working experience in org?
        System.out.println(empList.stream()
                .min(Comparator.comparingInt(Employee::getYearOfJoining))
                .get().getName());

        // 10. Total salary of whole org?
        System.out.println(empList.stream()
                .collect(Collectors.summingDouble(Employee::getSalary)));

        // 11. List down names of all employees in each department?
        System.out.println(empList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment)));
    }
}
