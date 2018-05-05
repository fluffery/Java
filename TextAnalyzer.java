import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextAnalyzer implements ITextAnalyzer {

    public static final String[] SEARCH = {"fre", "er", "es", "sie"};
    public static File file = new File("/home/fluffy/Documents/Studium/Java/Blatt2.4/src/FIle1");
    public static final String PATH = file.getAbsolutePath();
    public String myString;
    public String REPLACE_ME = myString.replaceAll("[^a-zA-Z0-9]", "");

    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        System.out.println("[r]lesen\t[a]Alphabetische Map\t[t]TermMap\t[q]beenden");
        String input = in.nextLine();
        switch (input) {
            case "r":
                System.out.print("Dateiname (ENTER für default)");
                String input2 = in.nextLine();
                while (input2 != null) {
                    if (file.exists()) {
                        input2 = PATH;
                    }
                }
                File file = new File(input2);
                try (Scanner in2 = new Scanner(file)) {
                    ArrayList<String> x = readWords(in2);
                    System.out.println("Dateiname: " + input2);

                } catch (FileNotFoundException e) {
                    System.out.println(e);
                }
                break;
            case "a":
                HashMap<String, ArrayList<String>> alpha = MapBuilder.buildAlphaMap(readWords(new Scanner(new File(input2))));
                printWords(alpha);
                break;
            case "t":
                System.out.println("Suchbegriffe eingeben (ENTER für default):");

            case "q":

        }
    }

    @Override
    public ArrayList<String> readWords(Scanner scanner) throws FileNotFoundException {
        ArrayList<String> dict = new ArrayList<String>();
        scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            dict.add(scanner.next());
        }
        return dict;
    }

    @Override
    public ArrayList<String> modifyWords(ArrayList<String> wordList) {
        return modifyWords(wordList, REPLACE_ME);
    }

    @Override
    public ArrayList<String> modifyWords(ArrayList<String> wordList, String regex) {
        Iterator<String> it = wordList.iterator();
        Pattern pattern = Pattern.compile(regex);
        while (it.hasNext()) {
            String str = it.next();
            String lower = str.toLowerCase();
            Matcher matcher = pattern.matcher(lower);
            if (matcher.matches()) {
                it.remove();
            }
            wordList.add(lower);
        }

        return wordList;
    }

    @Override
    public void printWords(Map<String, ArrayList<String>> words) {
        for (String key : words.keySet()) {
            ArrayList<String> list = words.get(key);
            System.out.print(list.size() + "x " + key + ": [");
            Iterator<String> it = list.iterator();
            if (it.hasNext()) {
                System.out.print(it.next());
            }

            while (it.hasNext()) {
                System.out.print(", " + it.next());
            }
            System.out.print("]\n");

        }

    }

    public static void main(String[] args) {

    }
}
