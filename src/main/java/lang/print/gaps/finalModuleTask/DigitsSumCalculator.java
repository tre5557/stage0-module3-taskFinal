package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

       int  product = 1;
        while(number>0){

            int digit = number%10;
            product += digit;
            number/=10;

        }
        System.out.println(product);
    }
}
