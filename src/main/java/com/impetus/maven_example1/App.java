package com.impetus.maven_example1;
import java.lang.reflect.*;

//dffdfdf
enum PizzaStatus {
    ORDERED,
    READY, 
    DELIVERED; 
}
enum TestColor
{
	GREEN
}
class Pizza {
    private PizzaStatus status;
    public enum PizzaStatus {
        ORDERED,
        READY,
        DELIVERED;
    }

    public boolean isDeliverable() {
    	if(getStatus().equals(TestColor.GREEN))
    	{
    		return true;
    	}
    	
    	return false;
    	//if(getStatus() == TestColor.GREEN);
    	/*
        if (getStatus() == PizzaStatus.READY) {
            return true;
        }
        return false; */
    }
    public PizzaStatus getStatus()
    {
    	status=PizzaStatus.DELIVERED;
    	return this.status;
    }
    
    // Methods that set and get the status variable.
}

public class App {
  public static void main(String[] args)  throws Exception {
    System.out.println("Hello World!");
   System.out.println(new Pizza().isDeliverable());
   
  
	

  
    
  }
}
