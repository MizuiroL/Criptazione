package reti.tempgui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;

import reti.criptazione.CrittatoreTemporaneo;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempGui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TempGui window = new TempGui();
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
	public TempGui() {
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

		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 32, 144, 168);
		frame.getContentPane().add(textPane);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(268, 32, 144, 168);
		frame.getContentPane().add(textArea);

		JLabel lblTextToEncrypt = new JLabel("Text to encrypt");
		lblTextToEncrypt.setBounds(32, 11, 91, 14);
		frame.getContentPane().add(lblTextToEncrypt);

		JLabel lblEncryptedText = new JLabel("Encrypted text");
		lblEncryptedText.setBounds(291, 11, 91, 14);
		frame.getContentPane().add(lblEncryptedText);

		JButton btnEncrypt = new JButton("Encrypt");
		btnEncrypt.setBounds(169, 107, 89, 23);
		frame.getContentPane().add(btnEncrypt);

		JSpinner spinner = new JSpinner();
		spinner.setBounds(169, 215, 89, 20);
		frame.getContentPane().add(spinner);

		JLabel lblChiave = new JLabel("Chiave");
		lblChiave.setBounds(189, 186, 46, 14);
		frame.getContentPane().add(lblChiave);

		btnEncrypt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(spinner.getValue());
				String encryptedText = CrittatoreTemporaneo.firstEncryption(textPane.getText(),
						(Integer) spinner.getValue());
				textArea.setText(encryptedText);
			}
		});
	}
}
