package day0408;

public class Demo08 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		Demo06.Bubbling(arr);
		double aver = averageValue(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>aver){
				System.out.println(arr[i]);
			}
		}
		


	}
	public static double averageValue(int[] arrays) {
		int sum=0;
		for (int i = 0; i < arrays.length; i++) {
			sum+=arrays[i];
		}
		double aver = sum*1.0/arrays.length ;
		return aver;
		
	}

}
