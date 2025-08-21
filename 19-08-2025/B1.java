class B1 extends A1{
	int y;
	
	B1(int x, int y){
		super(x);
		this.y= y;
	}
	
	void getY(){
		System.out.println("B1y "+this.y);
	}
}