package calcolatrice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class calcolatrice {

	private JFrame frmCalcolatriceCarlo;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldResult;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcolatrice window = new calcolatrice();
					window.frmCalcolatriceCarlo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application. Test Git 2
	 */
	public calcolatrice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalcolatriceCarlo = new JFrame();
		frmCalcolatriceCarlo.setTitle("Calcolatrice Carlo");
		frmCalcolatriceCarlo.setBounds(100, 100, 429, 350);
		frmCalcolatriceCarlo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalcolatriceCarlo.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(10, 11, 86, 20);
		frmCalcolatriceCarlo.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setColumns(10);
		textFieldNum2.setBounds(99, 11, 86, 20);
		frmCalcolatriceCarlo.getContentPane().add(textFieldNum2);
		
		JLabel lblNewLabelResult = new JLabel("Il Risultato \u00E8: ");
		lblNewLabelResult.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabelResult.setBounds(10, 42, 86, 14);
		frmCalcolatriceCarlo.getContentPane().add(lblNewLabelResult);
		
		JLabel lblNewLabelRes = new JLabel("-");
		lblNewLabelRes.setBounds(108, 39, 77, 20);
		frmCalcolatriceCarlo.getContentPane().add(lblNewLabelRes);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ris;
			 try {
				num1=Integer.parseInt(textFieldNum1.getText());
				num2=Integer.parseInt(textFieldNum2.getText());
				
				ris=num1+num2;
				lblNewLabelRes.setText(Integer.toString(ris));
			}catch(Exception e2) {
				JOptionPane.showMessageDialog(null, "Valore Inserito Errato");
				}
			}
		});
		btnNewButton.setBounds(195, 10, 41, 23);
		frmCalcolatriceCarlo.getContentPane().add(btnNewButton);
		
		
		btnNewButton_2 = new JButton("-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ris;
				 try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ris=num1-num2;
					lblNewLabelRes.setText(Integer.toString(ris));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Valore Inserito Errato");
					}
			} 
		});
		btnNewButton_2.setBounds(235, 10, 41, 23);
		frmCalcolatriceCarlo.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("*");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				int num1, num2, ris;
				 try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ris=num1*num2;
					lblNewLabelRes.setText(Integer.toString(ris));
				}catch(Exception e3) {
					JOptionPane.showMessageDialog(null, "Valore Inserito Errato");
					}
			}
		});
		btnNewButton_2_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_2_1.setBounds(195, 38, 41, 23);
		frmCalcolatriceCarlo.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("/");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				int num1, num2, ris;
				 try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ris=num1/num2;
					lblNewLabelRes.setText(Integer.toString(ris));
				}catch(Exception e4) {
					JOptionPane.showMessageDialog(null, "Valore Inserito Errato");
					}
			}
		});
		btnNewButton_2_1_1.setBounds(235, 38, 41, 23);
		frmCalcolatriceCarlo.getContentPane().add(btnNewButton_2_1_1);
		

	}
}
