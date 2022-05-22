class Shape {
	int getCorner() {
		return 0;
	}
}

class Rectangle extends Shape {
	// override method parent 
	int getCorner() {
		return 4;
	}

	int getParentCorner() {
		return super.getCorner();
	}
}
