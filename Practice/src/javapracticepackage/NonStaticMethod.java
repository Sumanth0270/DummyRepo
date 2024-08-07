package javapracticepackage;

public class NonStaticMethod 
{
static String brand="Nestle";
String productId;
double price;
String quantity;
public NonStaticMethod(String pi,double p,String q)
{
	productId=pi;
	price=p;
	quantity=q;
}
public void display()
{
	System.out.println("----------DETAILS------------");
	System.out.println(NonStaticMethod.brand);
	System.out.println(productId);
	System.out.println(price);
	System.out.println(quantity);
}
public static void main(String[] args) 
{
NonStaticMethod p1=new NonStaticMethod("p001", 45.8, "1000ml");
NonStaticMethod p2=new NonStaticMethod("p002", 80.97, "500g");
p1.display();
p2.display();
}
}
