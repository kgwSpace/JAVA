package 김건우;

public class 김건우 {
	
	public static void main(String[] args) {
		int[] avg = new int [] {56,44,87,90,68,98,77,90,97,98};
		bubbleSort(avg);
		printArray(avg);
	}
	
	public static int[] bubbleSort(int[] avg) {
		int temp=0;
		boolean swap = false;
		for(int j=0; j<9; j++) {
			for(int i=0;i<9;i++) 
			{
				if(avg[i]>avg[i+1]) 
				{
					temp = avg[i];
					avg[i] = avg[i+1];
					avg[i+1] = temp; 
					swap = true;
				}
			}
			if(swap == false) {
				break;
			}
			swap = false;
		 
		}
		return avg;
	}
	
	public static void printArray(int[] avg) {
		int a=10;
		for(int i=0;i<10;i++) 
		{
			System.out.println(avg[i]+"점 => "+a+"등");
			a--;
		}
		return;
	}
}
