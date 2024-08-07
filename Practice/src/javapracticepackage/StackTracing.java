package javapracticepackage;

public class StackTracing 
{
public static void main(String[] args) 
{
	StackTracing.add();
}
public static void add() 
{
System.out.println(20+10);	
StackTracing.sub();
}
public static void sub()
{
	System.out.println(20-10);
}
}
