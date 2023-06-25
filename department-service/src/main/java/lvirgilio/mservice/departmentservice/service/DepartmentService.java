package lvirgilio.mservice.departmentservice.service;

import lvirgilio.mservice.departmentservice.controller.DepartmentController;
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


    public Department createDepartment(Department department) {
        LOGGER.info("Department add: {}", department);
         departmentRepository.addDepartment(department);
            return department;
    }

    public List<Department> findAllDepartments() {
        LOGGER.info("Department find");
        return departmentRepository.findAll();
    }

    public Department findById(Long id) {
        LOGGER.info("Department find: id={}", id);
        return departmentRepository.findById(id);
    }
}
