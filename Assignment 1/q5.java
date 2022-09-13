import java.util.Scanner;
class q5{
	public static void main(String args[]){
Scanner s1 = new Scanner(System.in);
System.out.println("enter the number");
int num =s1.nextInt();
if(num>0){
System.out.println("positive number");
}
else if(num<0){
	System.out.println("negative number");
}

else{
	System.out.println("neither positive nor negative");
}
}
}