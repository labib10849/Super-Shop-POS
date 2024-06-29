package market;
import java.util.Scanner;
public class Customer extends ProductList
{
	public static void main(String[] args)
	{
		full();
	}
	public static void full() 
	{
		System.out.println("\t\t\t---------------------------------");
		System.out.println("\t\t\t---------------------------------");
		System.out.println("\t\t\tWelcome to Bondhu Supershop");
		System.out.println("\t\t\t---------------------------------");
		System.out.println("\t\t\t---------------------------------\n\n");
		product(); 			
		System.out.println("\n\n\t\t  Welcome Dear Customer");
	
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.print(" \t\t Please Press (1): ");
		c=sc.nextInt();
		if(c==1)	
		{
			NewC obj=new NewC();
			obj.cni();
		}
		
		else
			full();
		Scanner bc=new Scanner(System.in);
		System.out.print("\n\n\t\t Press m to return main menu or press any other key to exit ");
		int b=bc.nextLine().charAt(0);
		if(b=='m')
			full();
	}
}
