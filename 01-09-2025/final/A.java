class A{
	//static final int X=10;
	final int X;
	
	A(){
		this.X=10;
	}
	
	final void getX(){
		final int z=20;
		System.out.println("Ax: "+this.X);
		System.out.println("Az: "+z);
	}
}