package src.mczarya;

/*
 * MessageEncoder.java built by McZarya on 07/26/2021
 * Last updated on 07/26/2021
 * A program that will use a user supplied cypher to encrypt/decrypt message 
*/

import java.util.Scanner; // Package inclusion for scanner class

public class MessageEncoder {
    public static void main(String[] args) {

        int mainIn;

        Scanner inData = new Scanner(System.in);

        System.out.println("=================================================" + "\n" + "MESSAGE ENCODER BY MCZARYA"
                + "\n" + "=================================================" + "\n" + "What would you like todo:" + "\n"
                + "1. Encode a message" + "\n" + "2. Decrypt a message" + "\n" + "3. Exit Program");
        mainIn = inData.nextInt(); // gets what the user wants todo

        if (mainIn < 1 || mainIn > 3) { // error checking menu options
            System.out.println("Error! You entered an invalid option type.");

        }

        if (mainIn == 1) { // Encoded message option
            encode();
        }
        if (mainIn == 2) { // Decoded message option
            decode();
        }
        if (mainIn == 3) { // Exits program
            System.out.println("Goodbye");
            System.exit(0);
        }
    }

    public static void encode() { // Encoded message processing
        Scanner enInData = new Scanner(System.in);

        System.out.println("+-----------------------------+" + "\n" + "        Message Encoder" + "\n"
                + "+-----------------------------+");
        System.out.println("\n" + "Enter the message you want to encode:");
        String encodeIn = enInData.nextLine();

        String encodeProcess = encodeIn.toLowerCase(); // Makes all letters lowercase for processing

        char[] ch = new char[encodeProcess.length()]; // Creates array of the inputs length
        for (int i = 0; i < encodeProcess.length(); i++) {
            ch[i] = encodeProcess.charAt(i); // Adds all the Chars to the array
        }
        for (int j = 0; j < encodeProcess.length(); j++) { // Encodes the letters (Temporary for testing till external
                                                           // sheet is made)
            if (ch[j] == 'q') {
                ch[j] = 'p';
            } else if (ch[j] == 'w') {
                ch[j] = 'q';
            } else if (ch[j] == 'e') {
                ch[j] = 'w';
            } else if (ch[j] == 'r') {
                ch[j] = 'e';
            } else if (ch[j] == 't') {
                ch[j] = 'r';
            } else if (ch[j] == 'y') {
                ch[j] = 't';
            } else if (ch[j] == 'u') {
                ch[j] = 'y';
            } else if (ch[j] == 'i') {
                ch[j] = 'u';
            } else if (ch[j] == 'o') {
                ch[j] = 'i';
            } else if (ch[j] == 'p') {
                ch[j] = 'o';
            } else if (ch[j] == 'a') {
                ch[j] = 'l';
            } else if (ch[j] == 's') {
                ch[j] = 'a';
            } else if (ch[j] == 'd') {
                ch[j] = 's';
            } else if (ch[j] == 'f') {
                ch[j] = 's';
            } else if (ch[j] == 'g') {
                ch[j] = 'f';
            } else if (ch[j] == 'h') {
                ch[j] = 'g';
            } else if (ch[j] == 'j') {
                ch[j] = 'h';
            } else if (ch[j] == 'k') {
                ch[j] = 'j';
            } else if (ch[j] == 'l') {
                ch[j] = 'k';
            } else if (ch[j] == 'z') {
                ch[j] = 'm';
            } else if (ch[j] == 'x') {
                ch[j] = 'z';
            } else if (ch[j] == 'c') {
                ch[j] = 'x';
            } else if (ch[j] == 'v') {
                ch[j] = 'c';
            } else if (ch[j] == 'b') {
                ch[j] = 'v';
            } else if (ch[j] == 'n') {
                ch[j] = 'b';
            } else if (ch[j] == 'm') {
                ch[j] = 'n';
            }
        }

        System.out.println("encoding message..." + "\n");
        wait(2000);

        System.out.println("+-------Encoded Message--------+");

        System.out.print(" ");
        for (int i = 0; i < encodeProcess.length(); i++) {
            System.out.print(ch[i]);
        }
        System.out.print("\n" + "+------------------------------+");
        System.out.print("\n" + "Your message has been encoded" + "\n");

        System.out.println("Options: " + "\n" + "1. Encode another message" + "\n" + "2. Decode a message" + "\n"
                + "3. Exit Program");
        int returnToMenu = enInData.nextInt();
        if (returnToMenu < 1 || returnToMenu > 3) { // error checking menu options
            System.out.println("Error! You entered an invalid option type.");

        }
        if (returnToMenu == 1) { // Restarts encode method
            encode();
        }
        if (returnToMenu == 2) { // Starts decode method
            decode();
        }
        if (returnToMenu == 3) { // Exits the program
            System.out.println("Goodbye");
            System.exit(0);
        }
    }

