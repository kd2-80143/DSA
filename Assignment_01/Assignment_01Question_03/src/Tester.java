import java.util.Scanner;

public class Tester {
	
	public static int DescBinarySearch(int arr[], int size, int key)
	{
		int left = 0, right = size-1, mid;
		while(left<=right)
		{
			mid = (left+right)/2;
			if(key==arr[mid])
			{
				return mid;
			}
			else if(key>arr[mid])
			{
				right = mid-1;
			}
			else
			{
				left = mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {90,80,70,60,50,40,30,20,10};
		System.out.println("Enter the element to search");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		int index = DescBinarySearch(arr,arr.length,key);
		if(index!=-1)
		{
			System.out.println("Element is found at index " +index);
		}
		else
		{
			System.out.println("Index not found");
		}

	}

}
