package lineComparison;

import java.util.Scanner;


public class Lines {
	

	public void length() {
	double  x1, x2, x3, x4;
	double y1, y2, y3, y4;
	double length1,length2;
	
	Scanner Line = new Scanner(System.in);
	System.out.println("enter the first cartisian point of a line");
	x1 = Line.nextFloat();
	y1 = Line.nextFloat();
	System.out.println("enter the second cartisian point of a line");
	x2 = Line.nextFloat();
	y2 = Line.nextFloat();
	
	System.out.println("enter the first cartisian point of a 2nd line");
	x3 = Line.nextFloat();
	y3 = Line.nextFloat();
	System.out.println("enter the second cartisian point of a line");
	x4 = Line.nextFloat();
	y4 = Line.nextFloat();
	Line.close();

	length1 = Math.sqrt((x2-x1) + (y2-y1));
	System.out.println("the length of a line1 :"+length1);
	
	length2 = Math.sqrt((x4-x3) + (y4-y3));
	System.out.println("the length of a line2 :"+length2);
		
	
	LineCompare linecomp = new LineCompare();
	linecomp.lineEquality(length1, length2);
	
		}
	}


