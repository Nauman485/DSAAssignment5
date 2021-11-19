package geekster;

public class Sort_0_1_2 {
	public static void main(String []args) {
	   int arr[]= {2,0,1,2,0,0,2,2};
	   int low=0, high=arr.length-1, mid=0;
	   while(mid<=high) {
		   switch(arr[mid]) {
		   case 0:{
			  int  temp=arr[mid];
			   arr[mid]=arr[low];
			   arr[low]=temp;
			   low++;
			   mid++;
			   break;
		   }
		   case 1:{
			mid++;
			break;
		   }
		   case 2:{
			   int temp=arr[high];
			   arr[high]=arr[mid];
			   arr[mid]=temp;
			   high--;
			   break;
		   }
		   }
	   }
	   for(int i:arr) {
		   System.out.print(i+" ");
	   }
	}

}
