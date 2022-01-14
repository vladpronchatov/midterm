package design;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static databases.ConnectToSqlDB.connectToSqlDatabase;

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
		emp4.setSalary(7000);
		emp4.calculateSalary(emp4.getSalary());


		double bonus1 = EmployeeInfo.calculateEmployeeBonus(emp1.getSalary(), emp1.getBonus());
		emp1.setBonus(4);
		double bonus2 = EmployeeInfo.calculateEmployeeBonus(emp2.getSalary(), emp2.getBonus());
		emp2.setBonus(3);
		double bonus3 = emp3.calculateEmployeeBonus(emp3.getSalary(), emp3.getBonus());
		emp3.setBonus(2);
		double bonus4 = emp4.calculateEmployeeBonus(emp4.getSalary(), emp4.getBonus());
		emp4.setBonus(1);

		EmployeeInfo.calculateEmployeePension(emp1.getSalary());

		Map<Integer, List<Object>> employeeInfo = new HashMap<Integer, List<Object>>();
		List<Object> employeeRecord1 = new ArrayList<Object>();
		employeeRecord1.add(emp1.employeeName());
		employeeRecord1.add(emp1.calculateSalary(emp1.getSalary()));
		employeeRecord1.add(bonus1);

		List<Object> employeeRecord2 = new ArrayList<Object>();
		employeeRecord2.add(emp2.employeeName());
		employeeRecord2.add(emp2.calculateSalary(emp2.getSalary()));
		employeeRecord2.add(bonus2);

		employeeInfo.put(1, employeeRecord1);
		employeeInfo.put(2, employeeRecord2);


	}
}
