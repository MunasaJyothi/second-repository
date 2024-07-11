

public class PalindromEx {

	public static void main(String[] args) 
	{
		int a[]= {313,121,164,123,464};
		
		int i=0,temp,res;
		
		int n=a.length;
		System.out.println("the palindrom elements are");
		for(i=0;i<n;i++)
		{
			temp=a[i];
			int prod=0;
			while(temp>0)
			{
				res=temp%10;
				prod=prod*10+res;
				temp=temp/10;
			}
		 
		if(a[i]==prod)
		{
			System.out.print(a[i]+" ");
			 
		}
		}
	}
	
}
