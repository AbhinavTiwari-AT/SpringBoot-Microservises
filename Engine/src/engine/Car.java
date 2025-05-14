package engine;

public class Car extends Engine{
	
	public void drive()
	{
		//start the engine 
		//satrt the journy
		
		int start = super.start();
		
		if(start >= 1)
		{
			System.out.println("journey Started");
		}
		
	}  

}
