package lvirgilio.mservice.departmentservice.service;

import lvirgilio.mservice.departmentservice.client.EmployeeClient;
import lvirgilio.mservice.departmentservice.entity.Department;
import lvirgilio.mservice.departmentservice.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);

    @Autowired
    private EmployeeClient employeeClient;


    public Department createDepartment(Department department) {
        LOGGER.info("Department add: {}", department);
        departmentRepository.addDepartment(department);
        return department;
    }

    public List<Department> findAllDepartments() {
        LOGGER.info("Department find");
        List<Department> departments = departmentRepository.findAll();
        departments.forEach(dep -> {
            List employees = employeeClient.getEmployeeByDepartmentId(dep.getId());
            dep.setEmployees(employees);
        });
        return departments;
    }

    public Department findById(Long id) {
        LOGGER.info("Department find: id={}", id);
        Department dep = departmentRepository.findById(id);
        List employees = employeeClient.getEmployeeByDepartmentId(id);
        dep.setEmployees(employees);
        return dep;
    }
}
