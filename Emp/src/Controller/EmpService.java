package Controller;

import java.util.ArrayList;

public class EmpService {

	public Emp getEmp() {
	ArrayList<String> names = new ArrayList<String>();
	ArrayList<Integer>id = new ArrayList<Integer>();
	
	names.add("vedha");
	names.add("selva");
	names.add("prabha");
	
	id.add(101);
	id.add(102);
	id.add(103);
	
	Emp emps= new Emp();
	emps.setId(id);
	emps.setName(names);
	return emps;
	
		}
	}	
