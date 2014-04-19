package tarea1Logaritmos;

import java.util.Random;

public class ArrayInstances {
	Random random=new Random();
	public int[] RandomGenerator(int size){
		int[] instance=new int[size]; //Crear arreglo
		for(int i=0;i<size;i++) //Llenar arreglo
			instance[i]=i+1;
		int aux,r;
		for(int j=0;j<size;j++){ //Hacer size permutaciones aleatorias
			r=random.nextInt(size)+1; //valor aleatorio entre 1 y size
			aux=instance[j]; // permutar j+1 con el valor aleatorio
			instance[j]=r;
			instance[r]=aux;
		}
		return instance;
		
	}
	public int[] AlmostSortedGenerator(int size ){
		int perms=size/10; //cantidad de permutaciones que se van a hacer
		int[] instance=new int[size]; //Crear arreglo
		for(int i=0;i<size;i++) //Llenar arreglo
			instance[i]=i+1;
		int aux,r1,r2;
		for(int j=0;j<perms;j++){ //Hacer size/10 permutaciones aleatorias
			r1=random.nextInt(size)+1; //2 valores aleatorios entre 1 y size
			r2=random.nextInt(size)+1;
			aux=instance[r1];  // permutar valores
			instance[r1]=r2;
			instance[r2]=aux;
		}
		return instance;	
	}
}
