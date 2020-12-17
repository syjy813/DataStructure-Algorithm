package bubblesort;

import java.util.Scanner;

/*
 * �ݺ��� �Ͼ�� �ʾ��� �� �ٷ� �ݺ����� ������ �� �ְ� ����  
 */
public class BubbleSort2 {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void bubbleSort(int[] a) {
		for(int i = 0; i<a.length-1;i++) {
			int exchg = 0;
			for(int j = a.length-1; j > i;j--) {
				if(a[j-1] > a[j]) {
					swap(a, j-1, j);
					exchg++;
				}
			}
			if(exchg == 0) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��� ��: ");
		int nx = scan.nextInt();
		int[] x = new int[nx];


		for(int i = 0; i < nx;i++) {
			System.out.print("x["+i+"]: ");
			x[i] = scan.nextInt();
		}
		bubbleSort(x);
		System.out.println("�������� ���� ��");
		for(int i = 0; i < nx;i++) {
			System.out.print("x["+i+"]: "+x[i]);
		}
	}
}
