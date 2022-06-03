/**
 * @author 
 *
 *   /\_/\  _     ___
 *  |>'v'<||"| -/\, ,`>
 *     -=Edelstein=-
 * 
 */
package typecasting.project;

import java.util.Scanner;

/*
a whole number and stores it as an integer
a decimal number and stores it as a Double
a single character and stores it as a char
a name and stores it as a String
a whole number and stores it as a String
a decimal number and stores it as a String

The program should then, with appropriate titles,

convert the whole number integer into a double and output it.
convert the decimal number Double into an integer and output it.
convert the single character into a String and output it.
convert the first character of the name into a char and output it.
convert the whole number String into an integer and output it.
convert the decimal number String into a Double and output it.
*/


public class TypeCastingProject {
    public static void main(String[] args) {
        boolean tryFinished = false;
        
        Scanner Input = new Scanner(System.in);
        int intAsInt = 0;
        double decimalAsDouble = 0;
        char charAsChar = 'x';
        String stringAsString = "x";
        String stringToInt = "0";
        String stringToDouble = "0";
        
        do{
            try{
                System.out.println("Input: ");
                System.out.println("A integer");
                intAsInt = Input.nextInt();
                System.out.println("A double");
                decimalAsDouble = Input.nextDouble();
                System.out.println("A char");
                charAsChar = Input.next().charAt(0);
                //System.out.println("Your name");
                //stringAsString = Input.nextLine();
                System.out.println("A string with only numbers");
                stringToInt = Input.nextLine(); // This is the strangest thing I have ever seen.
                stringToInt = Input.nextLine(); // without two of these lines, the program just skips this input line??!??!?
                System.out.println("A string with numbers that have a decimal place");
                stringToDouble = Input.nextLine(); // and it goes straight to this one!
                
                System.out.println("Converting...\n");
                tryFinished = true;
            } catch(Exception e){
                tryFinished = false;
                System.out.println("Something went wrong!");
            }
        
            if (tryFinished){
                System.out.println((double) intAsInt);
                System.out.println((int) decimalAsDouble);
                System.out.println((String.valueOf(charAsChar)));
                //System.out.println(stringAsString.charAt(0)); I have absolutley no idea as to why this is not working
                System.out.println(Integer.parseInt(stringToInt));
                System.out.println(Double.parseDouble(stringToDouble));
            }
        
        } while(!tryFinished);
        
        // This program was buggy as heck, and I followed what the course taught, so I don't wanna get blamed for it.
    }
}
