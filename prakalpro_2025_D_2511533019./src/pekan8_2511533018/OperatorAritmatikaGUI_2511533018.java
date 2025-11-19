package pekan8_2511533018;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511533018 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAngka1;
	private JTextField txtAngka2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	} 
	
	private void pesanError(String pesan) {
		JOptionPane.showConfirmDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511533018 frame = new OperatorAritmatikaGUI_2511533018();
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
	public OperatorAritmatikaGUI_2511533018() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operator Aritmatika");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 438, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Angka 1");
		lblNewLabel_1.setBounds(16, 39, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Angka 2");
		lblNewLabel_1_1.setBounds(16, 91, 61, 16);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Operator");
		lblNewLabel_2.setBounds(16, 138, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hasil");
		lblNewLabel_3.setBounds(16, 189, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		txtAngka1 = new JTextField();
		txtAngka1.setBounds(89, 34, 130, 26);
		contentPane.add(txtAngka1);
		txtAngka1.setColumns(10);
		
		txtAngka2 = new JTextField();
		txtAngka2.setHorizontalAlignment(SwingConstants.LEFT);
		txtAngka2.setColumns(10);
		txtAngka2.setBounds(89, 86, 130, 26);
		contentPane.add(txtAngka2);
		
		txtHasil = new JTextField();
		txtHasil.setEnabled(false);
		txtHasil.setEditable(false);
		txtHasil.setHorizontalAlignment(SwingConstants.LEFT);
		txtHasil.setColumns(10);
		txtHasil.setBounds(89, 184, 130, 26);
		contentPane.add(txtHasil);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(89, 134, 130, 27);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.addActionListener(new ActionListener() {
			
			int hasil;
			
			public void actionPerformed(ActionEvent e) {
				
				// Pesan peringatan
				if (txtAngka1.getText().trim().isEmpty()) {
					pesanPeringatan("Inputkan angka 1");
				} else if (txtAngka2.getText().trim().isEmpty()) {
					pesanPeringatan("Inputkan angka 2");
				} else {
					try {
						int a = Integer.valueOf(txtAngka1.getText());
						int b = Integer.valueOf(txtAngka2.getText());
						int c = cbOperator.getSelectedIndex();
						
						// OP Penjumlahan
						if (c == 0) { hasil = a + b; }
						
						// OP Pengurangan
						if (c == 1) { hasil = a - b; }
						
						// OP Perkalian
						if (c == 2) { hasil = a * b; }
						
						// OP Pembagian
						if (c == 3) { hasil = a / b; }
						
						// OP Modulus
						if (c == 4) { hasil = a % b; }
						
						txtHasil.setText(String.valueOf(hasil));
					} catch (NumberFormatException ex) {
						pesanError("Angka 1 dan angka 2 tidak valid");
					}
				}
				
			}
			
		});
		btnNewButton.setBounds(225, 133, 117, 29);
		contentPane.add(btnNewButton);

	}
}
