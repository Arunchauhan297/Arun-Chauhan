import java.util.Scanner;
class q6{
	public static void main(String args[]){
Scanner s1 = new Scanner(System.in);
System.out.println("enter the year");
int year =s1.nextInt();
if((year % 4 == 0) && (year % 100!= 0) || (year%400 == 0)){
System.out.println("leap year");
}
else{
	System.out.println("not a leap year");
}
}
}
