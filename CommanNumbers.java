

public class CommanNumbers {

	public static void main(String[] args)
	{
		int a[]= {12,16,21,28,35};
		int ar[]= {13,17,21,27,35};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(a[i]==ar[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
