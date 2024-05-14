package model.entities;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Frame;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Tela extends  JFrame{
	private static final long serialVersionUID = 1L;
	
	JLabel label = new JLabel();
	GroupLayout layout;
	
	
	
	public Tela() {
		setVisible(true);
		setSize(300,200);
		setTitle("quiz ambiental");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		
		JButton jb = new JButton("Botao 1");
		
		
		JButton jb2 = new JButton("Botao 2");
		
		
		JButton jb3 = new JButton("Botao 3");
		
		
		JButton jb4 = new JButton("Botao 4");
		
		
		Container contentPane = this.getContentPane();
		
		GroupLayout layout = new GroupLayout(contentPane);
		contentPane.setLayout(layout);
		
		layout.setAutoCreateContainerGaps(true);
		layout.setAutoCreateGaps(true);
		
		layout.setHorizontalGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(jb)
				.addComponent(jb2)
				.addComponent(jb3)
				.addComponent(jb4)
				)
				);
		
		layout.setVerticalGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE))
				.addComponent(jb)
				.addComponent(jb2)
				.addComponent(jb3)
				.addComponent(jb4)
				);
		
	}
	
	

	
	
}
