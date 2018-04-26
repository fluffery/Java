import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;


    public interface ITextAnalyzer {
        public void run();
        public ArrayList<String> readWords(Scanner scanner) throws FileNotFoundException;
        public ArrayList<String> modifyWords(ArrayList<String> wordList);
        public ArrayList<String> modifyWords(ArrayList<String> wordList,String regex);
        public void printWords(Map <String,ArrayList<String>> words);
    }

