package Array_1;

import java.util.Arrays;

public class greatest {

	public static void main(String[] args) {
		int arr []= {3,4,5,1,2};
		for(int i=0;i<arr.length-1;i++)
		{
         for(int j=i+1;j<arr.length;j++)
         {
         
        	 if(arr[i]>arr[j])
        	 {
        	 int temp;
        	 temp=arr[i];
        	 arr[i]=arr[j];
        	 arr[j]=temp;
        	 }
        	 
}
		}
         for(int i=0;i<arr.length;i++)
         {
        	System.out.println(arr[i]); 
        	 
        	 
	}
         int index=(arr.length-2);
        		 System.out.println("second highest number is  "+arr[index]);
}
}
