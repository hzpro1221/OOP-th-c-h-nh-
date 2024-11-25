import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class DisplayDayAndMonth {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		String month;
		int year;
		
		String[] validMonth = {
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
				"Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec.",
				"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec",
				"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		List<String> validMonthList = Arrays.asList(validMonth);
		
		do {
			System.out.println("Input month: ");
			try {
				month = keyboard.nextLine();
			} catch (Exception e) {
				System.out.println("Invalid value of month!");
				continue;
			}
			
			if (validMonthList.contains(month)) {
				break;
			} else {
				System.out.println("Invalid value of month!");
				continue;
			}
		} while (true);

		do {
			System.out.println("Input year: ");
			try {
				year = keyboard.nextInt();
			} catch (Exception e) {
				System.out.println("Invalid value of year!");
				continue;
			}
			
			if (year > 0) {
				break;
			} else {
				System.out.println("Invalid value of year!");
				continue;
			}
		} while (true);		
		int date = 0;
		
		switch (month) {
		case "1":
		case "Jan.": 
		case "Jan":
		case "January":
			date = 31;
			break;
		
		case "2":
		case "Feb.":
		case "Feb":
		case "February":
			if (year % 4 == 0) {
				if ((year % 100 == 0) && (year % 400 != 0)) {
					date = 28;
				} else {
					date = 29;
				}
			} else {
				date = 28;
			}
			break;
		
		case "3":
		case "Mar.":
		case "Mar":
		case "March":
			date = 31;
			break;
		
		case "4":
		case "Apr.":
		case "Apr":
		case "April":
			date = 30;
			break;
		
		case "5":
		case "May":
			date = 31;
			break;
		
		case "6":
		case "June":
		case "Jun":
			date = 30;
			break;
		
		case "7":
		case "July":
		case "Jul":
			date = 31;
			break;
		
		case "8":
		case "Aug.":
		case "Aug":
		case "August":
			date = 31;
			break;
		
		case "9":
		case "Sept.":
		case "Sept":
		case "September":
			date = 30;
			break;
		
		case "10":
		case "Oct.":
		case "Oct":
		case "October":
			date = 31;
			break;
		
		case "11":
		case "Nov.":
		case "Nov":
		case "November":
			date = 30;
			break;
		
		case "12":
		case "Dec.":
		case "Dec":
		case "December":
			date = 31;
			break;
    	
		default:
    		System.out.println("Invalid month input");
    		break;	
		}
		System.out.println("The number of days of month " + month + "; year " + year + " is: " + date);
	
	}
}
