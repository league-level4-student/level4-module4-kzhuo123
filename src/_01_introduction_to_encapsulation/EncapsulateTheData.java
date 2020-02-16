package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	private int itemsReceived; // must not be negative. All negative arguments get set to 0.

	int getitemsReceived() {
		return this.itemsReceived;
	}

	void setitemsReceived(int itemsReceived) {
		if (itemsReceived >= 0) {
			this.itemsReceived = itemsReceived;
		} else {
			this.itemsReceived = 0;
		}
	}

	float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.

	float getdegreesTurned() {
		return this.degreesTurned;
	}

	void setdegreesTurned(float degreesTurned) {
		if (degreesTurned > 0 && degreesTurned < 36) {
			this.degreesTurned = degreesTurned;
		} else {
			this.degreesTurned = 0;
		}

	}

	String nomenclature = " "; // must not be set to a blank string. Blank Strings get set to a space

	String getnomenclature() {
		return this.nomenclature;
	}

	void setnomenclature(String nomenclature) {
		if (!nomenclature.isEmpty()) {
			this.nomenclature = nomenclature;
		} else {
			this.nomenclature = " ";
		}

	}

	Object memberObj; // must not be a String. If it is a String, set it equal to a new Object();

	Object getmemberObj() {
		return this.memberObj;
	}

	void setmemberObj(Object memberObj) {
		if (!(memberObj instanceof String)) {
			this.memberObj = memberObj;
		}	else {
			this.memberObj=new Object();
		}
		
	}

	public static void main(String[] args) {

	}
}
