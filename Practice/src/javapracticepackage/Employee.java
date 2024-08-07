package javapracticepackage;

public class Employee 
{
static String company="ABC Solutions";
String name;
String id;
double salary;
public Employee()
{
	System.out.println("loading");
}
public static void main(String[] args) 
{
Employee e1=new Employee();
Employee e2=new Employee();
System.out.println(e1);
System.out.println(e2);
}
}
