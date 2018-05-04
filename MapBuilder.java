import java.util.ArrayList;
import java.util.HashMap;


public class MapBuilder {

    public static HashMap<String, ArrayList<String>> buildTermMap(ArrayList<String> wordList, String[] keys) {

        HashMap<String, ArrayList<String>> myhash = new HashMap<>();
        String word = readNext(fileName);
        for (String key : keys) {
            myhash.put(key, wordList);

            if (word.contains(key)) {
                if (!wordList.contains(word)) {
                    wordList.add(word);
                }

                if (!myhash.containsKey(key)) {
                    myhash.put(key,wordList);
                }

            }
        }
        return myhash;
    }

    public static HashMap<String, ArrayList<String>> buildAlphaMap(ArrayList<String> wordList){

    }

}
