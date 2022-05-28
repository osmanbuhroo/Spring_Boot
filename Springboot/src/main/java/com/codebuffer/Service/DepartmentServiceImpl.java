package com.codebuffer.Service;

import com.codebuffer.Entity.Department;
import com.codebuffer.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentid) {
        return departmentRepository.findById(departmentid).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentid) {
        departmentRepository.deleteById(departmentid);
    }

    @Override
    public Department updateDepartment(Long departmentid, Department department) {
        Department departmentdatabase = departmentRepository.findById(departmentid).get();
        if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
            departmentdatabase.setDepartmentName((department.getDepartmentName()));
        }


        if (Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            departmentdatabase.setDepartmentAddress((department.getDepartmentAddress()));
        }

        if (!(!Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(String.valueOf(department.getDepartmentCode())))) {
            departmentdatabase.setDepartmentCode((department.getDepartmentCode()));
        }
                return departmentRepository.save(department);

    }

}
