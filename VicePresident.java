class VicePresident extends Manager {
	
	// harus akses constructer parent nya 
	VicePresident(String name) {
		super(name);
	}

	void haloManager() {
		System.out.println("Halo manager " + this.name);
	}

	// method overriding ( sama kek overloading tapi beda ) 
	void sayHai(String name) {
		System.out.println(this.name + " From method overriding");
	}

	void sayHai() {
		System.out.println(this.name + " From VicePresident");
	}
}
