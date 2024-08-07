package javapracticepackage;

public class Recursion 
{
public static void main(String[] args) 
{
System.out.println("Hello");
Recursion.display();
}
public static void display()
{
	System.out.println("Display method execution");
	Recursion.display();
}
}
