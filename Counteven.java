

public class Counteven 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int i,sum=0,count=0;
	int a[]= {31,4,-35,-16,89};
	for(i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			count++;
			System.out.println("even number");
			System.out.println("count is"+count);
		}
	}

}
}