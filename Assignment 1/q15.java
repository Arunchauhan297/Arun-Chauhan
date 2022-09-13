import java.util.Scanner;
class q15{
	public static void main(String args[]){
Scanner s1 = new Scanner(System.in);
System.out.println("enter the 1st number");
int a =s1.nextInt();
System.out.println("enter the 2nd number");
int b =s1.nextInt();
System.out.println("enter the 3nd number");
int c =s1.nextInt();

if(a<b && a<c){
System.out.println("smallest number is:"+a);
}
else if(b<a && b<c){
	System.out.println("smallest number is:"+b);
}
else{
	System.out.println("smallest number is:"+c);
}
}
}