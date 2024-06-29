package market;
import java.util.Scanner;
public class NewC 
{
	
	static int i=2350;
	static double t;	
	public static void cni()
	{
		String cname;	
		Scanner sc=new Scanner(System.in);
		System.out.print(" \n \t\t\tCustomer Name: ");
		cname=sc.nextLine();
		System.out.println("\t\t\tCustomer ID  : " + (i++));
		prices();
		footer();             
	}
	public static void prices()
	{
		String pcode;
		double pamount;
		double tp=0,tv=0;	
		int j;
		for(j=0;j<20;j++)
		{
			System.out.print("\n\t\t\t\t\t\t(Press t for calculate total)\n");
			System.out.print("\t\t\t Product Code       : ");	
			Scanner pr=new Scanner(System.in);
			pcode=pr.nextLine();
			double price;
			double vat;
			if("t".equals(pcode))
				break;
			System.out.print("\t\t\tQuantity   : ");
			Scanner pa=new Scanner(System.in);
			pamount=pa.nextDouble();
			switch(pcode)
			{
			case "r1":
				price= (60*pamount);
				vat=Math.ceil(0.1*price);
				tp=tp+price;
				tv=tv+vat;
				System.out.println("\t\t\tProduct       : Rice(1kg=60 Tk) ");
				System.out.println("\t\t\tProduct Amount: "+pamount+ " Kg ");
				System.out.println("\t\t\tPrice         : "+price+" Tk");
				System.out.println("\t\t\tVat           : "+vat+" Tk");
				break;
			case "b1" :
				price= (650*pamount);
				vat=Math.ceil(0.1*price);
				tp=tp+price;
				tv=tv+vat;
				System.out.println("\t\t\tProduct: Beef(1 Kg=650 Tk)");
				System.out.println("\t\t\tProduct Amount: "+pamount+ " Kg ");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
				System.out.println("\t\t\tVat    : "+vat+" Tk");
				break;
			case "s1":
				price= (35*pamount);
				vat=Math.ceil(0.1*price);		
				tp=tp+price;
				tv=tv+vat;
				System.out.println("\t\t\tProduct: Salt(1 Kg=35 Tk)");
				System.out.println("\t\t\tProduct Amount: "+pamount+" Kg ");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
				System.out.println("\t\t\tVat    : "+vat+" Tk");
				break;
			case "t1":
				price= (150*pamount);
				vat=Math.ceil(0.1*price);
				tp=tp+price;
				tv=tv+vat;
				System.out.println("\t\t\tProduct: Toothpaste(200 g=150 Tk)");
				System.out.println("\t\t\tProduct Amount: "+pamount+" Packet ");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
				System.out.println("\t\t\tVat    : "+vat+" Tk");
				break;
			case "s2":
				price= (280*pamount);
				vat=Math.ceil(0.1*price);
				tp=tp+price;
				tv=tv+vat;
				System.out.println("\t\t\tProduct: Shampoo(350mL=280 Tk)");
				System.out.println("\t\t\tProduct Amount: "+pamount+" Bottle ");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
				System.out.println("\t\t\tVat    : "+vat+" Tk");
				break;
			case "m1":
				price= (60*pamount);
				vat=Math.ceil(0.1*price);
				tp=tp+price;
				tv=tv+vat;
				System.out.println("\t\t\tProduct: Milk(1 Litre=60 Tk)");
				System.out.println("\t\t\tProduct Amount: "+pamount+" Litre ");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
				System.out.println("\t\t\tVat    : "+vat+" Tk");
				break;
			case "p1":
				price= (260*pamount);
				vat=Math.ceil(0.1*price);
				tp=tp+price;
				tv=tv+vat;
				System.out.println("\t\t\tProduct: Perfume(120mL=260 Tk)");
				System.out.println("\t\t\tProduct Amount: "+pamount+" Bottle ");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
				System.out.println("\t\t\tVat    : "+vat+" Tk");
				break;
			case "cd1":
				price= (50*pamount);
				vat=Math.ceil(0.1*price);
				tp=tp+price;
				tv=tv+vat;
				System.out.println("\t\t\tProduct: Cold Drinks (1 Litre=50 Tk)");
				System.out.println("\t\t\tProduct Amount: "+pamount+" Litre ");
				System.out.println("\t\t\tPrice  : "+price+" Tk");
				System.out.println("\t\t\tVat    : "+vat+" Tk");
				break;
			default:
				System.out.println("\t\t\tPlease enter correct code");	
			}
		}
		//end of for loop
		System.out.println("\n\t\t\tTotal Price: "+tp+" Tk");
		System.out.println("\t\t\tTotal Vat  : "+tv+" Tk");
		t=tp+tv;
		System.out.println("\t\t\tTotal      : "+t+" Tk");
	}
	public static void footer()
	{
		System.out.println("\n\t\t\t\tThank You");
		System.out.println("\n\t\t\t\tPlease Come Again");
		System.out.println("\n\t\t\t\t\t\t\t Labib");
		System.out.println("\n\t\t\t\t\t\t\t-------------");
		System.out.println("\n\t\t\t\t\t\t\t  Signature");
	}		
}

