package lvirgilio.mservice.employeeservice.service;

import lvirgilio.mservice.employeeservice.entity.Employee;
import lvirgilio.mservice.employeeservice.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);

    public Employee createEmployee(Employee employee) {
        LOGGER.info("create Employee{} ", employee);
        return employeeRepository.addEmployee(employee);
    }

    public Employee getEmployeeById(Long id) {
        LOGGER.info("geet Employee by id{} ", id);
        return employeeRepository.getEmployeeById(id);
    }

    public List<Employee> getAllEmployees() {
        LOGGER.info("Inside getAllEmployees");
        return employeeRepository.getAllEmployees();
    }

    public List<Employee> getEmployeeByDepartmentId(Long departmentId) {
        LOGGER.info("getEmployeeBy DepartmentId {} ", departmentId);
        return employeeRepository.getEmployeeByDepartmentId(departmentId);
    }

}
