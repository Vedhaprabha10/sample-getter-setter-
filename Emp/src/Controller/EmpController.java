package Controller;

public class EmpController {

	public static void main(String[] args) {
		
		EmpService employee = new EmpService();
		
		Emp employees = employee.getEmp();
		System.out.println(employees.getId());
		System.out.println(employees.getName());
		
	}
}