package Ej3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej3 frame = new Ej3();
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
	public Ej3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Boton 1:");
		lblNewLabel.setBounds(22, 26, 46, 14);
		contentPane.add(lblNewLabel);
		
		final JLabel PulsadasBtn1 = new JLabel("0");
		PulsadasBtn1.setBounds(74, 26, 46, 14);
		contentPane.add(PulsadasBtn1);
		
		JLabel lblBoton = new JLabel("Boton 2:");
		lblBoton.setBounds(130, 26, 46, 14);
		contentPane.add(lblBoton);
		
		final JLabel PulsadasBtn2 = new JLabel("0");
		PulsadasBtn2.setBounds(186, 26, 46, 14);
		contentPane.add(PulsadasBtn2);
		
		JButton btn1 = new JButton("Boton 1");
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int num1=Integer.parseInt(PulsadasBtn1.getText());
				num1++;
				PulsadasBtn1.setText(""+num1);
				
			}
		});
		btn1.setBounds(10, 68, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Boton 2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num2=Integer.parseInt(PulsadasBtn2.getText());
				num2++;
				PulsadasBtn2.setText(""+num2);

			}
		});
		btn2.setBounds(130, 68, 89, 23);
		
		contentPane.add(btn2);
	}

}
