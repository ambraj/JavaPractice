package corejava.collections;

import java.util.*;

/**
 * | id |  name  |  company  |
 * ---------------------------
 * |  1 | Ambuj  |   Sopra   |
 * |  2 | Rashmi | IndiaMart |
 */
public class EmployeeDatabaseUsingCollection {
    public static void main(String[] args) {
        EmployeeResource empResource = new EmployeeResource();

        empResource.addEmployee(new Employee(1, "Ambuj", "Sopra"));
        empResource.addEmployee(new Employee(2, "Rashmi", "IndiaMart"));
        empResource.addEmployee(new Employee(3, "John", "OpenBet"));

        //        List<Employee> result = empService.findById(3);
        List<Employee> result = empResource.findAll();
        result.forEach(emp -> System.out.println(emp));

//        parseSql("select id,emp from employee where name='Ambuj'");

    }

}

class EmployeeDatabaseService {
    private EmployeeResource empResource;

    public EmployeeDatabaseService(EmployeeResource empResource) {
        this.empResource = empResource;
    }

    public List<Employee> runQuery(String sqlQuery) {
        List<String> tokens = Arrays.asList(parseSql(sqlQuery.toUpperCase()));

        return null;
    }

    public String parseSql(String sqlString) {
        StringTokenizer st = new StringTokenizer(sqlString);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        return null;
    }
}

class EmployeeResource {
    private List<Employee> empList = new ArrayList<>();

    public List<Employee> findAll() {
        return empList;
    }

    public List<Employee> findById(int id) {
        List<Employee> tempEmpList = new ArrayList<>();
        Iterator<Employee> itr = empList.iterator();
        while (itr.hasNext()) {
            Employee emp = itr.next();
            if (emp.getId() == id) {
                tempEmpList.add(emp);
            }
        }
        return tempEmpList;
    }

    public void addEmployee(Employee emp) {
        empList.add(emp);
    }
}

class Employee {
    private int id;
    private String name;
    private String company;

    public Employee(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", company='" + company + '\'' + '}';
    }
}