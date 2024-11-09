package Array;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {

    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            for (int j = 0; j < s.length(); j++) {
                char a = s.charAt(j);
                if (a == x) {
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}
