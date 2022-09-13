import java.util.Scanner;
class q10{
	public static void main(String args[]){
Scanner s1 = new Scanner(System.in);
System.out.println("enter the number");
int num =s1.nextInt();
   int sum=0;
	while(num>0){
		int temp=num%10;
		sum=sum+temp;
		num=num/10;
     
	}
	System.out.println("sum="+sum );
}
}