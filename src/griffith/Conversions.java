package griffith;
//Zeyuan Mi
//3184481

public class Conversions {
    public double euroToDollar(double a) {
        return a * 1.08;

    }

    public double dollarToEuro(double b) {

        return b / 1.08;
    }

    public int stringToInteger(String number) {
        if (number == null) {
            throw new NumberFormatException("Null string");
        }

        return Integer.parseInt(number);
    }

    public String integerToString(int number) {

        return String.valueOf(number) ;
    }

    public String switchCase() {

        return "";
    }
}



