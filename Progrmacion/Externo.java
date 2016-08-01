//************************************************
//@author: Robbin Woods 15201
//@version: 1.0
//Hoja de Trabajo 3
//Externo: escribe y lee un archivo externo .txt
//************************************************

import java.nio.file.*;
import java.io.BufferedWriter;
import java.nio.*;
import java.io.*;
public class Externo{
	/**
	*@post: crea un txt con la lista recibida
	*		en la direccion recibida
	*/
	public void enviar(int[] lista, String path){
		File file=new File(path);

		try {
			FileWriter f=new FileWriter(file);
			BufferedWriter b=new BufferedWriter(f);
			String temp2=Integer.toString(lista[0]);
			for (int i=1;i<lista.length;i++){
				int temp1=lista[i];	
				String temporal=Integer.toString(temp1);
				temp2=temp2 + ";\n" + temporal;	
			}
			b.write(temp2);
			b.close();
			f.close();
		}
		catch (Exception e){
			System.out.println("error");
		}
	}

	/**
	*@retun: int[]
	*/
	public int[] recibir(String path){
		int[] tempLista=new int[10];
		BufferedReader br=null;
		int i=0;
		try {
		br=new BufferedReader(new FileReader(path));
		String tempString;
		while((tempString=br.readLine()) !=null){
			String[] tempSplit=tempString.split(";");
			tempLista[i]=Integer.parseInt(tempSplit[0]);
			i++;
		}
		}catch(IOException e){
			System.out.println("Otra vez error mano?");
			
		}
		finally{
			try{
				if(br != null)
					br.close();
			}
			catch (IOException ex){
				System.out.println("ANOTHER ONE");
			}
		}
		return tempLista;
	}
}