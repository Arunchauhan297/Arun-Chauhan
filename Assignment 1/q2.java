import java.util.Scanner;
class q2{
	public static void main(String args[]){
Scanner s1 = new Scanner(System.in);
System.out.println("enter the number");
int num =s1.nextInt();
int fact =1;
for(int i=num;i>=1;i--){
	fact=fact*i;
}
System.out.println(fact);
}
}