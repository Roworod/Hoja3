//*******************************
//@author: Robbin Woods 15201
//@version: 1.0
//Hoja de Trabajo 3
//Main: comunicacion con el usuario
//*******************************

public class Principal{
	public static void main(String args[]){
		
		Random miRandom=new Random(3);
		miRandom.setLista();
		Sort miSort=new Sort(miRandom.getLista());
		Externo miArchivo=new Externo();

		System.out.println(miRandom.getLista());

		miArchivo.enviar(miRandom.getLista(),"C:/Users/rowor/Documents/Universidad del Valle/4to Semestre/ADT/Hojas de TRabajo/hoja3/datos.txt");
	}
}