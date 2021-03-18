package Keller.Cedric.Chapter7.Java.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField textFieldNum;
	private JTextField textFieldDen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNum = new JLabel("numerator");
		lblNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum.setBounds(0, 0, 130, 16);
		frame.getContentPane().add(lblNum);
		
		textFieldNum = new JTextField();
		textFieldNum.setBounds(0, 16, 130, 26);
		frame.getContentPane().add(textFieldNum);
		textFieldNum.setColumns(10);
		
		JLabel lblDen = new JLabel("denominator");
		lblDen.setHorizontalAlignment(SwingConstants.CENTER);
		lblDen.setBounds(0, 42, 130, 16);
		frame.getContentPane().add(lblDen);
		
		textFieldDen = new JTextField();
		textFieldDen.setBounds(0, 58, 130, 26);
		frame.getContentPane().add(textFieldDen);
		textFieldDen.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer.setBounds(0, 100, 130, 16);
		frame.getContentPane().add(lblAnswer);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					double numerator = Double.parseDouble(textFieldNum.getText());
					double denominator = Double.parseDouble(textFieldNum.getText());
					SimpleMath mathResult = new SimpleMath();
					var result =  mathResult.divide(numerator, denominator);
					lblAnswer.setText(String.valueOf(result));
				} catch(Exception ArithmeticException){
					lblAnswer.setText("Cannot divide by 0");
				}
			}
		});
		btnCalculate.setBounds(0, 132, 130, 29);
		frame.getContentPane().add(btnCalculate);
	}
}
