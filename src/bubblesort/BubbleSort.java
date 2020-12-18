package src.bubblesort;



/*//�������� 
 * 
 */
import java.util.Scanner;

public class BubbleSort {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void bubbleSort(int[] a, int n) {
		for(int i = 0; i < a.length-1; i++) {
			for(int j = a.length-1; j > i ;j--) {
				if(a[j-1] < a[j]) {
					swap(a, j-1, j);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("���� ����(����1)");
		System.out.println("��� ��: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for(int i = 0;i<nx;i++) {
			System.out.println("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}

		bubbleSort(x, nx);

		System.out.println("�������� �����߽��ϴ�.");
		for(int i = 0;i<nx;i++) {
			System.out.println("x[" + i + "]:"+x[i]);
		}
	}
}
