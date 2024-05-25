package lab2_MLDM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class lab2_MLDM {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab2_MLDM window = new lab2_MLDM();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public lab2_MLDM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Лабораторная работа №2");
		frame.getContentPane().setBackground(new Color(64, 128, 128));
		frame.setBounds(100, 100, 924, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(291, 266, 446, 177);
		frame.getContentPane().add(textPane);
		
		JLabel lblNewLabel = new JLabel("ВВОД:");
		lblNewLabel.setBounds(10, 109, 41, 20);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(53, 98, 502, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("ПРИМЕНИТЬ");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Val val = new Val(textField.getText());
				Reflexivity Ref = new Reflexivity(textField.getText());
				Simmetric Sm = new Simmetric(textField.getText());
				SkewSimmetric Sk = new SkewSimmetric(textField.getText());
				Transitively Tr = new Transitively(textField.getText());
				
				StringBuilder properties = new StringBuilder();

				if (val.validate()) {
				    properties.append("Ошибка! Проверьте данные(ERROR:404)\n");
				} else {
				    if (Ref.checkReflexivity() == true) {
				        properties.append("Reflexivity\n");
				    } else {
				        properties.append("Not reflexivity\n");
				    }
				    
				    if (Sm.checkSimmetric() == true) {
				        properties.append("Simmetric\n");
				    } else {
				        properties.append("Not simmetric\n");
				    }
				    
				    if (Sk.checkSkewSimmetric() == true) {
				        properties.append("Skew simmetric\n");
				    } else {
				        properties.append("Not skew simmetric\n");
				    }
				    
				    if (Tr.checkTransitively() == false) {
				        properties.append("Transitively\n");
				    } else {
				        properties.append("Not transitively\n");
				    }
				}

				textPane.setText(properties.toString());
				
			}

		});
		btnNewButton.setBounds(41, 390, 180, 42);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
	}
}
