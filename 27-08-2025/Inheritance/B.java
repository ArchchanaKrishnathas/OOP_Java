package PackB;
import PackA.A;

public class B extends A{
	public int y;
	
	public B(){
		this.y= 50;
	}
	
	public void getY(){
		System.out.println("By "+this.y);
	}
}


