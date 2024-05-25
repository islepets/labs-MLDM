package lab1;

public class Validate {
	String[] arrayA;
	String[] arrayB;
	
	public Validate(String masA, String masB) {
		arrayA = masA.split(" ");
		arrayB = masB.split(" "); 
	}
	public boolean validate() {
		boolean res = true;
		
		for(String item: arrayA) {
			if((item.charAt(0) == '0' || item.charAt(0) == '2' || item.charAt(0) == '4' || item.charAt(0) == '6' || item.charAt(0)== '8') && 
				(item.charAt(1) == '1' || item.charAt(1) == '3' || item.charAt(1) == '5' || item.charAt(1) == '7' || item.charAt(1)== '9' ) &&  
				(item.charAt(2) >='0' || item.charAt(2) <='9' )&&
				(item.charAt(3) >= '0' || item.charAt(3)<='9') && item.length()==4) {
				return false;
			}
		}
		for(String item: arrayB) {
			if((item.charAt(0) == '0' || item.charAt(0) == '2' || item.charAt(0) == '4' || item.charAt(0) == '6' || item.charAt(0)== '8') && 
					(item.charAt(1) == '1' || item.charAt(1) == '3' || item.charAt(1) == '5' || item.charAt(1) == '7' || item.charAt(1)== '9' ) &&  
					(item.charAt(2) >='0' || item.charAt(2) <='9' )&&
					(item.charAt(3) >= '0' || item.charAt(3)<='9') && item.length()==4 ) {
					return false;
				}
		}
		return res;
		
		}
}


