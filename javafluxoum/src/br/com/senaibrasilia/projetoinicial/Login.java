package br.com.senaibrasilia.projetoinicial;


import java.awt.Container;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{

	private JButton btnLogar;
	private JLabel lblUsuario;
	private JLabel lblSenha;
	private JTextField txtUsuario;
	private JTextField txtSenha;
	private FlowLayout layout ;
	private  Container container;
      public Login () {
    	  
    	  
    	  super();
    	  
    	  layout =  new FlowLayout();
    	  container =  getContentPane();
    	  btnLogar  = new JButton("Logar");
    	  lblUsuario  = new JLabel("Usuario");
    	  lblSenha = new JLabel ("Senha");
    	  txtUsuario  =  new JTextField(40);
    	  txtSenha  =  new JPasswordField(40);
    	  
    	  
    	  add(lblUsuario);
    	  add(txtUsuario);
    	  add(lblSenha);
    	  add(txtSenha);
    	  add(btnLogar);
    	  setLayout (layout);
    	  
    	  btnLogar.addActionListener(this);
    	  
    	  setSize(800,600);
    	  
      }
    		  
    		  @Override
    		  
    		  public void actionPerformed(ActionEvent e) {
    			     
    			 String usuario = "Humberto";
    			 String senha = "123456";
    			 
 
    			 
    			 if (txtUsuario.getText().equals(usuario) && txtSenha.getText().equals(senha)) {
    				 
    				 JOptionPane.showMessageDialog(null,"Usuario Logado " );
    				 
    				 
    			 }else {
    				 
    				 
    				 JOptionPane.showMessageDialog(null,"Usuario ou senha invalida " );
    				 
    				 
    			 }
    	  
    	  
    		  }
    		  
}
    	  
      
      
      


