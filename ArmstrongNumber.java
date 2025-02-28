package Classwork1;
public class ArmstrongNumber {
     public static void main(String []args) {
    	 int n = 153;
    	 int temp = n;
    	 double sum = 0;
    	 while(n != 0) {
    		 int r = n % 10;
    		 sum = sum + Math.pow(r,3);
    		 n = n / 10;
    	 }
    	 if (temp == sum) {
    		 System.out.println("It is a armstrong number");
    	 }
    	 else {
    		 System.out.println("It is not a armstrong number");
    	 }
     }
}