    public static void decode() { // Decoded message processing
        Scanner deInData = new Scanner(System.in);

        System.out.println("+-----------------------------+" + "\n" + "        Message Decoder" + "\n"
                + "+-----------------------------+");

        System.out.println("\n" + "Enter the message you want to decode:");
        String decodeIn = deInData.nextLine();

        String decodeProcess = decodeIn.toLowerCase(); // Makes all letters lowercase for processing

        char[] ch = new char[decodeProcess.length()]; // Creates array of the inputs length
        for (int i = 0; i < decodeProcess.length(); i++) {
            ch[i] = decodeProcess.charAt(i); // Puts all chars in the array
        }
        for (int j = 0; j < decodeProcess.length(); j++) { // Decodes the message (Temporary for testing till external
                                                           // sheet is made)
            if (ch[j] == 'p') {
                ch[j] = 'q';
            } else if (ch[j] == 'q') {
                ch[j] = 'w';
            } else if (ch[j] == 'w') {
                ch[j] = 'e';
            } else if (ch[j] == 'e') {
                ch[j] = 'r';
            } else if (ch[j] == 'r') {
                ch[j] = 't';
            } else if (ch[j] == 't') {
                ch[j] = 'y';
            } else if (ch[j] == 'y') {
                ch[j] = 'u';
            } else if (ch[j] == 'u') {
                ch[j] = 'i';
            } else if (ch[j] == 'i') {
                ch[j] = 'o';
            } else if (ch[j] == 'o') {
                ch[j] = 'p';
            } else if (ch[j] == 'l') {
                ch[j] = 'a';
            } else if (ch[j] == 'a') {
                ch[j] = 's';
            } else if (ch[j] == 's') {
                ch[j] = 'd';
            } else if (ch[j] == 's') {
                ch[j] = 'f';
            } else if (ch[j] == 'f') {
                ch[j] = 'g';
            } else if (ch[j] == 'g') {
                ch[j] = 'h';
            } else if (ch[j] == 'h') {
                ch[j] = 'j';
            } else if (ch[j] == 'j') {
                ch[j] = 'k';
            } else if (ch[j] == 'k') {
                ch[j] = 'l';
            } else if (ch[j] == 'm') {
                ch[j] = 'z';
            } else if (ch[j] == 'z') {
                ch[j] = 'x';
            } else if (ch[j] == 'x') {
                ch[j] = 'c';
            } else if (ch[j] == 'c') {
                ch[j] = 'v';
            } else if (ch[j] == 'v') {
                ch[j] = 'b';
            } else if (ch[j] == 'b') {
                ch[j] = 'n';
            } else if (ch[j] == 'n') {
                ch[j] = 'm';
            }
        }

        System.out.println("decoding message..." + "\n");
        wait(2000);

        System.out.println("+-------decoded Message--------+");

        System.out.print(" ");
        for (int i = 0; i < decodeProcess.length(); i++) {
            System.out.print(ch[i]);
        }
        System.out.print("\n" + "+------------------------------+");
        System.out.print("\n" + "Your message has been decoded" + "\n");

        System.out.println("Options: " + "\n" + "1. Encode a message" + "\n" + "2. Decode another message" + "\n"
                + "3. Exit Program");
        int returnToMenu = deInData.nextInt();
        if (returnToMenu < 1 || returnToMenu > 3) { // error checking menu options
            System.out.println("Error! You entered an invalid option type.");

        }
        if (returnToMenu == 1) { // Starts encode method
            encode();
        }
        if (returnToMenu == 2) { // Restarts decode method
            decode();
        }
        if (returnToMenu == 3) { // Exits the program
            System.out.println("Goodbye");
            System.exit(0);
        }

    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}