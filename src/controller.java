import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Container;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
public class controller {
	     private view V;
	     private Model M;
	     public  String operator = "=";
	     private boolean c = true;

	     public controller(view V, Model M) {
	 
	    	 this.V = V;
	         this.M = M;
	        
	      this. V.addListener(new Listener());
	         }

	         class Listener implements ActionListener{
	        	 
	        	 public void actionPerformed(ActionEvent e) {
	        		 
	        		 String cmd = e.getActionCommand();
	        		    if ('0' <= cmd.charAt(0) && cmd.charAt(0) <= '9')
	        		    {
	        		      if (c)
	        		    	  V.setResult(cmd);
	        		      else
	        		    	  V.setResult (V.getResult() + cmd);
	        		      c = false;
	        		    } 
	        		    else
	        		    {
	        		      if (c) 
	        		      {
	        		        if (cmd.equals("-"))
	        		        {
	        		        	 V.setResult(cmd);
	        		          c = false;
	        		         
	        		        } 
	        		        
	        		   
	        		        else
	        		    
	        		         operator=cmd;
	        		      } 
	        		      else 
	        		      {
	        		       int  nn =Integer.parseInt(V.getResult());
	        		        M.calculate(operator,nn);	
	        		        V.setResult(Integer.toString(M.getValue()));
	        		        operator=cmd;
	        		        c = true; 
	        		      }
	        		    }
	        	 }   	  
}
	         
}