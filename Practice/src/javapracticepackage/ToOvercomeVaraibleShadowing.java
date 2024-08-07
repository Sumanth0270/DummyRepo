package javapracticepackage;

public class ToOvercomeVaraibleShadowing 
{
static String brand="Nestle";
String productId;
double price;
String quantity;
public ToOvercomeVaraibleShadowing(String productId,double price,String quantity )
{
	this.productId=productId;
	this.price=price;
	this.quantity=quantity;
}
public void display()
{
	System.out.println("--------------DETAILS----------------");
	System.out.println("Brand = "+ToOvercomeVaraibleShadowing.brand);
	System.out.println("ProductId = "+productId);
	System.out.println("Price = "+price);
	System.out.println("Quantity = "+quantity);
}
public static void main(String[] args) 
{
	ToOvercomeVaraibleShadowing p1=new ToOvercomeVaraibleShadowing("p001", 85.89, "500ml");
	ToOvercomeVaraibleShadowing p2=new ToOvercomeVaraibleShadowing("p002", 45.87, "250g");
	p1.display();
	p2.display();
}
}
