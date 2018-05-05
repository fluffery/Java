import java.util.*;


public class MapBuilder {

    public static HashMap<String, ArrayList<String>> buildTermMap(ArrayList<String> wordList, String[] keys) {

        HashMap<String, ArrayList<String>>myhash = new HashMap<String,ArrayList<String>>();
        for (String key : keys) {
            myhash.put(key, wordList);
            String word = wordList.iterator().next();
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
        HashMap<String, ArrayList<String>> hash = new HashMap<String,ArrayList<String>>();
        Iterator<String> it= wordList.iterator();
        String [] keys= new String[wordList.size()];
        int a = 0;
        while(it.hasNext()) {
            String letter= it.next().trim().substring(0, 1);
            keys[a]= letter;
            a++;
        }
        Arrays.sort(keys);
        for(int i=0;i<keys.length;i++) {
            Iterator<String> it2 = wordList.iterator();
            ArrayList<String> list= new ArrayList<String>();
            while(it.hasNext()) {
                String words= it.next();
                if(words.contains(keys[i])) {
                    list.add(words);
                }
            }
            Collections.sort(list);
            buildTermMap.put(keys[i], list);
        }
        return buildTermMap;

    }

}

