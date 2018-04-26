import java.util.ArrayList;
import java.util.HashMap;


public class MapBuilder {

    public static HashMap<String, ArrayList<String>> buildTermMap(ArrayList<String> wordList, String[] keys) {

        HashMap<String, ArrayList<String>> hash = new HashMap<>();
        hash.put(String.valueOf(keys), wordList);
        if(file.contains(keys)) {
            wordList.add(word);
        }
        return hash;
    }



}
