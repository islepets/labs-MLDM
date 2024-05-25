package lab1;

public class SymmetricDifference {
	String[] arrayA;
	String[] arrayB;
	public SymmetricDifference(String masA, String masB) {
		arrayA = masA.split(" ");
		arrayB = masB.split(" "); 
	}
	
	public String symetric() {
	    String result = "";
	    for (String item : arrayA) {
	        if(!check(arrayB, item) ) {
	        	result+=item+" ";
	        }
	    }
	    for (String item : arrayB) {
	        if(!check(arrayA, item) && result.indexOf(item) == -1) {
	        	result+=item+" ";
	        }
	    }
	    return result;	
	}
	
	private boolean check(String[] array, String item) {
	    for (String num : array) {
	        if (num.equals(item)) {
	            return true;
	        }
	    }
	    return false;
	}
}

