package lab2_MLDM;

public class Simmetric {
	private String arrayA[]; 
	private String itemA[];
	private String numA[];
	private boolean res;
    public Simmetric(String masA) { 
        arrayA = masA.split(" "); 
    } 
    public boolean checkSimmetric(){
    	
  	  for(String item:arrayA) {
  		  res = false;
  		  itemA = item.split("|");
  		  for(String num:arrayA) {
  			numA = num.split("|");
  			if(itemA[0].equals(numA[2]) && itemA[2].equals(numA[0])&& !itemA[0].equals(itemA[2])) {
  				res =  true;
  			}	
  		  }
  	  }
  	  return res;
      }
}
