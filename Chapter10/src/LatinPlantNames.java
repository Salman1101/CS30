import javax.swing.*;    






/*
Program: GUI.java          Last Date of this Revision: September,16,2022
Purpose:
Author: Salman Rahmani 
School: CHHS
Course: Computer Programming 30 
 
*/





import java.awt.event.*;    
public class LatinPlantNames {  
	
	
	
	
JFrame f;    
LatinPlantNames(){    
	
	
	
	f=new JFrame("LatinPlantNames");   
    
    
    
    
    
    
    
    final JLabel label = new JLabel();          
    label.setLocation(49, 100);
    label.setHorizontalAlignment(JLabel.CENTER);  
    label.setSize(253,20);  
    
    // enter button
    JButton b=new JButton("Enter");  
    b.setBounds(227,69,75,20);  
    
    // combo box
    String PlantNames[]={"Basil","Sage","Lavender","Parsely","Peppermint", "Saffron"};        
    final JComboBox cb=new JComboBox(PlantNames);    
    cb.setBounds(49, 69,124,20);    
    f.getContentPane().add(cb); f.getContentPane().add(label); f.getContentPane().add(b);    
    f.getContentPane().setLayout(null);    
    
    JLabel lblSelect = new JLabel("Select a plant name:");
    lblSelect.setBounds(47, 38, 126, 20);
    f.getContentPane().add(lblSelect);
    f.setSize(350,198);    
    f.setVisible(true);       
    

    // loop that allows for infinite entries
    while (1==1)
    
    
    b.addActionListener(new ActionListener() {  
        public void actionPerformed(ActionEvent e) {    

    
   String PlantName = (String) cb.getItemAt(cb.getSelectedIndex()); 
    
if (PlantName == "Basil") {
	
	label.setText("Latin Name: Ocimum");  
	
}

else if (PlantName == "Sage") {
	
	label.setText("Latin Name: Salvia");  
	
}

else if (PlantName == "Lavender") {
	
	label.setText("Latin Name: Lavandula Spica");  
	
}


else if (PlantName == "Parsely") {
	
	label.setText("Latin Name: Apium");  
	
}

else if (PlantName == "Peppermint") {
	
	label.setText("Latin Name: Mentha Piperita");  
	
}

else if (PlantName == "Saffron") {
	
	label.setText("Latin Name: Crocus");  
	
}



}  
});           
}    
public static void main(String[] args) {    
    new LatinPlantNames();         
}    
}    	