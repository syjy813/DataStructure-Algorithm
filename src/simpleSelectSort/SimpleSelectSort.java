package src.simpleSelectSort;

import java.util.Scanner;

public class SimpleSelectSort {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void simpleSelectSort(int[] a) {
		for(int i = 0;i<a.length-1;i++) {
			int min = i;
			for(int j = i+1;j<a.length;j++) {
				if(a[j] < a[min]) {
					min= j;
				}
			}
			swap(a, i, min);
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
		simpleSelectSort(x);
		System.out.println("오름차순 정렬 끝");
		for(int i = 0; i < nx;i++) {
			System.out.print("x["+i+"]: "+x[i]);
		}
	}
}
