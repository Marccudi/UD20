package Ej5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ej5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej5 frame = new Ej5();
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
	public Ej5() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLimpiar = new JButton("Limpiar");

		btnLimpiar.setBounds(177, 0, 89, 23);
		contentPane.add(btnLimpiar);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 23, 414, 227);
		contentPane.add(textArea);
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				textArea.append("Ratón entró a la ventana \n");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				textArea.append("Ratón salió de la ventana \n");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.append("Ratón hizo click en la ventana \n");
			}
		});
		
		
		
	}

}
