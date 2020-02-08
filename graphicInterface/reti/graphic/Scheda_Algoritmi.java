package reti.graphic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ButtonGroup;

public class Scheda_Algoritmi {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scheda_Algoritmi window = new Scheda_Algoritmi();
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
	public Scheda_Algoritmi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 526, 392);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 58, 189, 285);
		frame.getContentPane().add(panel);
		
		JLabel lblSelectIterationPolicy = new JLabel("SELECT ITERATION POLICY");
		lblSelectIterationPolicy.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSelectIterationPolicy.setForeground(new Color(255, 0, 0));
		panel.add(lblSelectIterationPolicy);
		
		JLabel label = new JLabel("                        ");
		panel.add(label);
		
		JRadioButton rdbtnCompleteIteration = new JRadioButton("COMPLETE ITERATION");
		buttonGroup.add(rdbtnCompleteIteration);
		rdbtnCompleteIteration.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(rdbtnCompleteIteration);
		
		JLabel label_1 = new JLabel("                        ");
		panel.add(label_1);
		
		JRadioButton rdbtnEvenIteration = new JRadioButton("EVEN ITERATION");
		buttonGroup.add(rdbtnEvenIteration);
		rdbtnEvenIteration.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(rdbtnEvenIteration);
		
		JLabel label_2 = new JLabel("                                                ");
		panel.add(label_2);
		
		JRadioButton rdbtnOddIteration = new JRadioButton("ODD ITERATION");
		buttonGroup.add(rdbtnOddIteration);
		panel.add(rdbtnOddIteration);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(124, 10, 315, 38);
		frame.getContentPane().add(panel_1);
		
		JLabel lblSelectYourAlgorithm = new JLabel("SELECT THE PARAMETERS OF YOUR ALGORITHM");
		lblSelectYourAlgorithm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSelectYourAlgorithm.setForeground(new Color(255, 0, 0));
		panel_1.add(lblSelectYourAlgorithm);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(311, 58, 189, 285);
		frame.getContentPane().add(panel_2);
		
		JLabel lblSelectModificationPolicy = new JLabel("SELECT MODIFICATION POLICY");
		lblSelectModificationPolicy.setForeground(Color.RED);
		lblSelectModificationPolicy.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblSelectModificationPolicy);
		
		JLabel label_4 = new JLabel("                                      ");
		panel_2.add(label_4);
		
		JRadioButton rdbtnAddition = new JRadioButton("ADDITION");
		rdbtnAddition.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(rdbtnAddition);
		
		JLabel label_5 = new JLabel("                                            ");
		panel_2.add(label_5);
		
		JRadioButton rdbtnMultiplication = new JRadioButton("MULTIPLICATION");
		rdbtnMultiplication.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(rdbtnMultiplication);
		
		JLabel label_6 = new JLabel("                                                ");
		panel_2.add(label_6);
		
		JRadioButton rdbtnSubtraction = new JRadioButton("SUBTRACTION");
		panel_2.add(rdbtnSubtraction);
	}
}
