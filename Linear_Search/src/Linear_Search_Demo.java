

import java.util.Scanner; 

public class Linear_Search_Demo 
{
  public static void main(String args[])
  {
	  int counternum, number, item, arraydemo[];
	  
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter Number of Elements for Linear Search: ");
	  
	  number = input.nextInt();
	  arraydemo = new int[number];
	  System.out.println("Enter: " + number + " integers");
	  
	  for(counternum = 0; counternum < number; counternum++)
	  {
		  arraydemo[counternum] = input.nextInt();
	  }
	  
	  System.out.println("Enter the Search Value: ");
	  
	  item = input.nextInt();
	  
	  for(counternum = 0; counternum < number; counternum++)
	  {
		  if(arraydemo[counternum] == item)
		  {
			  System.out.println(item + " present at location " + (counternum + 1));
			  break; 
		  }
	  }
	  if (counternum == number)
		  
		  System.out.println(item + " doesn't exist in arraydemo");
	  
	  
  }
	
	
}
