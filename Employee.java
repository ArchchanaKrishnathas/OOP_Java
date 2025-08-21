class Employee{
	int id;
	String name;
	double BasicSalary;
	double bonus;
	
	void setEmployee(){
		id= 1500;
		name= "Archchana";   
		BasicSalary= 150000;
	}
	
	void calcBonus(){
		if (BasicSalary >= 100000){
			bonus= BasicSalary*10/100;
		}else{
			bonus= BasicSalary*5/100;
		}							
	}
	
	void display(){
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("Basic salary: "+BasicSalary);
		System.out.println("Bonus: "+bonus);
		System.out.println("Net Salary: "+(BasicSalary+bonus));
	}	
}