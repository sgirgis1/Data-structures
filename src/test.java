import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userInput;
		int num;
		ArrayList<TopFastFood> topFastFoodDb = new ArrayList<>();

		String line = "";

		try {
			BufferedReader br = new BufferedReader(new FileReader("TopFastFood.csv"));
			br.readLine();
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				TopFastFood tempTopFastFood = new TopFastFood(Integer.parseInt(values[0]), values[1], values[2],
						Integer.parseInt(values[3]), Integer.parseInt(values[4]));

				topFastFoodDb.add(tempTopFastFood);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		  
		  System.out.println("You may enter one of the following: \n - a rank number between 1-50 inclusive \n - a catergory name from one of the following (burger, snack, chicken, global, sandwich, or pizza) \n - a restaurant name \n - the word 'all' \n\n - or the word quit to end" );
		  System.out.println("\n Enter a rank, category, restaurant name, 'all', or 'quit' to end:");
		  
		 
		  userInput = scanner.nextLine();

		  while(!userInput.equalsIgnoreCase("Quit")) {
			  if(userInput.equalsIgnoreCase("all")) {
				  for(TopFastFood tff : topFastFoodDb ) {
					  {
						  System.out.println(tff);
					  }
				  } 
			  } else {
				  if(userInput.equalsIgnoreCase("burger") || userInput.equalsIgnoreCase("sandwich") || userInput.equalsIgnoreCase("pizza") || userInput.equalsIgnoreCase("global") || userInput.equalsIgnoreCase("snack") || userInput.equalsIgnoreCase("chicken")) {
					  for(TopFastFood tff : topFastFoodDb ) {
						  if(tff.getCategory().equalsIgnoreCase(userInput))
						  {
							  System.out.println(tff);
						  }
					  } 
				  } else {
					  if(userInput.length()<3) {
						  num = Integer.parseInt(userInput);
						  System.out.println(topFastFoodDb.get(num-1));
					  }
					  
					  	else {
					  		boolean flag = false;
					  		for(TopFastFood tff : topFastFoodDb ) {
								  if(tff.getName().equalsIgnoreCase(userInput))
								  {
									  flag=true;
									  System.out.println(tff);
								  }
							  } if(!flag) {
								  System.out.println("Sorry no restaurants with that name");
							  	}
					  }
				  
				  }
			  	  
			  }
			  System.out.println("\n Enter a rank, category, restaurant name, 'all', or 'quit' to end:");
			  userInput = scanner.next();		  
		  }
	}
}
