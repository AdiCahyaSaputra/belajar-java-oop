public class PersonApp {
	public static void main(String[] args) {
		Person adiCs = new Person("Adi Cahya Saputra", 17);

		adiCs.sayProfile();
	
		// overloading 
		Person unknown = new Person(17);
		unknown.sayProfile();

		// constructer panggil constructer 
		Person siapaYah = new Person();
		siapaYah.sayProfile();

	}
}
