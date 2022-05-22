public class ManagerViceApp {
	public static void main(String[] args) {
		Manager sheeshh = new Manager("Adi");
		sheeshh.sayHai();

		VicePresident siVp = new VicePresident(null);
		siVp.sayHai(); // from method manager 
		siVp.sayHai("Cahya"); // from method overriding 
		siVp.haloManager();
	}
}
