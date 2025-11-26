package pekan9_2511533018;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kalkulator_251153018 {

	private JFrame frame;
	private JTextField textField;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btn0;
	private JButton btnClear;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btnEqual;
	private JButton btn00;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btnDiv;
	private JButton btnPlus;
	private JButton btnSub;
	private JButton btnMul;
	private JButton btnDot;
	private JButton btnPercent;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator_251153018 window = new Kalkulator_251153018();
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
	public Kalkulator_251153018() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 392, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(16, 6, 359, 124);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if (textField.getText().length() > 0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.PLAIN, 16));
		btnBackspace.setBounds(16, 133, 89, 54);
		frame.getContentPane().add(btnBackspace);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Tombol input angka 7
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
				
			}
		});
		btn7.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn7.setBounds(16, 185, 89, 54);
		frame.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Tombol input angka 4
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
				
			}
		});
		btn4.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn4.setBounds(16, 237, 89, 54);
		frame.getContentPane().add(btn4);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Tombol input angka 1
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
				
			}
		});
		btn1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn1.setBounds(16, 288, 89, 54);
		frame.getContentPane().add(btn1);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btn0.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn0.setBounds(16, 340, 89, 54);
		frame.getContentPane().add(btn0);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnClear.setBounds(107, 133, 89, 54);
		frame.getContentPane().add(btnClear);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Tombol input angka 8
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
				
			}
		});
		btn8.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn8.setBounds(107, 185, 89, 54);
		frame.getContentPane().add(btn8);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Tombol input angka 5
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
				
			}
		});
		btn5.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn5.setBounds(107, 237, 89, 54);
		frame.getContentPane().add(btn5);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Tombol input angka 2
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
				
			}
		});
		btn2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn2.setBounds(107, 288, 89, 54);
		frame.getContentPane().add(btn2);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String answerString;
				second = Double.parseDouble(textField.getText());
				
				if (operation == "+")
				{
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "-")
				{
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "x")
				{
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "/")
				{
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "%")
				{
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnEqual.setBounds(197, 341, 89, 54);
		frame.getContentPane().add(btnEqual);
		
		btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Tombol input angka 00
				String number = textField.getText() + btn00.getText();
				textField.setText(number);
				
			}
		});
		btn00.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn00.setBounds(197, 133, 89, 54);
		frame.getContentPane().add(btn00);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Tombol input angka 9
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
				
			}
		});
		btn9.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn9.setBounds(197, 185, 89, 54);
		frame.getContentPane().add(btn9);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Tombol input angka 6
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
				
			}
		});
		btn6.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn6.setBounds(197, 237, 89, 54);
		frame.getContentPane().add(btn6);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				// Tombol input angka 3
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn3.setBounds(197, 288, 89, 54);
		frame.getContentPane().add(btn3);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDiv.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnDiv.setBounds(286, 289, 89, 54);
		frame.getContentPane().add(btnDiv);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnPlus.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnPlus.setBounds(286, 133, 89, 54);
		frame.getContentPane().add(btnPlus);
		
		btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnSub.setBounds(286, 186, 89, 54);
		frame.getContentPane().add(btnSub);
		
		btnMul = new JButton("x");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "x";
			}
		});
		btnMul.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnMul.setBounds(286, 238, 89, 54);
		frame.getContentPane().add(btnMul);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Tombol input titik
				String number = textField.getText() + btnDot.getText();
				textField.setText(number);
				
			}
		});
		btnDot.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnDot.setBounds(107, 341, 89, 54);
		frame.getContentPane().add(btnDot);
		
		btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPercent.setBounds(286, 341, 89, 54);
		frame.getContentPane().add(btnPercent);
	}
}
