package databases;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Vlad", "23423", "11-15-1992", "$90000");
        emp1.setEmpDOB("11-15-1992");

        System.out.println(emp1.getEmpName());
        System.out.println(emp1.getEmpID());
        System.out.println(emp1.getEmpDOB());
        System.out.println(emp1.getEmpSalary());
    }
}
