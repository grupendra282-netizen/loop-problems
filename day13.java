import java.util.*;
public class main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
int sum = 0;
int temp = n;
while (n>0){
	int d = n % 10;
	sum = sum+d;
	n = n/10;
}
if( temp % sum ==0){
		System.out.println(temp + " is a Harshad number");
}
else{
			System.out.println(temp + " is not a Harshad number");

}
}
}