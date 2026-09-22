import java.util.*;
public class main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
int pro=1;
int temp=n;
while(n>0){
int d=n%10;
sum=sum+d;
pro=pro*d;
n=n/10;
                                                                                                                   }
if(sum==pro){
System.out.println(temp+"is a spy number");
}
else{
System.out.println(n+"is not a spy number");
}}}
