package ProgramIntro;
import java.util.Scanner;
public class Test2 {

    private int lineCount;
    private int characterCount;
    private final String wordCount;

    public Test2(int myLineCount, int myCharacterCount, String myWordCount) {
        lineCount = myLineCount;
        characterCount = myCharacterCount;
        wordCount = myWordCount;
    }

    public static int getLineCount() {
        return 5;
    }

    public static int getCharacterCount() {
        return 5;
    }

    public static String getLine() {
        return "stop";
    }

    public void setWordCount(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a sentence with a few words and press Enter: ");
        String line = scan.nextLine();
        String[] words = line.split(" ");

        String longWord = "";
        for (String word : words) {
            if (word.length() > longWord.length()) {
                longWord = word;
            }
        }

        if (!longWord.isEmpty()) {
            System.out.println("The longest word you have entered is: " + longWord);
        } else {
            System.out.println("You have not typed in any words.");
        }

        int wordCount = words.length;
        System.out.println("You have typed in " + wordCount + " words.");
    }
    public void counter() {
        System.out.println("Write a text for each row and press Enter");
        System.out.println("Close the program by typing the word \"stop\" ");

        Scanner scan = new Scanner(System.in);
        while (true) {
            String line = scan.nextLine();
            if (line.equals("stop")) {
                break;
            }
            lineCount++;
            characterCount += line.length();
        }
    } public void printOut() {
        System.out.println("You have typed in " + lineCount + " rows and " + characterCount + " " +
                "characters excluding your word \"stop\" " + wordCount);
    }

}
