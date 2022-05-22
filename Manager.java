class Manager extends Employee{

	Manager(String name) {
		super(name);
	}

	void sayHai() {
		System.out.println(this.name + " From Manager");
	}
}
