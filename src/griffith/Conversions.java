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

    public String switchCase(String  input) {
        if(input==null){
            throw new NullPointerException("String can not be null ");
        }
        StringBuilder sb = new StringBuilder();
              for(char c: input.toCharArray()){
                  if(Character.isUpperCase(c)){
                      sb.append(Character.toLowerCase(c));

                  }
                  else if(Character.isLowerCase(c)){
                      sb.append(Character.toUpperCase(c));
                  }
                  else{
                      sb.append(c);
                  }

              }

        return sb.toString();
    }
}



