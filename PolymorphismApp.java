public class PolymorphismApp {
	public static void main(String[] args) {
		Employee employee = new Employee("Adi");
		employee.sayHai();

		employee = new Manager("Cahya");
		employee.sayHai();

		employee = new VicePresident("Saputra");
		employee.sayHai();

		// error karena di parent class gk begini walaupun di VicePresident ada method nya  
		// employee.sayHai("Saputra");
		
		// atau 
		sayHai(new Employee("Adi"));
		sayHai(new Manager("Cahya"));
		sayHai(new VicePresident("Saputra"));
	}

	// method Polymorphism
	static void sayHai(Employee employee) {
		employee.sayHai();
	}
}
