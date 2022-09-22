package br.com.senai.cronometro;

import java.awt.*; // gerenciadores de layout
import java.awt.event.*;
import javax.swing.*;
import  java.util.*;

/**
 * 
 * @author Jose Humberto Pedro Soares
 *@category
 *@
 */

public class Cronometro implements  ActionListener {
	
		
	JLabel  jlab;
	
	long start;
	
	JButton btnStart  =  new JButton ("Start");
	JButton btnStop  =  new JButton ("Stop");
	
	
	public Cronometro() {  //Criando um construtor JFrame uma caixa seguindo padrões
		
		JFrame jfrm = new JFrame("Senai - Curso Java");
		
		jlab = new JLabel("Pressione Start para iniciar o tempo");
		
		btnStart.addActionListener(this);
		btnStop.addActionListener(this);
		
		jfrm.setLayout(new FlowLayout());
		
		jfrm.add(btnStart);
		jfrm.add(btnStop);
		jfrm.add(jlab);
		
		jfrm.setSize(500, 150);
		jfrm.setVisible(true);
		
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	
	public void actionPerformed (ActionEvent e) {
		
		Calendar cal  =  Calendar.getInstance();
		 
		if  (e.getActionCommand().equals("Start")) {
			
			start = cal.getTimeInMillis();
			jlab.setText("O conometro esta em:  ");
			
		}else {
			
			
			jlab.setText("O  tempo decorrido foi: " +  (double) (cal.getTimeInMillis()-start) /1000);
		}
			
			
		}
				
	}
	