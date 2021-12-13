package lineComparison;
import java.util.Scanner;

public class LineLength {
	public static void main(String[] args) {
		double  x1, x2;
		double y1, y2;
		double length;
		
		Scanner Line = new Scanner(System.in);
		System.out.println("enter the first cartisian point of a line");
		x1 = Line.nextFloat();
		y1 = Line.nextFloat();
		System.out.println("enter the second cartisian point of a line");
		x2 = Line.nextFloat();
		y2 = Line.nextFloat();
		Line.close();
	
		length = Math.sqrt((x2-x1) + (y2-y1));
		System.out.println("the length of a line :"+length);
		}
	}

