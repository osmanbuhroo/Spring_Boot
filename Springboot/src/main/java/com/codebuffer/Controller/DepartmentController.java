package com.codebuffer.Controller;

import com.codebuffer.Entity.Department;
import com.codebuffer.Service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department> fetchDepartment(){
        return departmentService.fetchDepartmentList();
    }
    @GetMapping("/departments/{id}")
    public Department  fetchDepatmentById(@PathVariable("id")Long departmentid){
        return departmentService.fetchDepartmentById(departmentid);
    }
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentid){
        departmentService.deleteDepartmentById(departmentid);
        return "deleted sucessfully............!";
    }
    @PutMapping("/department/{id}")
    public  Department updateDepartment( @PathVariable("id") Long departmentid, @RequestBody Department department) {


        return departmentService.updateDepartment(departmentid, department);
    }
}
