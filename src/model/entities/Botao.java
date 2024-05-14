package model.entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Botao extends JButton {

	
	private static final long serialVersionUID = 1L;
	private int largura;
	private int altura;
	private int lugarx;
	private int lugary;
	private String texto;
	
	public Botao(int largura, int altura, int lugarx, int lugary, String texto) {
		super();
		this.largura = largura;
		this.altura = altura;
		this.lugarx = lugarx;
		this.lugarx = lugarx;
		this.texto = texto;
		
		setSize(largura,altura);
		setText(texto);
		 addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	               
setText("apertou");
	            }
		});
		
	
	
	}}


