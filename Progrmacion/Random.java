//******************************************
//@author: Robbin Woods 15201
//@version: 1.0
//Hoja de Trabajo 3
//Random: basado en un entero 
//		genera una lista de ese tama;o 
//		y lo llena de numeros pseudorandom
//******************************************

public class Random{
	private int[] lista;
	private int tamano;

	public void setLista(){
		//pre: miLista existe
		//post: llena miLista con 
		//numeros aleatorios
		miLista=new int[tamano];
		for(int i=0;i<tamano;i++){
			miLista[i]=(int)(Math.random()*3000+10);
		}
	}

	public int[] getLista(){
		return lista;
	}

	public Random(int tamano){
		this.tamano=tamano;
	}
}