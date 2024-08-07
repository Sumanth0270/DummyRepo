package javapracticepackage;

public class MethodWithReturnStatement 
{
public static int add() 
{
int a=10,b=20;
return a+b;
}
public static int add(int a,int b) 
{
return a+b;	
}
public static double temparature() 
{
double t1=20.8,t2=59.3;
return  t1+t2;
}
public static double temperature(double t1,double t2) 
{
return t1+t2;	
}
public static void main(String[] args) 
{
int addition=MethodWithReturnStatement.add();
System.out.println(addition);
int addition1=MethodWithReturnStatement.add(10, 5);
System.out.println(addition1);
double temperature=MethodWithReturnStatement.temparature();
System.out.println(temperature);
double temperature1=MethodWithReturnStatement.temperature(36.6, 45.9);
System.out.println(temperature1);
}
}
