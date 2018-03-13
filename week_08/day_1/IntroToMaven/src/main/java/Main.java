import db.DBEmployee;
import models.Employee;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Jack Jarvis", 25000);
        Employee employee2 = new Employee("Victor McDade", 25000);
        DBEmployee.save(employee1);
        DBEmployee.save(employee2);
        List<Employee> foundEmployees = DBEmployee.getEmployees();
    }

}
