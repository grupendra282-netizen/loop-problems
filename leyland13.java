import java.util.*;
public class main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
int result = (int)(Math.pow(x,y) + Math.pow(y,x));
	System.out.println(result + " is a Leyland number");
}}
