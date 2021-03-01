package Ej6;

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

public class Ej6 extends JFrame {

	private JPanel contentPane;
	private JTextField altura;
	private JTextField peso;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej6 frame = new Ej6();
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
	public Ej6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Altura (m)");
		lblNewLabel.setBounds(10, 31, 104, 14);
		contentPane.add(lblNewLabel);
		
		altura = new JTextField();
		altura.setBounds(124, 28, 86, 20);
		contentPane.add(altura);
		altura.setColumns(10);
		
		peso = new JTextField();
		peso.setBounds(125, 71, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Peso (Kg)");
		lblNewLabel_1.setBounds(10, 74, 105, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Calcular IMC");
		
		btnNewButton.setBounds(0, 132, 104, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("IMC:");
		lblNewLabel_2.setBounds(125, 136, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		result = new JTextField();
		result.setEditable(false);
		result.setBounds(152, 133, 86, 20);
		contentPane.add(result);
		result.setColumns(10);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double alt=Double.parseDouble(altura.getText());
				double pes=Double.parseDouble(peso.getText());
				double res=pes/(Math.pow(alt, 2));
				String resultado=""+res;
				result.setText(resultado);
			}
		});
	}

}
