package main;

import gui.Inter;
import speech.Voice;


public class Main {
	
	public static int count;

    public static void main(String[] args) {
        
        
        count = 0;
        
        Voice v = new Voice();
        
        
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	new Inter();
           
            }
        });
        
        v.recog();
        
    }
}
