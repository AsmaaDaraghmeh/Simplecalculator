import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Container;
 
public  class view extends JFrame {

	  private JTextField display = new JTextField("0");
	  JButton b;
	  public  view()   
	  {
	    setLayout(new BorderLayout());
	 
	    display.setEditable(false);
	    add(display, "North");
	  }
	
		      public String getResult()
		      {
		  
		          return display.getText();
		 
		      }
		      public void setResult(String s){
		 
		          display.setText(s);

		      }
		 
		      void addListener( ActionListener ll )
		      {
		    	  
		    	  JPanel panel = new JPanel();
		  	    panel.setLayout(new GridLayout(4, 4));
		    	  String Labels = "123/456*789-0=+";
		  	    for (int i = 0; i < Labels.length(); i++) {
		  	       b = new JButton(Labels.substring(i, i + 1));
		  	      panel.add(b);
		  	    b.addActionListener(ll);
		  	    }
		  	    add(panel, "Center");
		      }
		      }
	
	

