//*******************************
//@author: Robbin Woods 15201
//@version: 1.0
//Hoja de Trabajo 3
//Sort: metodos de ordenamiento
//*******************************

import java.lang.*;
import java.util.*;

public class Sort implements Comparable{
	private int miLista[];

	public Sort(int [] miLista){
		this.miLista=miLista;
	}

	public int[] selectionSort(){

	}

	public int[] insertionSort(){

	}

	public int[] mergeSort(){

	}

	public int[] quickSort(){

	}

	public int[] radixSort(){

	}


	public int[] getLista(){
		return miLista;
	}

	public void exit(){

	}

	public void deicidir(int desicion){
		if (desicion==0)
			selectionSor();
		else if(desicion==1)
			insertionSort();
		else if (desicion==2)
			mergeSort();
		else if(desicion==3)
			quickSort();
		else
			radixSort();
	}











}
