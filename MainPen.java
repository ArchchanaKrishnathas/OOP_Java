class MainPen{
	public static void main(String args[]){
		Pen p;
		p= new Pen();
		
		p.color="Red";
		p.height=70.5;
		p.brand="Ten";
		p.weight=40.5;
		p.madeIn="SriLanka";
		
		System.out.println(p.color);
		System.out.println(p.height);
		System.out.println(p.brand);
		System.out.println(p.weight);
		System.out.println(p.madeIn);
		
		p.write();
	}
}	


