package day05;

public class Array10 {

	public static void main(String[] args) {

		// 다중 배열

		// 점 하나를 찍는다. => 점. ( 변수 )
		// int arr = 5;
		// 점이 모였다. => 선, ( 1차원 배열 )
		// 열 (행)
		// int [] arr = new int[5];

		// 선이 모였다. => 면 ( 2차원 배열 )
		// 행, 열
		int[][] arr3 = new int[2][];
		
		arr3[0] = new int[3];
		arr3[1] = new int[6];
		
		int n = 1000;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = n;
				n+=1000;
			}
		}
		
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.println(i + "행 / " + j + "열   " + arr3[i][j]);
			}
		}
/*
		// 2개
		int cnt = 1;
		// 값을 1씩 증가하면서 넣기.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt++;
			}
		}

		// 값이 들어있는 것을 확인.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(i + "행 / " + j + "열   " + arr[i][j]);
			}
		}

		// 길이는 알고, 값을 나중에 넣었다.
		// 값 또한 상태.
		// int [] arr = {1, 2, 3};
		int[][] arr2 = { { 100, 200, 300 }, { 400, 500, 600, 700, 800, 900 } };

		// 값이 들어있는 것을 확인.
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println(i + "행 / " + j + "열   " + arr2[i][j]);
			}
		}

		// 면이 모였다. => 공간 ( 3 차원 배열 )
		// 면, 행, 열
		// int [][][] arr = new int [1][2][3];
*/
	}

}