package design;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * <p>
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 **/
	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {

		EmployeeInfo emp1 = new EmployeeInfo("Mr. Adams", 1);
		EmployeeInfo emp2 = new EmployeeInfo("Ms. Davis", 2);
		EmployeeInfo emp3 = new EmployeeInfo("Ms. Jones", 3);
		EmployeeInfo emp4 = new EmployeeInfo("Ms. Smith", 4);


		emp1.assignDepartment("Accounting");
		emp2.assignDepartment("Human Resources");
		emp3.assignDepartment("IT");
		emp4.assignDepartment("Sales");


		emp1.setSalary(8000);
		emp1.calculateSalary(emp1.getSalary());

		emp2.setSalary(9000);
		emp2.calculateSalary(emp2.getSalary());

		emp3.setSalary(10000);
		emp3.calculateSalary(emp3.getSalary());

		emp4.setSalary(11000);
		emp4.calculateSalary(emp4.getSalary());


		double bonus1 = EmployeeInfo.calculateEmployeeBonus(emp1.getSalary(), emp1.getBonus());
		emp1.setBonus(1);

		double bonus2 = EmployeeInfo.calculateEmployeeBonus(emp2.getSalary(), emp2.getBonus());
		emp2.setBonus(2);

		double bonus3 = EmployeeInfo.calculateEmployeeBonus(emp3.getSalary(), emp3.getBonus());
		emp3.setBonus(3);

		double bonus4 = EmployeeInfo.calculateEmployeeBonus(emp4.getSalary(), emp4.getBonus());
		emp4.setBonus(4);

		EmployeeInfo.calculateEmployeePension(emp1.getSalary());
		EmployeeInfo.calculateEmployeePension(emp2.getSalary());
		EmployeeInfo.calculateEmployeePension(emp3.getSalary());
		EmployeeInfo.calculateEmployeePension(emp4.getSalary());

		Map<Integer, List<Object>> employeeInfo = new HashMap<>();

		List<Object> employeeRecord1 = new ArrayList<>();
		employeeRecord1.add(emp1.employeeName());
		employeeRecord1.add(emp1.calculateSalary(emp1.getSalary()));
		employeeRecord1.add(bonus1);

		List<Object> employeeRecord2 = new ArrayList<>();
		employeeRecord2.add(emp2.employeeName());
		employeeRecord2.add(emp2.calculateSalary(emp2.getSalary()));
		employeeRecord2.add(bonus2);

		List<Object> employeeRecord3 = new ArrayList<>();
		employeeRecord3.add(emp3.employeeName());
		employeeRecord3.add(emp3.calculateSalary(emp3.getSalary()));
		employeeRecord3.add(bonus3);

		List<Object> employeeRecord4 = new ArrayList<>();
		employeeRecord4.add(emp4.employeeName());
		employeeRecord4.add(emp4.calculateSalary(emp4.getSalary()));
		employeeRecord4.add(bonus4);

		employeeInfo.put(1, employeeRecord1);
		employeeInfo.put(2, employeeRecord2);
		employeeInfo.put(3, employeeRecord3);
		employeeInfo.put(4, employeeRecord4);

		ConnectDB connectDB = new ConnectDB();

		connectDB.createTableFromStringToMySql("employee_record", "employee_id", "employee_info");

		for (Integer obj : employeeInfo.keySet()) {
			for (Object obj1 : employeeInfo.get(obj)) {
				System.out.println(obj1);
				List<String> list1 = new ArrayList<>();
				list1.add(obj.toString());
				list1.add(obj1.toString());
				connectDB.InsertDataFromArrayListToMySql(list1, "employee_record", "employee_id", "employee_info");
			}

		}
		System.out.println("Reading from database");
		List<String> employeeRecord = connectDB.readDataBase("employee_record", "employee_id", "employee_info");
		assert employeeRecord != null;
		for (String emp : employeeRecord) {
			System.out.println(emp);
		}


	}
	private static class ConnectDB {
		public void createTableFromStringToMySql(String employeeRecord, String employeeId, String employeeInfo) {
		}

		public void InsertDataFromArrayListToMySql(List<String> list1, String employeeRecord, String employeeId, String employeeInfo) {
		}

		public List<String> readDataBase(String employeeRecord, String employeeId, String employeeInfo) {
			return null;
		}
	}
}
