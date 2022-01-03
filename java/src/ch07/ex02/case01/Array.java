package ch07.ex02.case01;

public class Array {
	public static void main(String[] args) {
		String[] strs  = new String[3];
		System.out.println(strs);
		
		Integer[] nums = new Integer[3];
		System.out.println(nums);
		
		int[] arr = new int[3];
		System.out.println(arr);
		
		System.out.printf("%d %d %d\n", arr[0], arr[1], arr[2]);
		// 배열 객체의 각 변수들의 이름은 자동으로 설정되고, 자동초기화된다.
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		System.out.printf("%d %d %d\n", arr[0], arr[1], arr[2]);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
			// 배열의 장점 = 변수명을 자동생성해준다.
		}
		System.out.println();
		
		// 값을 담을 수 있는 변수 : collection
		for(int i : arr) System.out.print(i + " ");
		int[] array = {0, 1, 2};
		array = new int[] {0, 1, 2};
	}
}