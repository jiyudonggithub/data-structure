package day0404;

//import java.util.Arrays;

public class Demo04 {

	public static void main(String[] args) {
		int[] arr = {1,8,3,9,6,23,16};
		int b=0;
		int a=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0){
				b++;
			}else {
				a++;
			}
			
		}
		System.out.println("奇数的个数:"+a+"偶数的个数"+b);
		/*arr[a]=arr[arr.length-1];
		arr[arr.length-1]=max;
		System.out.println(max);
		System.out.println("交换后："+Arrays.toString(arr));*/

	}

}
