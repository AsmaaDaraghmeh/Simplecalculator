
public class calculator {
	
	 public static void main(String[] args) 
	 {

	 view V = new view();
	 Model M = new Model();
     controller theController = new controller(V,M);
     V.setVisible(true);
     V.setSize(200, 200);
  
 
  
	 }   

}
