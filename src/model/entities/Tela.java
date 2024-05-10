package model.entities;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Tela extends  JFrame{
	private static final long serialVersionUID = 1L;
	
	JLabel label = new JLabel("oi tu bem");
	
	
	
	
	public Tela() 
	{
		
		setSize(500,500);
		JPanel painel = new JPanel();
		JPanel painel2 = new JPanel();
		Botao b1 = new Botao(20, 20, 20,20, "pao");
		Botao b2 = new Botao(20, 20, 20,20, "sapo");
		setLayout(new BorderLayout());;
		painel.add(b1);
		painel.add(b2);
		painel2.add(label);
		add(painel2,  BorderLayout.NORTH);
		add(painel,  BorderLayout.CENTER);
	
		painel.add(label);
		
		setVisible(true);
		
		
		
		
		
	}
	
	

	
	
}
