import java.util.Scanner;

public class MenuManager {
    
	 public static void main(String[] args) {
		 String num = "0";
		 Scanner input = new Scanner (System.in);
		 while(num != "6" ) {
		     System.out.println("1. Add Notice");
		     System.out.println("2. Delete Notice");
		     System.out.println("3. Edit Notice");
		     System.out.println("4. View Notice");
		     System.out.println("5. Show a Menu");
		     System.out.println("6. Exit");
		     System.out.println("Select one number between 1 - 6"); 
		     num = input.nextLine();  //num을 String으로 했습니다. int로 선언하면 num = input.nextInt();로 입력하고 공고넘버를 입력하는 줄이 자동으로 넘어가는 버그가 발생했고 num을 string으로하고 nextLine으로 입력받도록하니 버그가 발생하지 않았습니다.
		     switch(num) {
		         case "1":
		        	 System.out.println("Notice number: ");
		        	 String Num = input.nextLine();
		        	 System.out.println("Title: ");
		        	 String title = input.nextLine();
		        	 System.out.println("Recruitment conditions");
		        	 System.out.println("Recruitment period: ");
		        	 String period = input.nextLine();
		        	 System.out.println("Career: ");
		        	 String career = input.nextLine();
		        	 System.out.println("Sex: ");
		        	 String sex = input.nextLine();
		        	 System.out.println("Age: ");
		        	 String age = input.nextLine();
		        	 System.out.println("Academic background: ");
		        	 String academic = input.nextLine();
		        	 System.out.println("Working conditions");
		        	 System.out.println("Salary: ");
		        	 String salary = input.nextLine();
		        	 System.out.println("Working period: ");
		        	 String period2= input.nextLine();
		        	 System.out.println("Working day: ");
		        	 String day= input.nextLine(); 
		        	 System.out.println("Duty hours: ");
		        	 String time= input.nextLine();
		        	 System.out.println("Recruitment details");
		        	 System.out.println("Recruitment occupation: ");
		        	 String type1= input.nextLine();
		        	 System.out.println("Recruitment personnel: ");
		        	 String personnel= input.nextLine();
		        	 System.out.println("Employment type: ");
		        	 String type2= input.nextLine();
		        	 System.out.println("Preferential conditions: ");
		        	 String condition1= input.nextLine();
		        	 System.out.println("Other conditions: ");
		        	 String condition2= input.nextLine();
		        	 System.out.println("Besides that");
		        	 System.out.println("How to apply: ");
		        	 String way= input.nextLine();
		        	 System.out.println("Submission document: ");
		        	 String submission= input.nextLine();
		        	 System.out.println("Comment: ");
		        	 String comment= input.nextLine();
		         case "2":
	        	        break;
		         case "3":
	        	        break;
		         case "4":
		        	    System.out.println("Enter the Notice's No.': ");
		        	    String Num2 = input.nextLine();
	        	        break;
		         case "5":
	        	        break;
		         case "6":
	        	        break;
	        	 default:
	        		    System.out.println("Warning!: Select one number between 1 - 6\n");
	        		    break;
		     }
		 } 
	 }
}
