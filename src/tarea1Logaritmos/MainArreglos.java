package tarea1Logaritmos;

public class MainArreglos {

	public static void main(String[] args) {
		int size=20;
		//int[] sorted={0,1,2,3,4,5,6,7,8,9};
		//System.out.println(ArrayInstance.toString(sorted));
		int[] random=ArrayInstance.RandomGenerator(size);
		System.out.println(ArrayInstance.toString(random));
		int[] almostSorted=ArrayInstance.AlmostSortedGenerator(size);
		System.out.println(ArrayInstance.toString(almostSorted));

	}

}
