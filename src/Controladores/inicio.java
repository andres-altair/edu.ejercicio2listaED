package Controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inicio 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		List<Integer> numeros = new ArrayList<Integer>();
		int a;
		do {
		System.out.println("escribe numeros enteros (si quieres salir escribe un numero => que cero)");
		a = sc.nextInt();
		numeros.add(a);
		
		}while (a > 0) ;  {System.out.println(numeros.toString());}
		
		for(int i=1; i < numeros.indexOf(numeros) ;i++)
		{
			for(int j=1; j<i ; j++) 
			{
				if(numeros(i)==numeros(j)) 
				{
					numeros(i)= 0;
					numeros(j)=0;	
				}
			}
		}
		
		numeros.forEach(null);
	}
}
