public class Armstrongnumber
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[10];
	int n,i,temp1,temp2,rem,y,prod=1,sum=0,count=0;														//153=1*1*1*+5*5*5=3*3*3=153
	System.out.println("Enter the size of array");
	n=sc.nextInt();
	System.out.println("Enter the elements of a array");
	for(i=0;i<n;i++)
		a[i]=sc.nextInt();
	//int a[]= {20,153,370,371,372};
	for(i=0;i<n;i++)
	{
	   temp1=a[i];
				     
	      for(;temp1>0;)
	      {
		    temp1=temp1/10;
				count++;
		  }
				       temp2=a[i];
				     
				      for(;temp2>0;)
				      {
				      rem=temp2%10;   
				        y=count;    // result=(int)Math.pow(rem,count);
				         while(y>0)  
				         {
				        	 prod=prod*rem;//sum=sum+result;
				               y--;
				         }
				         sum=sum+prod;
				         
				          temp2=temp2/10;
				}
				if(count==a[i])
				 System.out.println("Aemstrong number is"+a[i]);
				}
			       
		}
	}


