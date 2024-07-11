
public class Positivenumber 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int i,j;
	int a[]= {31,4,-35,-16,89,4,6,5};
	for(i=0;i<a.length;i++)
	{
		if(a[i]>0)
		{
			System.out.println("positive number"+a[i]);
		}
	}
}
}