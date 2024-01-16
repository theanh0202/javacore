package vti.com.frontend;

import vti.com.Utils.ScannerUtils;
import vti.com.backend.controller.DepartmentController;
import vti.com.entity.Department;

import java.util.List;

public class FuncitonDepartment {
    DepartmentController departmentController=new DepartmentController();

    public void getDepartment(){
        List<Department> departmentList=departmentController.getDepartmentServiceList();
        String leftAlignFormat = "| %-3s| %-16s |%n";
        System.out.format("+----+-----------------+---------+%n");
        System.out.format("| id |    department_name        |%n");
        System.out.format("+----+-----------------+---------+%n");
        for (Department department: departmentList ) {
            System.out.format(leftAlignFormat, department.getDepartmentId(), department.getDepartmentName());
        }
        System.out.format("+----+-----------------+------------------------+%n");

    }
    public void createDepartment(){
        System.out.println("nhpa vao ten phong ban");
        String departmentName = ScannerUtils.inputstring();
        while (true){
            if (departmentController.isDepartmentNameExit(departmentName)) {
                System.out.println("phong ban da ton tai");
                departmentName = ScannerUtils.inputstring();
            }else
                break;
        }
        departmentController.
        System.out.println("in moi thanh cong");
    }
}
