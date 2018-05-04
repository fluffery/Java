import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class TextAnalyzer implements ITextAnalyzer {

    public static final String[] SEARCH = {"fre","er","es","sie"};
    public static File file = new File("/home/fluffy/Documents/Studium/Java/Blatt2.4/src/FIle1");
    public static final String PATH = file.getAbsolutePath();
    String myString;
    String REPLACE_ME = myString.replaceAll("[^a-zA-Z0-9]", "");

    @Override
    public void run() {

        Scanner in = new Scanner(System.in);
        System.out.println("[r]lesen\t[a]Alphabetische Map\t[t]TermMap\t[q]beenden");
        String input = in.nextLine();
        if (input.equalsIgnoreCase("r")) {
            System.out.print("Dateiname (ENTER für default)");
            try {
                while (input!=null){
                    if (file.exists()){
                        String input2 = in.nextLine();
                    }
                    System.out.print("Dateiname: ");

                } catch(FileNotFoundException ex) {
                    System.out.println("Unable to open file ");

                }
                }


        in.close();
    }}

    @Override
    public ArrayList<String> readWords(Scanner scanner) throws FileNotFoundException {
        ArrayList<String> dict = new ArrayList<>();
        scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            dict.add(scanner.next());
        }
        return dict;
    }

    @Override
    public ArrayList<String> modifyWords(ArrayList<String> wordList) {
        return modifyWords(wordList,REPLACE_ME);
    }

    @Override
    public ArrayList<String> modifyWords(ArrayList<String> wordList, String regex) {
        String lower = regex.toLowerCase();
        String REPLACE_ME = lower.replaceAll("[-+.^:,]","");
        return null;
    }

    @Override
    public void printWords(Map<String, ArrayList<String>> words) {

    }

    public static void main(String []args) {

    }
}

