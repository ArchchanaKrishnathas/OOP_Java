class MainEmployee{
	public static void main(String args[]){
		Employee emp= new Employee(100,"Jana",150000);
		emp.calcBonus();
		emp.display();
		
		Employee emp1= new Employee(101,"Jeni",25000);
		emp1.calcBonus();
		emp1.display();
	}
}

