package employee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeDao {

    public static List<Employee> getEmployeesList(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Ali", "IT", BigDecimal.valueOf(10000)));
        employees.add(new Employee(2, "Veli", "Call Center", BigDecimal.valueOf(20000)));
        employees.add(new Employee(3, "Ahmet", "IT", BigDecimal.valueOf(30000)));
        employees.add(new Employee(4, "Mehmet", "HR", BigDecimal.valueOf(40000)));
        employees.add(new Employee(5, "Huseyin", "IT", BigDecimal.valueOf(50000)));

        return employees;
    }

    public static List<Employee> getRandomEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        for(int i = 1; i <= 1000; i++ ){
            employeeList.add(new Employee(i, "employee"+i , "department", BigDecimal.valueOf(new Random().nextInt(1000 * 100))));
        }
        return employeeList;
    }
}
