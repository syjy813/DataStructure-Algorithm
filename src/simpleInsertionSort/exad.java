package src.simpleInsertionSort;

public class exad {

	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 10;
		a[1] = 11;
		a[2] = 12;
		
		int temp = a[0];
		a[0] = a[2];
		a[1] = temp;
	for(int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	}

}
