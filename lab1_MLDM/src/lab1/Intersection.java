package lab1;

public class Intersection {
	String[] arrayA;
	String[] arrayB;
	
	public Intersection(String masA, String masB) {
		arrayA = masA.split(" ");
		arrayB = masB.split(" "); 
	}
	public String intersection() {
	    String result = "";
	    for (String item : arrayA) {
	        if (contains(arrayB, item) && result.indexOf(item) == -1) {
	            result += item + " ";
	        }
	    }
	    return result;
	}
	private boolean contains(String[] array, String item) {
	    for (String num : array) {
	        if (num.equals(item)) {
	            return true;
	        }
	    }
	    return false;
	}
}
