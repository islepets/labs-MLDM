package lab2_MLDM;

public class Val {
	private String[] arrayA;
	
	public Val(String masA) {
		arrayA = masA.split(" ");
	}
	public boolean validate() {
		boolean res = true;
		for(String item:arrayA) {
			if ((item.charAt(0) >='0' && item.charAt(0)<='9') && 
				(item.charAt(1) =='|') && (item.charAt(2) >='0' && item.charAt(2)<='9') && item.length() == 3){
				res = false;
			}
		}
		return res;
		}
}
