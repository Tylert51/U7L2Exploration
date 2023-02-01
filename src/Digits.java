import java.util.ArrayList;

public class Digits {

    private ArrayList<Integer> digitList;

    public Digits(int num) {
        digitList = new ArrayList<>();

        String sNum = num + "";

        for (int i = 0; i < sNum.length(); i++) {
            Integer number = Integer.parseInt(sNum.charAt(i) + "");

            digitList.add(number);
        }
    }

    public boolean isStrictlyIncreasing() {
        for (int i = 1; i < digitList.size(); i++) {
            int num = digitList.get(i);
            int numBefore = digitList.get(i - 1);

            if (num <= numBefore) {
                return false;
            }
        }

        return true;
    }
}
