public class Findfirstodd 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int i,rem;
	int a[]= {31,4,-35,-16,89};
	for(i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			rem=a[i];
			System.out.println("last even"+rem);
		i++;
		}
	}
}
}