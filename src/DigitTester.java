public class DigitTester {
    public static void main(String[] args) {
        int[] num = {7, 1356, 1336, 1536, 65310};

        for (int i = 0; i < num.length; i++) {
            boolean test = new Digits(num[i]).isStrictlyIncreasing();
            System.out.println(test);

        }
    }
}
