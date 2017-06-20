package Session_2;

public class Assign_2 {


	public static void main(String[] args) {
	for (int i=1;i<=3;i++)
	{
		int a=97;
		int b=97;
	for (int j=3;j>=i-1;j--)
	{
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++)
	{
		System.out.print((char)a);
		a++;
	}
	for(int l=1;l<=i-1;l++)
	{  //int b=97;
		System.out.print((char)b);
		++b;
	}
	System.out.print("\n");
		
	}
	
	
	for(int i=1;i<=2;i++)
	{ System.out.print(" ");
	int c=97;
	int d=97;
		for (int j=1;j<=i+1;j++)
		{
			System.out.print(" ");
		} 
		
		for (int k=i;k<=2;k++)
		{ 
			System.out.print((char)c);
		 c++;
		}
		for(int m=2;m>=i+1;m--)
		{
			System.out.print((char)d);
			
		}
		System.out.print("\n");
	}

	}

}
