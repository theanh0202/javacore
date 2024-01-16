package vti.com.backend.repository;

import vti.com.entity.Department;
import vti.com.Utils.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentReposity {
        public List<Department> getDepartments(){
            String sql="select * from department ";
            Connection connection= JdbcUtils.getConnection();
            List<Department> departmentList=new ArrayList<>();
            try {
                Statement statement= connection.createStatement();
                ResultSet resultSet= statement.executeQuery(sql);
                while (resultSet.next()){
                    Department department=new Department();
                    department.setDepartmentId(resultSet.getInt("Department_id"));
                    department.setDepartmentName(resultSet.getString("Department_name"));
                    departmentList.add(department);
                }
            } catch (SQLException e) {
                System.out.println();
            }finally {
                JdbcUtils.closeConnection();
            }
            return departmentList;
        }
        public boolean isDepartmentNameExit(String name){
            String sql="select * from department where department_name ?";
            Connection connection= JdbcUtils.getConnection();
            try {
                PreparedStatement preparedStatement=connection.prepareStatement(sql);
                preparedStatement.setString(1,name );
                ResultSet resultSet= preparedStatement.executeQuery();
                return resultSet.next();
            }catch (Exception e){
                throw new RuntimeException(e);
            }finally {
                JdbcUtils.closeConnection();
            }
        }
}
