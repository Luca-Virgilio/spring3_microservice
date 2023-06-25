package lvirgilio.mservice.departmentservice.controller;

import lvirgilio.mservice.departmentservice.entity.Department;
import lvirgilio.mservice.departmentservice.repository.DepartmentRepository;
import lvirgilio.mservice.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department addDepartment(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }

    @GetMapping("/")
    public List<Department> findAll() {
        return departmentService.findAllDepartments();
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id) {
        return departmentService.findById(id);
    }

    @GetMapping("/test")
    public boolean test() {
        return true;
    }


}
