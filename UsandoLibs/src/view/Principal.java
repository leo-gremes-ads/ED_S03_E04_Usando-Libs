package view;

import java.util.Arrays;
import lib.controller.*;

public class Principal
{
	public static void main(String[] args)
	{
		int[] ex1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] ex2 = {44, 43, 42, 41, 40, 39, 38};
		BubbleSortController bSort = new BubbleSortController();
		MergeSortController mSort = new MergeSortController();
		
		int[] ex1Bubble = ex1;
		System.out.println("Exercício 1: Original    -> " + Arrays.toString(ex1));
		bSort.bubbleSort(ex1Bubble);
		System.out.println("Exercício 1: Bubble Sort -> " + Arrays.toString(ex1Bubble));
		int[] ex1Merge = ex1;
		mSort.mergeSort(ex1Merge, 0, ex1Merge.length - 1);
		System.out.println("Exercício 1: Merge Sort  -> " + Arrays.toString(ex1Merge));
		System.out.println("----------------------------------------------------------");
		int[] ex2Bubble = ex2;
		System.out.println("Exercício 2: Original    -> " + Arrays.toString(ex2));
		bSort.bubbleSort(ex2Bubble);
		System.out.println("Exercício 1: Bubble Sort -> " + Arrays.toString(ex2Bubble));
		int[] ex2Merge = ex2;
		mSort.mergeSort(ex2Merge, 0, ex2Merge.length - 1);
		System.out.println("Exercício 1: Merge Sort  -> " + Arrays.toString(ex2Merge));
	}
}