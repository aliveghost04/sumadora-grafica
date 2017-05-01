package edu.itla.sumadora.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd, btnResultado;
	JTextField pantalla;
	JPanel panel;
	boolean pantallaLimpia = true;
	long numero1, numero2, resultado;
	
	public Gui(){
		construirGui();
	}
	
	public void construirGui(){
		
		setTitle("Sumadora");
		panel = new JPanel();
		panel.setLayout(new GridLayout(4,3));
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(210, 280);
		setLocationRelativeTo(null);
		setResizable(false);
		
		// Creando pantalla
		pantalla = new JTextField("0", 12);
		pantalla.setBounds(2, 2, 200, 45);
		Font fontPantalla = new Font("Comic Sans", Font.LAYOUT_RIGHT_TO_LEFT, 36);
		pantalla.setFont(fontPantalla);
		pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setEnabled(false);
        pantalla.setBackground(Color.white);
		
		Font fuenteNumeros = new Font("Arial", Font.CENTER_BASELINE, 18);
		// Creando botones
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent event){
				if (pantalla.getText().equals("0")){
				return;
				} 
				if(pantallaLimpia == true){
					pantalla.setText("0");
				} else {
					pantalla.setText(pantalla.getText() + "0");
				}
			}
		});
		
		btn0.setFont(fuenteNumeros);
		btn0.setForeground(Color.blue);
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btnAdd = new JButton("+");
		btnResultado = new JButton("=");
		
		// Agregando funciones a los botones
		
		btn1.addActionListener(new Btn1());
		btn2.addActionListener(new Btn2());
		btn3.addActionListener(new Btn3());
		btn4.addActionListener(new Btn4());
		btn5.addActionListener(new Btn5());
		btn6.addActionListener(new Btn6());
		btn7.addActionListener(new Btn7());
		btn8.addActionListener(new Btn8());
		btn9.addActionListener(new Btn9());
		btnAdd.addActionListener(new BtnAdd());
		btnResultado.addActionListener(new BtnResultado());
		
		// Añadiendo botones y la pantala a la ventana
		panel.add(btn9);
		panel.add(btn8);
		panel.add(btn7);
		panel.add(btn6);
		panel.add(btn5);
		panel.add(btn4);
		panel.add(btn3);
		panel.add(btn2);
		panel.add(btn1);
		panel.add(btn0);
		panel.add(btnAdd);
		panel.add(btnResultado);
		add(panel);
		add(pantalla);
		panel.setBounds(1, 50, 200, 200);
		setVisible(true);
	}
	
	class Btn1 implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			if (pantallaLimpia == true){
				pantalla.setText("1");
				pantallaLimpia = false;
			} else {
				pantalla.setText(pantalla.getText() + "1");
			}
		}
	}
	
	class Btn2 implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			if (pantallaLimpia == true){
				pantalla.setText("2");
				pantallaLimpia = false;
			} else {
				pantalla.setText(pantalla.getText() + "2");
			}
		}
	}
	
	class Btn3 implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			if (pantallaLimpia == true){
				pantalla.setText("3");
				pantallaLimpia = false;
			} else {
				pantalla.setText(pantalla.getText() + "3");
			}
		}
	}
	
	class Btn4 implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			if (pantallaLimpia == true){
				pantalla.setText("4");
				pantallaLimpia = false;
			} else {
				pantalla.setText(pantalla.getText() + "4");
			}
		}
	}
	
	class Btn5 implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			if (pantallaLimpia == true){
				pantalla.setText("5");
				pantallaLimpia = false;
			} else {
				pantalla.setText(pantalla.getText() + "5");
			}
		}
	}
	
	class Btn6 implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			if (pantallaLimpia == true){
				pantalla.setText("6");
				pantallaLimpia = false;
			} else {
				pantalla.setText(pantalla.getText() + "6");
			}
		}
	}
	
	class Btn7 implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			if (pantallaLimpia == true){
				pantalla.setText("7");
				pantallaLimpia = false;
			} else {
				pantalla.setText(pantalla.getText() + "7");
			}
		}
	}
	
	class Btn8 implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			if (pantallaLimpia == true){
				pantalla.setText("8");
				pantallaLimpia = false;
			} else {
				pantalla.setText(pantalla.getText() + "8");
			}
		}
	}
	
	class Btn9 implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			if (pantallaLimpia == true){
				pantalla.setText("9");
				pantallaLimpia = false;
			} else {
				pantalla.setText(pantalla.getText() + "9");
			}
		}
	}
	
	class BtnAdd implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			pantallaLimpia = true;
			numero1 = Long.parseLong(pantalla.getText());
		}
	}
	
	class BtnResultado implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			pantallaLimpia = true;
			numero2 = Long.parseLong(pantalla.getText());
			resultado = numero1 + numero2;
			
			pantalla.setText(Long.toString(resultado));
		}
	}
	
}
