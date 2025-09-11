class B implements A{
	int y;
	
	B(){
		this.y=20;
	}
	
	void getY(){
		System.out.println("By: "+this.y);
	}
	
	public void getX(){
		System.out.println("Ax: "+x);
	}
}

