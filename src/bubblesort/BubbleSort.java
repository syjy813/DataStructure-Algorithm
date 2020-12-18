package src.bubblesort;



/*//버블정렬 
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

		System.out.println("버블 정렬(버전1)");
		System.out.println("요솟 수: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for(int i = 0;i<nx;i++) {
			System.out.println("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}

		bubbleSort(x, nx);

		System.out.println("내림차순 정렬했습니다.");
		for(int i = 0;i<nx;i++) {
			System.out.println("x[" + i + "]:"+x[i]);
		}
	}
}
