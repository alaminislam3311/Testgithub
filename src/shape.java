
public class shape {
	   private double height;  
	   private double width; 
	   
	   public void setValues(double height, double width)
	   {
	      this.height = height;
	      this.width = width ;
	   }

	  
	   public double getHeight() 
	   {
	       return height;
	   }
	     
	   
	   public double getWidth() 
	   {
	       return width;
	   }    
	   public static void main(String[] args)
	    {
	        shape shape;
	        rectangle rect = new rectangle();
	        shape = rect;
	        shape.setValues(78, 5);
	        
	        
	        System.out.println("Area of rectangle : " + rect.getArea());
	        
	       
	        triangle tri = new triangle();       
	        shape = tri;
	              
	        shape.setValues(34,3);        
	        System.out.println("Area of triangle : " + tri.getArea());
	    }
	}           
	

