class C implements IA,IB{
	int z;
	
	C(){
		this.z= 30;
	}
	
	void getZ(){
		System.out.println("Cz: "+this.z);
	}
	
	public void getX(){
		System.out.println("Ax: "+X);
	}
	
	public void getY(){
		System.out.println("By: "+Y);
	}
	
}