package EmployeeWage;

public class EmployeeWageComputation {
	
	final static int fulltime = 1;
	final static int parttime = 2;
	
	static int full_time_wrk_hr = 8;
	static int part_time_wrk_hr = 4;
	static int max_wrk_hr = 100;
	static int max_wrk_days = 20;
	static int wage_rate = 20;
	
	
	public static void main(String[] args) {
		
		EmployeeUC1 emp = new EmployeeUC1();
		EmployeeUC2 emp1 = new EmployeeUC2();
		
		
		int total_wrk_hr = 0;
		int days = 0;
		String Name = "Surya";
		String emp_name = emp1.employee(Name);
		
		
		
		while((days < max_wrk_days) && (total_wrk_hr) < max_wrk_hr) {
			days++;
			int working_hr =  emp1.employeeWageUC2(emp.PartTimeFullTime(fulltime, parttime));
			total_wrk_hr += working_hr;
		}
			int total_wage = total_wrk_hr * wage_rate;
			System.out.println("the total salary earned by the :"+emp_name+total_wage+ "\tfor\t"+days+"days of work");
			System.out.println("total_wrk_hr is :"+total_wrk_hr);
			
	}
}


