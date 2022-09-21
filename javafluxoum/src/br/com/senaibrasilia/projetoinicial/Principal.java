package br.com.senaibrasilia.projetoinicial;

import java.time.LocalDateTime;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		
		
		
		
		
		LocalDateTime hora = LocalDateTime.now();
		
		Login l  = new Login();
		l.setVisible(true);
		l.setTitle("SENAI Brasília - " + hora.getHour() + ":" + hora.getMinute() + ":" + hora.getSecond());
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 int[] numeros  =  new int [4];
		 
		 numeros [0] = 10;
		 numeros [1] = 20;
		 numeros [2] = 20;
		 numeros [3] = 20;
		 
		
		 double soma  = 0;
		 for(int i= 0;  i  <= 4; i++)
			 
		 {
		 
		 	
		soma += numeros[i];
		 
	     }
	  
		double media = soma / numeros.length;
		 
		 System.out.println("A soma e: " + soma);
		 System.out.println ("A média e: " +  media);
	 
  }
  
	
	

}


