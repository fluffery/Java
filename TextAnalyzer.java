import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class TextAnalyzer implements ITextAnalyzer {

    public static final String[] SEARCH = {"fre","er","es","sie"};
    public static File file = new File("C:\\testfolder\\test.cfg");
    public static final String PATH = file.getAbsolutePath();
    String REPLACE_ME;

    @Override
    public void run() {

    }

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
        return modifyWords(wordList);
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
