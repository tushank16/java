public class result
{
	public static void main(String[] args)
	{
		
		int marks = 75; //assuming out of 100
		if(marks >=75)
		{
			System.out.println("Distinction");
		}
		else if(marks >=60)
		{
			System.out.println("first class");
		}
		else if(marks >=50)
		{
			System.out.println("second class");
		}
		else if(marks >=40)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
