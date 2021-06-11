package org.example.demo;
import java.util.Collection;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;
import org.example.Beer;

public class Tester {
	
private Map<Integer, Beer> map=null;
	
	{
		map=new HashMap<Integer,Beer>();
	}
	
	private static Scanner scanner=new Scanner(System.in);
	private void checkPrice(double price)
	{
		if(price<=100)
		{
			throw new InvalidPriceException("Invalid Price");
		}
	}
	
	public static void main(String[] args)
	{
		int key=1;
		int choice=0;
		Tester tester=new Tester();
		do {
			try {
				
			System.out.println("1. Add a new beer");
			System.out.println("2. Display list of beers available");
			System.out.println("3. Find a beer");
			System.out.println("4. Delete a beer");
			System.out.println("0. Exit");
			choice=scanner.nextInt();
			switch(choice)
			{
			 case 1:
				    System.out.println("Enter the beer name:");
				    String name=scanner.next();
				    System.out.println("Enter the price:");
				    Double price=scanner.nextDouble();
				    try {}
                    catch (InvalidPriceException e) {
						
						System.err.println(e.getMessage());
					}
				    tester.checkPrice(price);
				    tester.map.put(key++, new Beer(UUID.randomUUID().toString(), name, price));
				    System.out.println("Beer Added Sucessfully!!!");
				    break;
			 case 2:
				    Collection<Beer> collection=tester.map.values();
				    Iterator<Beer> i=collection.iterator();
				    while(i.hasNext()) 
				    {
				    	Beer b=i.next();
				    	System.out.println(b);
				    }
				    break;
			 case 3:
				    System.out.println("Enter the ID");
				    int id=scanner.nextInt();
				    Beer beer=tester.map.get(id);
				    if(beer==null)
				    {
				    	System.out.println("No beer found with the id: "+id);
				    }
				    else
				    	System.out.println("Beer found\n"+beer);
				    break;
			 case 4:
				    System.out.println("Enter the beer id");
				    id=scanner.nextInt();
				    beer=tester.map.get(id);
				    if(beer==null)
		              System.out.println("no beer found with this id: "+id);
				    else
				        {
				    	    tester.map.remove(id);
				    	    System.out.println("Beer deleted successfully");
				        }
				    break;
			 case 0:
				    System.out.println("Exiting from the System. Bye!!!");
				    System.exit(0);
				    break;
		     default:
		    	     System.out.println("Invalid choice");
		    	     break;
			}
			
			}
			catch(InputMismatchException e) {
				System.err.println("input mispatched.");
			}
			
			} while(choice!=0);
	}

}
