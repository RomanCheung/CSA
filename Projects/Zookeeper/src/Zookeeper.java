import java.io.File;
import java.util.Scanner;

public class Zookeeper {
    public static void security(String aType, String Time, double hTemp, String filetxt){
        System.out.println("Animal: " + aType);
        System.out.println("Time: " + Time);
        System.out.println("Temp: " + hTemp);

        File file = new File("Zookeeper/animals/" + filetxt);
        try{
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (Exception e){
            System.out.println("No file");
        }
        System.out.println("End of program.\nRestart to view a different animal.");
    }
    public  static void GUI(){
        System.out.println("Zookeeper interface \n Which animal do you want to use?");
        System.out.println("\nCamel -- 1\nBat -- 2\nHippo -- 3\nAnkylosaurus--4");


        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        check(in);
    }

    public static void main(String[] args) {
        GUI();
        /*System.out.println("Zookeeper interface \n Which animal do you want to use?");
        System.out.println("\nCamel -- 1\nBat -- 2\nHippo -- 3\nAnkylosaurus--4");


        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        if (in == 1) {
            security("Camel", "5:42 AM", 85, "camel.txt");
        } else if (in == 2){
            security("Bat", "12:13 PM", 70, "bat.txt");
        } else if (in == 3){
            security("Hippo", "2:31 AM", 63, "hippo.txt");
        } else if (in == 4){
            security("Ankylosaurus", "8:07", 80, "ankylosaurus.txt");
        } else{
            System.out.println("Camera offline :(");
        }*/
    }
    public static void check(int in){
        switch (in)
        {
            case -1:
                System.out.println("Powering down"); break;

            case 1: security("Camel", "5:42 AM", 85, "camel.txt");
             GUI(); break;

            case 2: security("Bat", "12:13 PM", 70, "bat.txt");
            GUI(); break;

            case 3: security("Hippo", "2:31 AM", 63, "hippo.txt");
            GUI();break;

            case 4: security("Ankylosaurus", "8:07", 80, "ankylosaurus.txt");
            GUI(); break;

            default: System.out.println("Camera offline :(");
            GUI(); break;
        }



    }

}
