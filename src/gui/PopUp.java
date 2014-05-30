package gui;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import main.Main;


public class PopUp extends Thread{
	
	public void run() {
		
			
			if(Main.count == 25){
				ImageIcon icon = new ImageIcon(PopUp.class.getResource("25.gif"));
				JOptionPane.showMessageDialog(
	                null,
	                "",
	                "WE HIT 25!!!!!!", JOptionPane.INFORMATION_MESSAGE,
	                icon);
			}
			else if(Main.count == 50){
			
				ImageIcon icon = new ImageIcon(PopUp.class.getResource("50.gif"));
				JOptionPane.showMessageDialog(
	                null,
	                "",
	                "WE HIT 50!!!!!!", JOptionPane.INFORMATION_MESSAGE,
	                icon);
			}
			else if(Main.count == 75){
				ImageIcon icon = new ImageIcon(PopUp.class.getResource("75.gif"));
				JOptionPane.showMessageDialog(
	                null,
	                "",
	                "WE HIT 75!!!!!!", JOptionPane.INFORMATION_MESSAGE,
	                icon);
			}
			else{
				ImageIcon icon = new ImageIcon(PopUp.class.getResource("100.gif"));
				JOptionPane.showMessageDialog(
	                null,
	                "",
	                "WE HIT 100!!!!!!", JOptionPane.INFORMATION_MESSAGE,
	                icon);
			}
			
			
		}
    

}
