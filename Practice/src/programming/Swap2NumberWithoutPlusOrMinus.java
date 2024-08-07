package programming;

public class Swap2NumberWithoutPlusOrMinus 
{
public static void main(String[] args) 
{
int a=10,b=20;
System.out.println("before a ="+a+" b="+b);
a=a*b;
b=a/b;
a=a/b;
System.out.println("after a ="+a+" b="+b);
}
}
