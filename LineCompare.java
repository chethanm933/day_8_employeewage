package lineComparison;

public class LineCompare {
	
public int lineEquality(double line1, double line2) {
		
		int compare1 = Double.compare(line1, line2);
		if(compare1 == 0) {
			System.out.println("the lines are equal");
		} else if(Double.compare(line1, line2) < 0) {
			System.out.println("line2 is greater");
			} else {
				System.out.println("line1 is greater");
		}
		return 0;
	}

}
