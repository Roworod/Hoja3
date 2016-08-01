//******************************************
//@author: Robbin Woods 15201
//@version: 1.0
//Hoja de Trabajo 3
//Random: basado en un entero 
//		genera una lista de ese tama;o 
//		y lo llena de numeros pseudorandom
//******************************************

public class Random{
	private int[] miLista;
	private int tamano;

	/**
	*@pre: miLista existe
	*@post: llena miLista con 
	*numeros aleatorios
	*/
	public void setLista(){
		miLista=new int[tamano];
		for(int i=0;i<tamano;i++){
			miLista[i]=(int)(Math.random()*3000+10);
		}
	}

	/**
	*@return: int[]
	*/
	public int[] getLista(){
		return miLista;
	}

	/**
	*@pre: int tamano existe
	*@post: this.tamano=tamano
	*/
	public Random(int tamano){
		this.tamano=tamano;
	}
}