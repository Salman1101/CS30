import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
Program: GUI.java          Last Date of this Revision: September, 14, 2022
Purpose:
Author: Salman Rahmani 
School: CHHS
Course: Computer Programming 30 
 
*/




public class DivisibleBy3 implements ActionListener {
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JButton button;
	private static JTextField jTextField;
	private static JLabel output;

    
	
	
		public static void main(String[] args) {
			
			// set window size 
			JPanel panel = new JPanel();
			JFrame frame = new JFrame();
			frame.setSize(280, 250);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(panel);
			
			
			
	
			panel.setLayout(null);
			
		//Prompt User for input
			
			userLabel = new JLabel("Enter an integer:");
			userLabel.setBounds(10, 50, 105, 25);
			panel.add(userLabel);
	
			userText = new JTextField(20);
			userText.setBounds(114, 52, 50, 20);
			panel.add(userText);
		


	
	//Enter button
			button = new JButton("Enter");
			button.setBounds(174, 50, 80, 25);
			button.addActionListener(new DivisibleBy3());
			panel.add(button);

	// text output
			output = new JLabel("");
			output.setBounds(12, 86, 177, 20);
			panel.add(output);

				  
			jTextField = new JTextField();
			jTextField.setBounds(10, 86, 177, 20);
			panel.add(jTextField);


		
			frame.setVisible(true);
	
		}
		
	
		@Override
		public void actionPerformed(ActionEvent e) {
			String G1 = userText.getText();
		
			
			
	//Get user's integer 
			double Num = Double.parseDouble(G1);

			// divide integer by 3
			int Num1 = (int) (Num/3);
			
			// get quotient and multiply by 3
			int Num2 = Num1*3;
			
			// subtract quotient*3 from the original integer 
			int ACT1 = (int) (Num-Num2);
			
			

            // determine whether or not integer is divisible by 3 and output answer 
			
			if (ACT1 >0) {

				output.setText("Number is not divisible by 3");
			
			} else {
				output.setText("Number is divisible by 3");
			}

			
		

	
		}

	
			
		}

	
		
	
	/* Screen Dump
	
	
	
	 */