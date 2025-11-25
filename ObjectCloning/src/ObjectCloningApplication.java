
class Employee implements Cloneable{
    private int empId;

    private String empName;

    private String empAddress;

    public Employee(int empId, String empName, String empAddress) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }
}
public class ObjectCloningApplication {
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee employee=new Employee(1,"vivek","pune");

        Employee employee1= (Employee) employee.clone();

        System.out.println(employee1);

    }

}
