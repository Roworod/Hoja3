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

	/**
	*@pre: miLista[] existe
	*@return: int []
	*/
	public int[] selectionSort(){
		return miLista;
	}

	/**
	*@pre: miLista[] existe
	*@return: int []
	*/
	public int[] insertionSort(){
		return miLista;
	}

	/**
	*@pre: miLista[] existe
	*@return: int []
	*/
	public int[] mergeSort(){
		return miLista;
	}

	/**
	*@pre: miLista[] existe
	*@return: int []
	*/
	public int[] quickSort(){
		return miLista;
	}

	/**
	*@pre: miLista[] existe
	*@return: int []
	*/
	public int[] radixSort(){
		return miLista;
	}

	/**
	*@pre: miLista[] existe
	*@return: int []
	*/
	public int[] getLista(){
		return miLista;
	}

	public void exit(){

	}

	/**
	*@pre: miLista[] existe
	*@return: int []
	*/
	public int[] deicidir(int desicion){
		if (desicion==0)
			return selectionSort();
		else if(desicion==1)
			return insertionSort();
		else if (desicion==2)
			return mergeSort();
		else if(desicion==3)
			return quickSort();
		else
			return radixSort();
	}


	public int compareTo(Object o){
		return 1;
	}
}
