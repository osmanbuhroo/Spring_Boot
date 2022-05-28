package com.codebuffer.Service;

import com.codebuffer.Entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

  public  List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentid);

   public  void deleteDepartmentById(Long departmentid);

    Department updateDepartment(Long departmentid, Department department);
}
