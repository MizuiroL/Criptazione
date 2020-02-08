package reti.graphic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextArea;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import java.awt.Button;

public class Insert_Message {

	private JFrame frmInsertMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insert_Message window = new Insert_Message();
					window.frmInsertMessage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Insert_Message() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInsertMessage = new JFrame();
		frmInsertMessage.setTitle("Insert message");
		frmInsertMessage.setBounds(200, 200, 758, 576);
		frmInsertMessage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInsertMessage.getContentPane().setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(107, 123, 539, 351);
		frmInsertMessage.getContentPane().add(textArea);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(146, 49, 456, 53);
		frmInsertMessage.getContentPane().add(panel);
		
		Label label = new Label("Enter the message you would like to encrypt");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Arial Nova Cond", Font.BOLD, 20));
		label.setAlignment(Label.CENTER);
		panel.add(label);
		
		Button button = new Button("CONFIRM");
		button.setBackground(Color.GRAY);
		button.setFont(new Font("Castellar", Font.BOLD, 14));
		button.setBounds(297, 480, 200, 31);
		frmInsertMessage.getContentPane().add(button);
	}
}
