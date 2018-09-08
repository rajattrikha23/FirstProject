
public class FirstClass {

	  public String myVar="instance variable";
	    
	   public void myMethod(){
	    	// local variable
	     String myVar = "Inside Method";
	    	System.out.println(myVar);
	   }
	   public static void main(String args[]){
	      // Creating object
	      FirstClass obj = new FirstClass();
	    	
	    
	      System.out.println("Calling Method");
	      obj.myMethod();
	      System.out.println(obj.myVar);
	      
	      System.out.println("Now with GIT Repository");
	   }
	}