package Ej7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej7 extends JFrame {

	private JPanel contentPane;
	private JTextField num;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej7 frame = new Ej7();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ej7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		lblNewLabel.setBounds(10, 32, 129, 14);
		contentPane.add(lblNewLabel);
		
		num = new JTextField();
		num.setBounds(118, 29, 86, 20);
		contentPane.add(num);
		num.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setBounds(232, 32, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setBounds(291, 29, 86, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		final JButton btnEuroToPeseta = new JButton("Euros a pesetas");

		btnEuroToPeseta.setBounds(20, 94, 184, 23);
		contentPane.add(btnEuroToPeseta);
		
		JButton cambiar = new JButton("Cambiar");
		
		cambiar.setBounds(267, 60, 89, 23);
		contentPane.add(cambiar);
		
		final JButton btnPesetaToEuro = new JButton("Pesetas a euros");
		btnPesetaToEuro.setEnabled(false);
		btnPesetaToEuro.setBounds(20, 60, 184, 23);
		contentPane.add(btnPesetaToEuro);
		
		cambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (btnEuroToPeseta.isEnabled()) {
					btnEuroToPeseta.setEnabled(false);;
					btnPesetaToEuro.setEnabled(true);
				}else {
					btnEuroToPeseta.setEnabled(true);
					btnPesetaToEuro.setEnabled(false);
				}
				
			}
		});
		
		btnEuroToPeseta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero = Double.parseDouble(num.getText());
				numero*=166.386;
				resultado.setText(""+numero);
			}
		});
		btnPesetaToEuro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero = Double.parseDouble(num.getText());
				numero/=166386;
				resultado.setText(""+numero);
			}
		});
		
	}

}
