package Ej4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class Ej4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej4 frame = new Ej4();
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
	public Ej4() {
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Eventos");
		lblNewLabel.setBounds(10, 123, 46, 14);
		contentPane.add(lblNewLabel);
		
		final JTextArea TextArea = new JTextArea();
		TextArea.setText("Texto Inicial");
		TextArea.setBounds(73, 11, 351, 239);
		contentPane.add(TextArea);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				TextArea.append("VentanaActivada \n");
			}
			@Override
			public void windowClosing(WindowEvent e) {
				TextArea.append("Cerrando Ventana... \n");

			}
			@Override
			public void windowOpened(WindowEvent e) {
				TextArea.append("VentanaAbierta \n");

			}
		});
		
		
	}
}
