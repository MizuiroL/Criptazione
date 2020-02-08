package reti.graphic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextArea;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InsertMessage {
	
	private String message;
	
	private TextArea textArea;

	private JFrame frmInsertMessage;

	/**
	 * Launch the application.
	 */
	
	public static void open() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertMessage window = new InsertMessage();
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
	public InsertMessage() {
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
		
		textArea = new TextArea();
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
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				message = textArea.getText();
				
				frmInsertMessage.setVisible(false);
				
			}
		});
		button.setBackground(Color.GRAY);
		button.setFont(new Font("Castellar", Font.BOLD, 14));
		button.setBounds(297, 480, 200, 31);
		frmInsertMessage.getContentPane().add(button);
	}
	
	public String getMessage() {
		return message;
	}
}
