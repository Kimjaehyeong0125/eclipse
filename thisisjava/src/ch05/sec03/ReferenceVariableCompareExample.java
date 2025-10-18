package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		int[] arr1;		// 배열 변수 arr1선언
		int[] arr2;		// 배열 변수 arr2선언
		int[] arr3;		// 배열 변수 arr3선언
		
		arr1=new int[] {1,2,3};
		arr2=new int[] {1,2,3};
		arr3= arr2;
		
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
	}
}
