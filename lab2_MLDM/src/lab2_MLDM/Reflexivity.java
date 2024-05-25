package lab2_MLDM;

public class Reflexivity {
	private String arrayA[]; 
	private String itemA[];
    public Reflexivity(String masA) { 
        arrayA = masA.split(" "); 
    } 
    public boolean checkReflexivity(){
	  for(String item:arrayA) {
		  itemA = item.split("|");
		  while(!itemA[0].equals(itemA[2])) {
			  return false;
		  }
	  }
	  return true;
    }
}

