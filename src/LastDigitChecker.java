public class LastDigitChecker {

    public static boolean isValid (int number){
        if ( number >= 10 && number <= 1000){
            return true;
        }
        return false;
    }

    public static boolean hasSameLastDigit (int number1, int number2, int number3) {

        if (number1 < 10 || number1 > 1000 || number2 < 10 || number2 > 1000 || number3 < 10 || number3 > 1000) {
            return false;
        } else {

            if (isValid(number1) && isValid(number2) && isValid(number3)) {

                int lastdigit1 = number1 % 10;
                int lastdigit2 = number2 % 10;
                int lastdigit3 = number3 % 10;

                if ((lastdigit1 % 10) == (lastdigit2 % 10) || (lastdigit1 % 10) == (lastdigit3 % 10) || (lastdigit2 % 10) == (lastdigit3 % 10){
                    return true;
                }
            }
        }
    }


}
