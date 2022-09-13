import java.util.Scanner;
class q9{
	public static void main(String args[]){
Scanner s1 = new Scanner(System.in);
System.out.println("enter the number");
int a =s1.nextInt();
   
   for(int i=1;i<=a;i++){
	   if(a%i==0){
		   System.out.println("factor of no. are"+i);
	   }
   }
}
}
