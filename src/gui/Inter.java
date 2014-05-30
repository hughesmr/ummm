package gui;

import java.awt.Dimension;

import javax.swing.*;

import main.Main;

public class Inter extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JLabel label;
	
	
	public Inter(){
		
		super("Uma Let You Finish");
		
		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        
        
        //Add the ubiquitous "Hello World" label.
        label = new JLabel(Integer.toString(Main.count));
        getContentPane().add(createPanel());
 
        //Display the window.
        pack();
        setVisible(true);
		
	}
	
	private JPanel createPanel(){
		
		JPanel base = new JPanel();
		base.setSize(400,400);
		
		base.setPreferredSize(new Dimension(500, 50));
		label = new JLabel(Integer.toString(Main.count));
		
		base.add(label);
		
		
		return base;
		
	}
	
	
	


}
