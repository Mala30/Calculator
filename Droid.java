

	public class Droid
	{
	    int batteryLevel;
	  Droid()
	  {
	    batteryLevel=100;
	  }
	  
	  public void activate(){

	     System.out.println("Activated.How can i      help you?");
	     batteryLevel=batteryLevel-5;
	    System.out.println("Battery level is: "     + batteryLevel + " percent.");
	    }
	  
	  public void chargeBattery(int hours)
	    {
	        System.out.println("Droid                   charging...");
	        batteryLevel=batteryLevel+hours;
	       if(batteryLevel>=100){
	        System.out.println("Battery level           is: " + batteryLevel + "                   percent.");
	        }else
	        {
	       System.out.println("Battery level   is:       " + batteryLevel + " percent.");
	        }
	       }
	       public int checkbatteryLevel(int batteryLevel)
	       {
	         System.out.println("battery level           to the user");
	         return batteryLevel;
	       }
	   public void hover(int feet)
	      {
	       if(feet>2) {
	        System.out.println("Error! I cannot         hover above 2 feet.");
	       } else {
	         System.out.println("hovering...");
	         batteryLevel=batteryLevel-20;
	         System.out.println("battery level          is decreade by 20");
	       }
	      }
	   public static void main(String args[])    		{
	       Droid d=new Droid();
	     d.activate();       			d.chargeBattery(5);
	     d.hover(2);
	     }
	}


