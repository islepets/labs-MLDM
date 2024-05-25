package lab2_MLDM;

public class Transitively {
    private String[] arrayA;

    public Transitively(String masA) {
        arrayA = masA.split(" ");
    }

    public boolean checkTransitively() {
        boolean res = false;
        for (String item : arrayA) {
            String[] itemA = item.split("|");
            for (String num : arrayA) {
                String[] numA = num.split("|");
                if (itemA[2].equals(numA[0])) {
                    for (String third : arrayA) {
                        String[] thirdA = third.split("|");
                        if (numA[2].equals(thirdA[0]) && itemA[0].equals(thirdA[2]) && !thirdA[0].equals(thirdA[2]) || arrayA.length % 2 == 0)  {
                            res = true;                       
                        }
                    }
                    if (res == false) {
                        break;
                    }
                }
            }
            if (res == false) {
                break;
            }
        }
        return res;
    }
}