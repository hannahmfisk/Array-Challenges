
import java.util.ArrayList;

public class IntroToArrays

	{
		static ArrayList<Double> myArray;
		static double sum;
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				makeArray();
				addDecimals();
				averageStuff();
				//System.out.println(myArray);

			}
		public static void makeArray()
			{
				myArray  = new ArrayList<Double>();
				myArray.add(.9);
				myArray.add(.11);
				myArray.add(18.7);
				myArray.add(2.6);
				myArray.add(7.3);
				System.out.println(myArray);		
			}
		public static void addDecimals()
			{
				sum = 0;
				for(int i=0; i<myArray.size();i++)
					{
						double myNumber = myArray.get(i);
						sum=sum+ myNumber;
					}
				System.out.println("The sum of the numbers is: " + sum);
			}
		
		public static void averageStuff()
			{
				myArray.remove(0);
				myArray.add(.934789);
				myArray.add(12.333);
				
				double average = sum / myArray.size();
				System.out.println("The average is: " + average);
			}


	}
