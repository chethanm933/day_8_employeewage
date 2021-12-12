package EmployeeWage;

public class EmployeeUC1 {
	
	public void  PresentAbsent(int fulltime, int parttime) {
		int attendance = (int) (Math.random() *10 % 2) + 1;
		System.out.println("random" +attendance);
			
		if(attendance == fulltime) {
			System.out.println("employee is full time :");
		} 
		
		if(attendance == parttime) {
			System.out.println("employee is parttime :");
		}
	}
}
