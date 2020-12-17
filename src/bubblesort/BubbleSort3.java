package bubblesort;

import java.util.Scanner;

public class BubbleSort3 {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[] a) {
		int k = 0;
		while(k < a.length-1) {
			int last = 0;
			
			for(int j = a.length-1; j > k; j--) {
				if(a[j-1] > a[j]) {
					swap(a, j-1,j);
					last = j;
				}
			}
			k = last;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("요솟 수: ");
		int nx = scan.nextInt();
		int[] x = new int[nx];


		for(int i = 0; i < nx;i++) {
			System.out.print("x["+i+"]: ");
			x[i] = scan.nextInt();
		}
		bubbleSort(x);
		System.out.println("오름차순 정렬 끝");
		for(int i = 0; i < nx;i++) {
			System.out.print("x["+i+"]: "+x[i]+"\t");
		}
	}

}
