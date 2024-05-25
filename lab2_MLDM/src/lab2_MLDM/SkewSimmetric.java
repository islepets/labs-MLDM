package lab2_MLDM;

public class SkewSimmetric {
	private String arrayA[]; 
	private String itemA[];
	private String numA[];
	private boolean res;
    public SkewSimmetric(String masA) { 
        arrayA = masA.split(" "); 
    } 
    public boolean checkSkewSimmetric(){
  	  for(String item:arrayA) {
  		  res = false;
  		  itemA = item.split("|");
  		  for(String num:arrayA) {
  			numA = num.split("|");
  			if(itemA[0].equals(numA[2]) && itemA[2].equals(numA[0]) && itemA[0].equals(itemA[2]) && arrayA.length % 2 != 1 ) {
  				res =  true;
  			}	
  		  }
  	  }
  	  return res;
      }
} 