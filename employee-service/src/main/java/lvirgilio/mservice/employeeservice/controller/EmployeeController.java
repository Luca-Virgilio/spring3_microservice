package lvirgilio.mservice.employeeservice.controller;

import lvirgilio.mservice.employeeservice.entity.Employee;
import lvirgilio.mservice.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping()
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping()
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/department/{departmentId}")
    public List<Employee> getEmployeeByDepartmentId(@PathVariable("departmentId") Long departmentId) {
        return employeeService.getEmployeeByDepartmentId(departmentId);
    }

}
