// any imports here
import java.util.Scanner;
/*
Roman Cheung
Nov 14 2024
Program takes an integer and prints if it is positive or negative,
if it is greater than 10, 100, or 1000,
if it is odd or even,
and if it is the atomic number of one of the seven noble gases.
It then takes a character and prints if it is a number, upper case, or lowercase letter;
if it is a vowel or not;
its ascii value;
and what number letter of the alphabet it is.
 */
public class DataFun{
    public static void main(String[] args){
        Scanner intput = new Scanner(System.in);
        System.out.println("Input your favorite integer: ");
        int fInt = intput.nextInt();
        if (fInt >= 0){
            System.out.println(fInt + " is positive!");
        } else{
            System.out.println(fInt + " is negative!");
        }
        if (fInt > 1000){
            System.out.println(fInt + " is greater than 1000!");
        } else if (fInt > 100){
            System.out.println(fInt + " is greater than 100!");
        } else if (fInt > 10){
            System.out.println(fInt + " is greater than 10!");
        }
        if (Math.abs(fInt) % 2 <= 0){
            System.out.println(fInt + " is even!");
        } else{
            System.out.println(fInt + " is odd!");
        }
        switch (fInt) {
            case 2:
                System.out.println("Its atomic number is helium!");
                break;
            case 10:
                System.out.println("Its atomic number is neon!");
                break;
            case 18:
                System.out.println("Its atomic number is argon!");
                break;
            case 36:
                System.out.println("Its atomic number is krypton!");
                break;
            case 54:
                System.out.println("Its atomic number is xenon!");
                break;
            case 86:
                System.out.println("Its atomic number is radon!");
                break;
            case 118:
                System.out.println("Its atomic number is oganesson!");
                break;
            default:
                System.out.println("It has no noble gas association");
                break;
        }

        System.out.println("Input your favorite character: ");
        Scanner input = new Scanner(System.in);
        String charIn = input.nextLine();
        switch (charIn) {
            case "0":
            case "9":
            case "8":
            case "7":
            case "6":
            case "5":
            case "4":
            case "3":
            case "1":
            case "2":
                System.out.println("Your character is a number!");
                break;
            default:
                if (charIn.equals(charIn.toLowerCase())){
                    System.out.println("Your character is lowercase!");
                }
                if (charIn.equals(charIn.toUpperCase())){
                    System.out.println("Your character is uppercase!");
                }
        }
        switch (charIn.toLowerCase()){
            case "u":
            case "o":
            case "i":
            case "e":
            case "a":
                System.out.println("Your character is a vowel! :(");
            default:
                System.out.println("Your character is not a vowel (Spooky)");
        }
        int ascii = charIn.toUpperCase().hashCode();
        System.out.println("Your character's ASCII value is: " + ascii);
        int letta = ascii - 64;
        if ((ascii >= 68 && ascii <=83) || (ascii > 87)){
            System.out.println("Your character is the " +letta+ "th letter of the alphabet");
        } else {
            switch (ascii - 64){
                case 3: case 23:
                    System.out.println("Your character is the " +letta+ "rd letter of the alphabet");
                    break;
                case 2: case 22:
                    System.out.println("Your character is the " +letta+ "nd letter of the alphabet");
                    break;
                case 1: case 21:
                    System.out.println("Your character is the " +letta+ "st letter of the alphabet");
                    break;
            }
        }
    }

}
