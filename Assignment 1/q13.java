import java.util.Scanner;
class q13{
	public static void main(String args[]){
Scanner s1 = new Scanner(System.in);
System.out.println("enter the number");
int num =s1.nextInt();
	while(num!=0){
     System.out.println(num%10);
	num =num/10;
	}
}
}