public class ParentApp {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.name = "Adi";
		parent.doIt();
		System.out.println(parent.name);

		Child child = new Child();
		child.name = "Cahya";
		// set name from super class 
		child.setSuperName("Cahya Saputra");
		child.doIt();
		System.out.println(child.name);
		System.out.println(child.getSuperName());

		// cast class tapi method nya masih tetep ngambil dari  class yang mau di convert 
		// tapi variable nya ngambil dari yg sudah di convertt 
		Child anak = new Child();
		Parent ortu = (Parent) anak;
		ortu.doIt(); // ngambil dari si child 
		System.out.println(ortu.name); // ngambil dari ortu, dan yg di child auto di hiding (variable hiding) 
		// bingung kan anda wkwkwkwk makannya tidak disarankan untuk membuat variable yg sama di kelas turunan 
	}
}
