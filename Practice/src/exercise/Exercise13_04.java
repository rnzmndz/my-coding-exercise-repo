package exercise;

import java.util.*;

public class Exercise13_04 {
	static int[][] calendarMatrix = new int[5][7];

	public static void main(String[] args) {
		createCalendarMatrix(2024,2);
		printMatrix(calendarMatrix);
	}
	
	static void createCalendarMatrix(int year, int month){
		int day = 0;
		Calendar calendar = new GregorianCalendar(year,month, 1);
		System.out.print(Calendar.YEAR);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				if(i < 1 && j < Calendar.DAY_OF_WEEK)
					continue;
				else if (day > calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
					break;
				else
					day ++;
				calendarMatrix[i][j] = day;
			}
		}
	}
	
	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
