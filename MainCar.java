class MainCar{
	public static void main(String args[]){
		Car c;
		c = new Car();
		
		c.color="Blue";
		c.speed=90;
		c.model="Camry";
		c.madeIn="China";
		c.engineNo=2578;
		
		System.out.println(c.color);
		System.out.println(c.speed);
		System.out.println(c.model);
		System.out.println(c.madeIn);
		System.out.println(c.engineNo);
		
		c.drive();
		c.accelerate();
		c.brake();
		c.startEngine();
	}

}
