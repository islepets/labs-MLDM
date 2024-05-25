package lab1;

public class Addition {
	String[] arrayA;
	String[] arrayB;
	
	public Addition(String masA, String masB) {
		arrayA = masA.split(" ");
		arrayB = masB.split(" "); 
	}
	public String additionAB() {
	    String result = "";
	    for (String item : arrayA) {
	        if(check(arrayB, item) == false) {
	        	result+=item+" ";
	        }
	    }
	    return result;
	}
	
	public String additionBA() {
	    String result = "";
	    for (String item : arrayB) {
	        if(check(arrayA, item) == false) {
	        	result+=item+" ";
	        }
	    }
	    return result;	
	}
	
	// Делает проверку на присудствие элемента в строке
	private boolean check(String[] array, String item) {
	    for (String num : array) {
	        if (num.equals(item)) {
	            return true;
	        }
	    }
	    return false;
	}
}


