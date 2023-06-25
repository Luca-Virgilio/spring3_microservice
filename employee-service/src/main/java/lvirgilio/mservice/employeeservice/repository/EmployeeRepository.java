package lvirgilio.mservice.employeeservice.repository;

import lvirgilio.mservice.employeeservice.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    private List<Employee> employees = new ArrayList<>();

    //add employee
    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    //get all employees
    public List<Employee> getAllEmployees() {
        return employees;
    }

    //get employee by id
    public Employee getEmployeeById(Long id) {
        return employees.stream().filter(employee -> employee.id().equals(id)).findFirst().get();
    }

    //get employee by department id
    public List<Employee> getEmployeeByDepartmentId(Long departmentId) {
        return employees.stream().filter(employee -> employee.departmentId().equals(departmentId)).toList();
    }

}
