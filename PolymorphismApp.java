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

		// cast class 
		sayItAgain(new Employee("Adi"));
		sayItAgain(new Manager("Cahya"));
		sayItAgain(new VicePresident("Saputra"));
	}

	// method Polymorphism
	static void sayHai(Employee employee) {
		employee.sayHai();
	}

	// cast class 
	static void sayItAgain(Employee employee) {
		if( employee instanceof VicePresident ) {
			VicePresident vp = (VicePresident) employee;
			System.out.println("It VP " + vp.name);
		} else if( employee instanceof Manager ) {
			Manager manager = (Manager) employee;
			System.out.println("It Manager " + manager.name);
		} else {
			System.out.println("It Employee " + employee.name);
		}
	}
}
