package tarea1Logaritmos;

import java.util.Random;

public class ArrayInstance {
	static Random random=new Random();
	public static int[] RandomGenerator(int size){
		int[] instance=new int[size]; //Crear arreglo
		for(int i=0;i<size;i++){ //Llenar arreglo
			instance[i]=i+1;
		}
		int aux,r;
		for(int j=0;j<size;j++){ //Hacer size permutaciones aleatorias
			r=random.nextInt(size); //valor aleatorio entre 0 y size-1
			aux=instance[r];
			instance[r]=instance[j];
			instance[j]=aux;
		}
		return instance;
		
	}
	public static int[] AlmostSortedGenerator(int size ){
		int perms=size/10; //cantidad de permutaciones que se van a hacer
		int[] instance=new int[size]; //Crear arreglo
		for(int i=0;i<size;i++) //Llenar arreglo
			instance[i]=i+1;
		int aux,r1,r2;
		for(int j=0;j<perms;j++){ //Hacer size/10 permutaciones aleatorias
			r1=random.nextInt(size); //2 valores aleatorios entre 1 y size
			r2=random.nextInt(size);
			aux=instance[r1];  // permutar valores
			instance[r1]=instance[r2];
			instance[r2]=aux;
		}
		return instance;	
	}
	public static String toString(int[] a){
		String r="";
		for(int i=0;i<a.length;i++)
			r+=a[i]+",";
		return r.substring(0, r.length()-1);
	}
}
