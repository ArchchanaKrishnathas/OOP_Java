class Employee{
	int id;
	String name;
	double BasicSalary;
	double bonus;
	
	Employee(int id,String name,double Bas icSalary){
		this.id= id;
		this.name= name;   
		this.BasicSalary= BasicSalary;
	}
	
	void calcBonus(){
		if (this.BasicSalary >= 100000){
			this.bonus= this.BasicSalary*10/100;
		}else{
			this.bonus= this.BasicSalary*5/100;
		}							
	}
	
	void display(){
		System.out.println("id: "+this.id);
		System.out.println("name: "+this.name);
		System.out.println("Basic salary: "+this.BasicSalary);
		System.out.println("Bonus: "+this.bonus);
		System.out.println("Net Salary: "+(this.BasicSalary+this.bonus));
	}	
}