import java.util.Scanner;
class p1{
public static void main(String args[]){
	Scanner s= new Scanner(System.in);
System.out.println("enter the number");
int x=s.nextInt();
	

for(int i=1;i<=x;i++){
	for(int j=1;j<=i;j++){
	System.out.print(j+" ");
	}
		System.out.println();
	}
}
}