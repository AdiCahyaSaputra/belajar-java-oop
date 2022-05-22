class Person {
	String name;
	Integer age;

	void sayProfile() {
		System.out.println("Hello " + this.name + " your age is " + this.age);
	}

	// constructer function 
	Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	// constructer overloading 
	Person(Integer age) {
		this.name = "Tidak Dikenali";
		this.age = age;
	}

	// Memanggil constructer lain 
	Person() {
		this(null); // memanggil constructer yg param nya cuma age 
	}
}
