package LooseCoupling;

public class Main {
	
	public static void main(String[] args) {
		
		Car car = new Car( new PertolEngine());
		car.Drive();
		
	     car.setEng(new PertolEngine());
		car.Drive();
	}

}
