
import java.lang.Math;

class RandNum
{
	public int[][] array=new int[5][5];
	public double minimum;
	public double maximum;
	public double Average;
	
	 RandNum() {
		 for(int i=0;i<5;i++)
		 {
			 for(int j=0;j<5;j++)
			 {
				 int number=(int)(Math.random()*(100-1+1)+1);
				 array[i][j]=number;
			 }
		 }
		
	}
	 public void calculations()
	 {
		 //minimum number in the array
		 minimum=array[0][0];
		 for(int i=0;i<5;i++)
		 {
			 for(int j=0;j<5;j++)
			 {
				if(array[i][j]<minimum)
				{
					minimum=array[i][j];
				}
			 }
		 }
		 
		 //maximum number in the array
		  maximum=0;
		 for(int i=0;i<5;i++)
		 {
			 for(int j=0;j<5;j++)
			 {
				if(array[i][j]>maximum)
				{
					maximum=array[i][j];
				}
			 }
		 }
		 
		 
		//Average of the numbers in the array
		 double Sum=0;
		 for(int i=0;i<5;i++)
		 {
			 for(int j=0;j<5;j++)
			 {
			   Sum=Sum+array[i][j];
			 }
		 }
		 
		 Average=Sum/25.0;
		 
	 }
	 
	 public void display()
	 {

			for(int i=0;i<5;i++)
			{
			for(int j=0;j<5;j++)
			{
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
			}
			
			System.out.println("Minimum amount of the array is :"+minimum);
			System.out.println("Maximum amount of the array is :"+maximum);
			System.out.println("Average of the array is :"+Average);
	 }
}

public class MyMain {

	public static void main(String[] args) {
		
		RandNum random_number=new RandNum(); //creating objects
		 
		 random_number.calculations(); //calling the calculation method
		 
		 random_number.display(); //calling display method to display the values
	}

}
