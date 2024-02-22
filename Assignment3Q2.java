public class Assignment3Q2 {
 public static void main(String args[]) {
 String currentmonth = "february";
 System.out.println("The currentmonth is : " + currentmonth);
 switch (currentmonth) {
 case "february":
 System.out.println("Number of days: 28 or 29");
 break;
 case "april":
 case "june":
 case "september":
 case "november":
 System.out.println("Number of days: 30");
 break;
 case "january":
 case "march":
 case "may":
 case "july":
 case "august":
 case "october":
 case "december":
 System.out.println("Number of days: 31");
 break;
 default:
 System.out.println(" no of days did not found");
 }
 }
}