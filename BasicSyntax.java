public class Basics{
    public static void main(String[] args){
        int number = 10;
        double decimal = 3.14;
        boolean flag = true;
        char character = 'A';
        String message = "Hell, World";

        int sum = number + 5;
        double product = number * decimal;
        boolean result = number > 5 && number < 15;


        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        switch(character){
              case 'A':
                System.out.println("Character is A");
                break;
            case 'B':
                System.out.println("Character is B");
                break;
            default:
                System.out.println("Character is neither A nor B");
    }
}