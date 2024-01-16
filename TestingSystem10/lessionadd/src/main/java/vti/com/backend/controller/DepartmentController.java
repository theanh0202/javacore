package vti.com.backend.controller;

import vti.com.backend.service.DepartmentService;
import vti.com.entity.Department;

import java.util.List;

public class DepartmentController {
        DepartmentService departmentService=new DepartmentService();

        public List<Department> getDepartmentServiceList() {
                return departmentService.getDepartments();
        }
        public boolean isDepartmentNameExit(String name){
                return departmentService.isDepartmentNameExit(name);
        }
}
