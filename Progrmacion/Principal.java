//*******************************
//@author: Robbin Woods 15201
//@version: 1.0
//Hoja de Trabajo 3
//Main: comunicacion con el usuario
//*******************************
import java.util.Scanner;

public class Principal{
	public static void main(String args[]){
		
		Scanner usuario;

		do{
		System.out.println("BIENVENIDO");
		System.out.println("Escoga un metodo, o presiene cualquier tecla para salir");
		System.out.println("1. selectionSort");
		System.out.println("2. insertionSort");

		usuario = new Scanner(System.in);


		Random miRandom=new Random(10);
		miRandom.setLista();
		Externo miArchivo=new Externo();

		miArchivo.enviar(miRandom.getLista(),"C:/Users/rowor/Documents/Universidad del Valle/4to Semestre/ADT/Hojas de TRabajo/hoja3/datos.txt");

		Sort miSort=new Sort(miArchivo.recibir("C:/Users/rowor/Documents/Universidad del Valle/4to Semestre/ADT/Hojas de TRabajo/hoja3/datos.txt"));

		int temporal=usuario.nextInt();
		for(int i=0;i<miSort.getLista().length;i++)
			System.out.println(miSort.decidir(temporal)[i]);

		}while(usuario.nextInt()!=0);

	}
}