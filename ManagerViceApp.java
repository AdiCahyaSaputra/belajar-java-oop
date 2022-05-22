public class ManagerViceApp {
	public static void main(String[] args) {
		Manager sheeshh = new Manager();
		sheeshh.name = "Adi";
		sheeshh.sayHai();

		VicePresident siVp = new VicePresident();
		siVp.name = "Cahya";
		siVp.sayHai(); // from method manager 
		siVp.sayHai("Cahya"); // from method overriding 
		siVp.haloManager();
	}
}
