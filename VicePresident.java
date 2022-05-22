class VicePresident extends Manager {
	void haloManager() {
		System.out.println("Halo manager " + this.name);
	}

	// method overriding ( sama kek overloading tapi beda ) 
	void sayHai(String name) {
		System.out.println(name + " From method overriding");
	}
}
