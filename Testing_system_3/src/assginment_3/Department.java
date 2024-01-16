package assginment_3;

public class Department {
    int departmentId;
    String departmentName;
    public Department(int departmentId ){
        this.departmentId=departmentId;
    }
    public Department(int departmentId,String departmentName ){
        this.departmentName=departmentName;
    }
    public Department()
    @Override
    public String toString() {
        return "Department234{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
