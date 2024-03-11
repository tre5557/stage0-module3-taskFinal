package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String string1 = String.valueOf(number);

        StringBuilder str = new StringBuilder(string1);

        String stringRev = str.reverse().toString();

        int numerReversed = Integer.valueOf(stringRev);

        System.out.println(numerReversed);
    }


}
