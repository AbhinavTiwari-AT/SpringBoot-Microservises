package LooseCoupling;

public class Car {
	
	private Engine eng;
	
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	
	public Car(Engine eng)
	{
		this.eng =eng;
	}
	
	
//	
//	public Car(Engine eng) {
//		super();
//		this.eng = eng;
//	}

	

	public void Drive()
	{
	  int Start	= eng.start();
	  
	  if(Start >= 1)
	  {
		  System.out.println("The journy Begins");
	  }else
	  {
		  System.out.println("The engine is in trouble");
	  }
	}
}
