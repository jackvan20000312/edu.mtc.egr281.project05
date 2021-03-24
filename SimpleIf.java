package inClass;
import javax.swing.JOptionPane;

public class SimpleIf {
	public static void main(String[] args) {
	
		//INPUT
		String userInput = JOptionPane.showInputDialog("Enter a number:");
		double numberInputted = Double.parseDouble(userInput);
	
		//PROCESS
		if(numberInputted<0) {
			JOptionPane.showMessageDialog(null, "Negative Number");
		}//ending bracket of if(numberInputted)
		//OUTPUT
		JOptionPane.showMessageDialog(null, Double.toString(numberInputted));
	}//ending bracket of method main
}//ending bracket of class SimpleIf 
