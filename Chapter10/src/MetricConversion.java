import javax.swing.*;    
import java.awt.event.*;    
public class MetricConversion {    
JFrame f;    
MetricConversion(){    
	
	
	
	
    f=new JFrame("LatinPlantNames");   
    
    
    
    
    
    
    
    final JLabel label = new JLabel();          
    label.setLocation(26, 100);
    label.setHorizontalAlignment(JLabel.CENTER);  
    label.setSize(276,20);  
    
    // enter button
    JButton b=new JButton("Enter");  
    b.setBounds(227,69,75,20);  
    
    // combo box
    String Conversions[]={"Inch to Centimeter","Feet to Meter","Gallon to Liter","pound to kilogram"};        
    final JComboBox cb=new JComboBox(Conversions);    
    cb.setBounds(26, 69,161,20);    
    f.getContentPane().add(cb); f.getContentPane().add(label); f.getContentPane().add(b);    
    f.getContentPane().setLayout(null);    
    
    // title
    JLabel lblSelect = new JLabel("Select a conversion type:");
    lblSelect.setBounds(26, 38, 161, 20);
    f.getContentPane().add(lblSelect);
    f.setSize(350,198);    
    f.setVisible(true);       
    

    // loop that allows for infinite entries
    while (1==1)
    
    
    b.addActionListener(new ActionListener() {  
        public void actionPerformed(ActionEvent e) {    

    // if else statements
   String PlantName = (String) cb.getItemAt(cb.getSelectedIndex()); 
    
if (PlantName == "Inch to Centimeter") {
	
	label.setText("1 inch = 2.54 Centimeters");  
	
}

else if (PlantName == "Feet to Meter") {
	
	label.setText("1 Foot = 0.3048 Meters");  
	
}

else if (PlantName == "Gallon to Liter") {
	
	label.setText("1 Gallon = 4.5461 Liters");  
	
}


else if (PlantName == "pound to kilogram") {
	
	label.setText("1 Pound = 0.4536 kilograms");  
	
}




}  
});           
}    
public static void main(String[] args) {    
    new MetricConversion();         
}    
}    	