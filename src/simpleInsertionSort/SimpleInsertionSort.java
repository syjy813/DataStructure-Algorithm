package src.simpleInsertionSort;

import java.util.Scanner;

public class SimpleInsertionSort {
	
	static void insertionSort(int[] a, int n) {
		for(int i = 1; i < n;i++) {
			int j;
			int temp = a[i];
			for(j = i;j>0 && a[j-1] > temp;j--) {
				a[j] = a[j-1];
			}
			a[j] = temp;
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
		insertionSort(x, nx);
		System.out.println("오름차순 정렬 끝");
		for(int i = 0; i < nx;i++) {
			System.out.print("x["+i+"]: "+x[i]);
		}
	}
}
