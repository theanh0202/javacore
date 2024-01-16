package com.vti.backend.repository;

import com.vti.Utils.JdbcUtils;
import com.vti.entity.Department;
import com.vti.entity.Role;
import com.vti.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;

public class UserRepository {
    public User login(String username, String password) {
        String sql = "SELECT * FROM assignment10.user where email = ? and password = ?";
        try {
            Connection connection= JdbcUtils.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                User user = new User();
                user.setUserName(username);
                user.setEmail(resultSet.getString("email"));
                String roleString = resultSet.getString("role");//Tra ve chuoi admin hoac user
                user.setRole(Role.valueOf(roleString));
                return user;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            JdbcUtils.closeConnection();
        }
        return null;
    }

    public List<User> getAllUser() {
        List<User> userList = new ArrayList<>();
        String sql = "SELECT * FROm assignment10.user " +
                " LEFT JOIN department d on d.department_id = user.department_id";
        Connection connection = JdbcUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                User user = new User();
                Department department = new Department();
                user.setId(resultSet.getInt("id"));
                String roleString = resultSet.getString("role");
                user.setRole(Role.valueOf(roleString));
                user.setUserName(resultSet.getString("username"));
                user.setEmail(resultSet.getString("email"));
                user.setDateOfBirth(resultSet.getString("date_of_birth"));
                department.setDepartmentName(resultSet.getString("department_name"));
                user.setDepartment(department);
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeConnection();
        }
        return userList;
    }

    public User findUserById(int id) {
        String sql = "SELECT * FROm assignment10.user " +
                " LEFT JOIN department d on d.department_id = user.department_id where id=?";
        Connection connection = JdbcUtils.getConnection();
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setInt(1, id);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            if (resultSet.next()) {
//                User user = new User();
//                Department department = new Department();
//                user.setId(resultSet.getInt("id"));
//                String roleString = resultSet.getString("role");
//                user.setRole(Role.valueOf(roleString));
//                user.setUserName(resultSet.getString("username"));
//                user.setEmail(resultSet.getString("email"));
//                user.setDateOfBirth(resultSet.getString("date_of_birth"));
//                department.setDepartmentName(resultSet.getString("department_name"));
//                user.setDepartment(department);
//                return user;
//            }
//        } catch (SQLException e) {
//            System.err.println(e.getMessage());
//            ;
//        } finally {
//            JdbcUtils.closeConnection();
//        }
//        Connection connection = JdbcUtils.getConnection();
        String callProcedure = "{CALL get_user_by_id(?)}"; // Tên thủ tục lưu trữ và tham số
        try {
            if (connection != null) {
                CallableStatement callableStatement = connection.prepareCall(callProcedure);
                callableStatement.setInt(1, id); // Đặt giá trị cho tham số đầu vào
                ResultSet resultSet = callableStatement.executeQuery();
                if (resultSet.next()) {
                    User user = new User();
                    user.setId(resultSet.getInt("id"));
                    String roleString = resultSet.getString("role");
                    user.setRole(Role.valueOf(roleString));
                    user.setUserName(resultSet.getString("username"));
                    user.setEmail(resultSet.getString("email"));
                    user.setDateOfBirth(resultSet.getString("date_of_birth"));
                    // Đọc các thông tin khác của người dùng từ ResultSet nếu cần
                    return user;
                }
                callableStatement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeConnection();
        }
        return null;
    }
    public List<User> findUser(String key) {
        List<User> userList = new ArrayList<>();
        key = "%" + key + "%";
        String sql = "SELECT * FROm assignment10.user " +
                " LEFT JOIN department d on d.department_id = user.department_id where user.username like ? or user.email like ?";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, key);
            preparedStatement.setString(2, key);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                User user = new User();
                Department department = new Department();
                user.setId(resultSet.getInt("id"));
                String roleString = resultSet.getString("role");
                user.setRole(Role.valueOf(roleString));
                user.setUserName(resultSet.getString("username"));
                user.setEmail(resultSet.getString("email"));
                user.setDateOfBirth(resultSet.getString("date_of_birth"));
                department.setDepartmentName(resultSet.getString("department_name"));
                user.setDepartment(department);
                userList.add(user);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            ;
        } finally {
            JdbcUtils.closeConnection();
        }
        return userList;
    }


    public void deleteUserById(int id) {
        String sql = "delete from assignment10.user U where u.id=?";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
            if (rs == 0) {
                System.out.println("xoa that bai");
            } else {
                System.out.println("da xoa" + rs + "ban gi");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            JdbcUtils.closeConnection();
        }
    }

    public void updateUser(int id, String oldPassWord, String newPassWord) {
        String sql = "UPDATE assignment10.user SET password =? where id= ? and password =?";
        try {
            Connection connection = JdbcUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newPassWord);
            preparedStatement.setInt(2, id);
            preparedStatement.setString(3, oldPassWord);
            preparedStatement.executeUpdate();
            int rs = preparedStatement.executeUpdate();
            if (rs == 0) {
                System.err.println("thay doi that bai");
            } else {
                System.out.println("thay doi thanh cong");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        JdbcUtils.closeConnection();

    }
    public void createUser(String userName,String email, String birthdate , int departmentid){
        String sql="INSERT INTO `assignment10`.`User` (`role`, `username`, `password`, `email`, `date_of_birth`, department_id)" +
                "VALUES ('ADMIN', ?, '123456', ?, ?, ?)";
        Connection connection=JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, birthdate);
            preparedStatement.setInt(4,departmentid);
            preparedStatement.executeUpdate();
            int rs = preparedStatement.executeUpdate();
            if (rs == 0) {
                System.err.println("them moi khong thanh cong ");
            } else {
                System.out.println("da them moi" + rs + " user");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        JdbcUtils.closeConnection();

    }
    public List<Department> getAllDepartment(){
        List<Department> departmentList=new ArrayList<>();
        String sql = "SELECT * FROm assignment10.department " ;
        Connection connection = JdbcUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Department department = new Department();
                department.setDepartmentId(resultSet.getInt("department_id"));
                department.setDepartmentName(resultSet.getString("department_name"));
                departmentList.add(department);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        } finally {
            JdbcUtils.closeConnection();
        }
        return departmentList;
    }
    public Department findDepartmentById(int id){
        String sql="select * from assignment10.department where department_id = ? ";
        Connection connection=JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet resultSet= preparedStatement.executeQuery();
            if (resultSet.next()){
                Department department=new Department();
                department.setDepartmentId(resultSet.getInt("department_id"));
                department.setDepartmentName(resultSet.getString("department_name"));
                return department;
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }finally {
            JdbcUtils.closeConnection();
        }
        return null;
    }
    public List<Department> findDepartment(String key){
        List<Department> departmentList=new ArrayList<>();
        key= "%" +key + "%";
        String sql="select * from assignment10.department where department_name like ?";
        Connection connection=JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,key);
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()){
                Department department=new Department();
                department.setDepartmentId(resultSet.getInt("department_id"));
                department.setDepartmentName(resultSet.getString("department_name"));
                departmentList.add(department);
            }

        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        finally {
            JdbcUtils.closeConnection();
        }
        return departmentList;
    }
    public void deleteDepartmentById(int id){
        String sql="delete from assignment10.department d where d.id=? ";
        Connection connection=JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            int rs = preparedStatement.executeUpdate();
            if(rs==0){
                System.err.println("xoa that bai !");
            }else {
                System.out.println("xoa thanh cong" + rs + "ban gi");
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }finally {
            JdbcUtils.closeConnection();
        }
    }
    public void updateDepartment(int id , String newDepartmentName){
        String sql = "UPDATE assignment10.department SET department_name =? where department_id= ? and department_name =?";
        Connection connection=JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,newDepartmentName);
            int rs= preparedStatement.executeUpdate();
            if (rs==0){
                System.err.println("thay doi that bai");
            }else {
                System.out.println("thay doi thanh cong");
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }finally {
            JdbcUtils.closeConnection();
        }
    }
    public void createDepartment( String departmentName){
        String sql = "INSERT INTO `assignment10`.`Department` (`department_name`) VALUES (?)";
        Connection connection=JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,departmentName);
            int rs= preparedStatement.executeUpdate();
            if (rs==0){
                System.out.println("them moi that bai");
            }else {
                System.out.println("them moi than h cong");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            JdbcUtils.closeConnection();
        }
    }
}

