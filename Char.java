
public class Char 
{
	public static void main(String args[])
	{
		//char ch[]=new char[30];
	Scanner sc=new Scanner(System.in);
	char i,j;
	
	char ch[]= {'$','@','t','h','@','T','e','c','h','2','7','Y','E','a','r','$','2','4','/','7'};
     char vowel[]= {'a','e','i','o','u','A','E','I','O','U'};
	for(i=0;i<ch.length;i++)	
	{
		for(j=0;j<vowel.length;j++)
		{
			if(ch[i]==vowel[j])
			{
				System.out.println(ch[i]+" ");
			}
		}
	}
	
	
	}
}