package vti.com.backend.service;

import vti.com.backend.repository.DepartmentReposity;
import vti.com.entity.Department;

import java.util.List;

public class DepartmentService  implements IDepartmentService    {

    DepartmentReposity departmentReposity=new DepartmentReposity();
    @Override
    public List<Department> getDepartments() {
        return departmentReposity.getDepartments();
    }

    @Override
    public boolean isDepartmentNameExit(String name) {
        return departmentReposity.isDepartmentNameExit(name);
    }

}
