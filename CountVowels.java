
public class CountVowels
{
	public static void main(String args[])
	{
		//char ch[]=new char[30];
	//Scanner sc=new Scanner(System.in);
	int i,j;
	int count=0,count1=0,sum=0;
	
	char ch[]= {'$','@','t','h','@','T','e','c','h','2','7','Y','E','a','r','$','2','4','/','7'};
    //char vowel[]= {'a','e','i','o','u','A','E','I','O','U'};
	for(i=0;i<ch.length;i++)	
	{
		
			if(ch[i]>=65&&ch[i]<=90||ch[i]>=97&&ch[i]<=122)
			{
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U');
				{
					count++;
					System.out.println(ch[i]);
				}
			}
		
			if(ch[i]>='0'&&ch[i]<='9')
			{
				count1++;
				//sum=sum+ch[i];
			}
		}
	
	System.out.println("vowel count is " + count);
	System.out.println("digits count is " + count1);
	
	
	
	
	
	}
	
	
	}
