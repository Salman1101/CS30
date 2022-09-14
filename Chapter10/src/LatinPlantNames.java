import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

/*
Program: GUI.java          Last Date of this Revision: 
Purpose:
Author: Salman Rahmani 
School: CHHS
Course: Computer Programming 30 
 
*/




public class LatinPlantNames implements ActionListener {
	private static final JComboBox<Object> Basil = null;
	private static JComboBox<String> jComboBox;

    
	
	
		public static void main(String[] args) {
			
			// set window size 
			JPanel panel = new JPanel();
			JFrame frame = new JFrame();
			frame.setSize(280, 250);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(panel);
			
			
			
	
			panel.setLayout(null);
			
			JComboBox<Object> comboBox = new JComboBox<Object>();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Basil", "lavender", "parsley", " peppermint", "saffron", "sage"}));
			comboBox.setMaximumRowCount(6);
			comboBox.setBounds(49, 84, 149, 22);
			panel.add(comboBox);
			
			JLabel lblNewLabel = new JLabel("Select a plant name:");
			lblNewLabel.setBounds(49, 48, 149, 25);
			panel.add(lblNewLabel);
			
	
			if () {
				
				System.out.println("lou");
			}
			
			else 
				

			
			
			
			
			frame.setVisible(true);
	
		}




		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		}
		
	
	
	
		

	
		
	
	/* Screen Dump
	
	
	
	 */