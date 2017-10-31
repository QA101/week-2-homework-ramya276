
public class ArrayAssn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//basicPrint();
		dispArray();
		dispDoub();
		revArray();
		revDoub();
		prodArray();
		prodDoub();
		avgArray();
	}
	
	public static void basicPrint()

	{
		int myArray[]=new int[100];
	for(int i=0;i<100;i++)
	{
		myArray[i]=i*2;
	System.out.println("Value @ "+i+ " is "+myArray[i]);
	}
	
	}

	public static void dispArray()
	{
	
	int[] data= {27,51,33,-1,101};
	
	//System.out.println(data.length);
	for(int i=0;i<data.length;i++)
	{
		System.out.println(data[i]);
	}
	}
	
public static void dispDoub()
	{	
	double[] data= {27.98,51.96,33.5,-1.98,101.5};
	
	//System.out.println(data.length);
	for(int i=0;i<data.length;i++)
	{
		System.out.println(data[i]);
	}
}
	
	
public static void revArray()
{
	int revArray[]= {1,2,3,4,5};
	for(int j=4;j>=0;j--)
	{
	System.out.println("Value @ "+j+ " is "+revArray[j]);
	}
}

public static void revDoub()
{
	double revArray[]= {1.0,2.0,3.0,4.8,5.87};
	for(int j=4;j>=0;j--)
	{
	System.out.println("Value @ "+j+ " is "+revArray[j]);
	}
}

public static void prodArray()
{
int prodArray[]= {1,2,3,4};
int prod=1;
for (int elements:prodArray)
{
prod*=elements;
}
System.out.println("Prod:"+ prod);
}

public static void prodDoub()
{
double prodArray[]= {1.0,2.65,3,4.7};
	double prod=1.0;
	for (double elements:prodArray)
	{
	prod*=elements;
	}
	System.out.println("Prod:"+ prod);
	
	}

public static void avgArray()
{
double avg;
int total=0;
int[] inpArray= {1,2,3,4,5};
for(int mem:inpArray)
{
	total+=mem;
}
System.out.println("Total:"+total);
avg=total/inpArray.length;
System.out.println("Avg:"+avg);
	}
}
