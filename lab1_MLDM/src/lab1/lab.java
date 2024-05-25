package lab1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class lab {

	private JFrame frame;
	public JTextField setA;
	public JTextField setB;
	public JLabel resultLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab window = new lab();
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
	public lab() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Множества и операции над  ними");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		setA = new JTextField();
		setA.setBounds(128, 30, 241, 20);
		frame.getContentPane().add(setA);
		setA.setColumns(10);
		
		setB = new JTextField();
		setB.setBounds(128, 73, 246, 20);
		frame.getContentPane().add(setB);
		setB.setColumns(10);
		
		JButton btnNewButton = new JButton("Выполнение операций");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultLabel.setText(" ");
				Validate V_operation = new Validate(setA.getText(), setB.getText());
				Union U_operation = new Union(setA.getText(), setB.getText());
				Intersection I_operation = new Intersection(setA.getText(), setB.getText());
				Addition AB_operation = new Addition(setA.getText(), setB.getText());
				SymmetricDifference S_operation = new SymmetricDifference(setA.getText(), setB.getText());
				if (V_operation.validate()) {
					resultLabel.setText("Ошибка");
				}
				else {
					resultLabel.setText("<html>Результат<br>"
				+"Обьединение : "+U_operation.union()+"<br>" 
				+"Пересечение : "+I_operation.intersection()+"<br>"
				+"Дополнение A/B : "+AB_operation.additionAB()+"<br>"
				+"Дополнение B/A : "+AB_operation.additionBA()+"<br>"+
				"Симметрическая разность : "+S_operation.symetric()+"</html>");
				}
			}
		});
		btnNewButton.setBounds(162, 104, 178, 33);
		frame.getContentPane().add(btnNewButton);
		
		JLabel textA = new JLabel("Множество А");
		textA.setBounds(22, 33, 96, 14);
		frame.getContentPane().add(textA);
		
		JLabel textB = new JLabel("Множество В");
		textB.setBounds(22, 76, 96, 14);
		frame.getContentPane().add(textB);
		
		resultLabel = new JLabel("");
		resultLabel.setBackground(new Color(192, 192, 192));
		resultLabel.setBounds(0, 138, 434, 123);
		frame.getContentPane().add(resultLabel);
	}
}
