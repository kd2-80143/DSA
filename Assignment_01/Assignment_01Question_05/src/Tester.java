import java.util.Scanner;

public class Tester {

	public static int nonRepeatingElement(int arr[],int size)
	{
		
		for(int i = 0 ; i < size ; i++)
		{
			int count = 0;
			for(int j = i+1 ; j < size ;j++)
			{
				
				if(arr[i]==arr[j])
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,-1,2,1,0,4,-1,7,8};
		int index = nonRepeatingElement(arr,arr.length);
		if(index != -1)
		{	
			System.out.println("First non-repeating element : " + index);
		}
		else
		{
			System.out.println("All are repeating elements");
		}
		

	}

}
