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
		String temp2="";
		for (int i=0;i<lista.length;i++){
			int temp1=lista[i];	
			String temporal=Integer.toString(temp1);
			temp2=temp2 + ";" + temporal;	
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
	public String recibir(String path){
		try {
			FileInputStream dirtxt;
			dirtxt = new FileInputStream(direccionx);
			DataInputStream lineas = new DataInputStream(dirtxt);
			BufferedReader memoriabuf = new BufferedReader(new InputStreamReader(lineas));
			operaciones=memoriabuf.readLine();
			lineas.close();
		}catch(Exception e){
			System.err.println("Error Fatal");
			
		}
	}
}