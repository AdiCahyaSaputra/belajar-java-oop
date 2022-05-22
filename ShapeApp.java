public class ShapeApp {
	public static void main(String[] args) {
		Shape bentuk = new Shape();
		System.out.println("Corner from class Shape " + bentuk.getCorner());

		Rectangle kotak = new Rectangle();
		System.out.println("Corner from class Rectangle " + kotak.getCorner());
		System.out.println("Corner from class Rectangle method \nfrom parent class Shape " + kotak.getParentCorner());
	}
}
