
public class ForLoopAssn {

	public static void main(String[] args) {
		// TODO Auto-generated method stubibt 
		int a = 9;
forAster();
forNumTwo();
forDollar(a);
printEven();	
printJ();	
printL();
printM();
	}

	
	public static void forAster()
	{
		for(int rowLoop=1;rowLoop<=4;rowLoop++)
	{
		for(int aster=1;aster<=7;aster++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
		System.out.println();
	}

	public static void forNumTwo()
	{
		for(int rowTwo=1;rowTwo<=4;rowTwo++)
	{
		for(int colTwo=1;colTwo<=rowTwo;colTwo++)
		{
			System.out.print("2 ");
		}
		System.out.println();
	}
		System.out.println();
	}
	
	
	public static void forDollar(int a)
	{
	  for(int  b=1; b<a;b++) {
		  if (b % 2 != 0){
			  for(int c=0; c<b; c++) {
		     System.out.print("$ ");
			  }
			  System.out.println();
		  }
		   
		  }  
		  
	  } 
	public static void printEven()
	{
		for(int oLoop=1;oLoop<10;oLoop++)
		{
			if(oLoop%2==0)
			{
				for(int iLoop=0;iLoop<oLoop;iLoop++)
				{
					System.out.print("* ");
				}
			}
			 System.out.println();
		}
		 
	}

public static void printJ()
{
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println();	
}

public static void printL()
{
	for(int k=1;k<=3;k++)
	{
		for(int l=1;l<=(2*k)+1;l++)
		{
			System.out.print(l+" ");
		}
		System.out.println();
	}
	System.out.println();	
}

public static void printM()
	{
		for(int m=1;m<=4;m++)
		{
			for(int n=1;n<=((2*m)-1);n++)
			{
				System.out.print(m+" ");
			}
			System.out.println();
		}	
	}
		
}