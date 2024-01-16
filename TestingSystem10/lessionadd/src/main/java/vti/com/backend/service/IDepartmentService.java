package vti.com.backend.service;

import vti.com.entity.Department;

import java.util.List;

public interface IDepartmentService {
    List<Department> getDepartments();
    boolean isDepartmentNameExit(String name);


}
