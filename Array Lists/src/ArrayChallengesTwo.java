import java.util.ArrayList;
import java.util.Collections;
public class ArrayChallengesTwo
	{
		//testing testing
		static ArrayList<Double> temps;
		static double max;
		static double min;

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				readTemps();
				makeStats();
				pointOutFevers();
				convertToCel();
				showHealthy();
				printStats();

			}
		public static void readTemps()
			{
				temps  = new ArrayList<Double>();
				temps.add(99.7);
				temps.add(97.9);
				temps.add(98.6);
				temps.add(98.8);
				temps.add(98.5);
				temps.add(101.3);
				temps.add(98.2);
				temps.add(97.7);
				temps.add(98.9);
				temps.add(102.4);
				
				
				for(int i=0; i<temps.size(); i++)
					{
						System.out.println(temps.get(i) + " degrees Fahrenheit");
					}
			}
		public static void makeStats()
			{
				 max = Collections.max(temps);
				 min = Collections.min(temps);
				
			}
		public static void pointOutFevers()
			{
				int counter=0 ;
				System.out.println("The following are the tempuratures of people with fevers: ");
				for(int i=0; i<temps.size(); i++)
					{
						double temp = temps.get(i);
						if(temp>98.6)
							{
								System.out.println(temp);
								counter +=1;
							}
						
					}
				System.out.println("There are " + counter + " people with fevers.");
				
			}
		public static void convertToCel()
			{
				for(int i=0; i<temps.size(); i++)
					{
						double tempF = temps.get(i);
						double tempC = (tempF-32)/1.8;
						System.out.println(tempF + " degrees Fahrenheit in Celcius is " + tempC);
						
					}
			}
		public static void showHealthy()
			{
				double temp;
				for(int i=temps.size()-1; i>=0; i--)
				
					{
						temp = temps.get(i);
						if(temp > 98.6)
							{
								temps.remove(temp);
							}
					}
				System.out.println("The temperatures of all the healthy people are: ");
				for(int i=0; i<temps.size(); i++)
					{
						System.out.println(temps.get(i));
					}
				
			}
		
		public static void printStats()
		{
			System.out.println("The highest tempurature is: "+ max);
			System.out.println("The lowest tempurature is: "+ min);
		}
			

	}
