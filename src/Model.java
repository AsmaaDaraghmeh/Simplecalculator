
public class Model {
	 
	  private int result = 0;
	  
	  public void calculate( Object operator,int n)
	  {
		    if (operator.equals("+"))
		      result += n;
		    else if (operator.equals("-"))
		      result -= n;
		    else if (operator.equals("*"))
		      result *= n;
		    else if (operator.equals("/"))
		      result /= n;
		    else if (operator.equals("="))
		      result = n;
		   
	  }
	  
	  public int getValue()
	  {
		          
		          return result;
	  }
		 
		       

}
