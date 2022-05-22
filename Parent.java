class Parent {
	String name;
	void doIt() {
		System.out.println("From Parent");
	}
}

class Child extends Parent {
	// variable hiding ( bukan variable overriding ) 
	String name;

	void doIt() {
		System.out.println("From Child");
	}

	String getSuperName() {
		return super.name;
	}

	void setSuperName(String name) {
		super.name = name;
	}
}
