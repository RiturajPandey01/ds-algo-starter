import java.util.*;
public class bubble_sort 
{
	public static void sort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String ar[])
	{
		Scanner S=new Scanner(System.in);
		int n;
		System.out.println("Enter number of elements in array");
		n=S.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)
		{
			a[i]=S.nextInt();
		}
		System.out.println("Sorted array is");
		sort(a);
	}
}
