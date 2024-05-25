package lab1;

public class Union {
	String[] arrayA;
	String[] arrayB;
	
	public Union(String masA, String masB) {
		arrayA = masA.split(" ");
		arrayB = masB.split(" "); 
	}
	public String union() {
		String result = "";
		for (String item: arrayA) {
			if(result.indexOf(item) == -1)
				result+=item + " ";
		}
		for (String item: arrayB) {
			if(result.indexOf(item) == -1)
				result+=item + " ";
		}
		return result;
	}
}


