import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
Program: GUI.java          Last Date of this Revision: September,13,2022
Purpose:
Author: Salman Rahmani 
School: CHHS
Course: Computer Programming 30 
 
*/




public class SemesterAvg implements ActionListener {
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JTextField userText1;
	private static JTextField userText2;
	private static JButton button;
	private static JLabel output;
	private static JTextField jTextField;

    
	
	
		public static void main(String[] args) {
			
			// set window size
			
			JPanel panel = new JPanel();
			JFrame frame = new JFrame();
			frame.setSize(350, 250);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(panel);
			
			
			//User input
	
			panel.setLayout(null);
			

			userLabel = new JLabel("Enter the first grade:");
			userLabel.setBounds(10, 50, 380, 25);
			panel.add(userLabel);
	
			userText = new JTextField(20);
			userText.setBounds(150, 53, 50, 20);
			panel.add(userText);

		userLabel = new JLabel("Enter the second grade:");
		userLabel.setBounds(10, 80, 380, 25);
		panel.add(userLabel);

		userText1 = new JTextField(20);
		userText1.setBounds(150, 83, 50, 20);
		panel.add(userText1);

		userLabel = new JLabel("Enter the third grade:");
		userLabel.setBounds(10, 110, 380, 25);
		panel.add(userLabel);

		userText2 = new JTextField(20);
		userText2.setBounds(150, 113, 50, 20);
		panel.add(userText2);

	
	//Enter button
			button = new JButton("Enter");
			button.setBounds(220, 80, 80, 25);
			button.addActionListener(new SemesterAvg());
			panel.add(button);

			userLabel = new JLabel("Average:");
			userLabel.setBounds(10, 180, 380, 25);
			panel.add(userLabel);
	
		//average output
            output = new JLabel("");
			output.setBounds(65, 183, 50, 20);
			panel.add(output);

				  
			jTextField = new JTextField();
			jTextField.setBounds(63, 183, 50, 20);
			panel.add(jTextField);


		
			frame.setVisible(true);
	
		}
		
	
		@Override
		public void actionPerformed(ActionEvent e) {
			String G1 = userText.getText();
			String G2 = userText1.getText();
			String G3 = userText2.getText();
		
			
			
	//get values and calculate averages
			double Num = Double.parseDouble(G1);

			double Num1 = Double.parseDouble(G2);

			double Num2 = Double.parseDouble(G3);

           
			double AVG = ((Num+Num1+Num2)/3);
            
	//Round AVG to nearest hundredth
			var decimalF = new DecimalFormat("#.##");

			var AVG1 = decimalF.format(AVG);
			
			
			output.setText(AVG1+"%");

	
		}

	
			
		}

	
		
	
	/* Screen Dump
	
	
	
	 */