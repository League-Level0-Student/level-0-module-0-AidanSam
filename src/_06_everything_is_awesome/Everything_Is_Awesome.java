package _06_everything_is_awesome;

import javax.swing.JOptionPane;

public class Everything_Is_Awesome {

	public static void main(String[] args) {
		
		String awesome = JOptionPane.showInputDialog("What do you like?");
		
		JOptionPane.showMessageDialog(null, awesome + " is awesome!");
		
		
	}
	
	
}
