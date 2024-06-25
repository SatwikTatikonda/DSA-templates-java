class Node {
    Node[] children;
    boolean eow;

    Node() {
        children = new Node[26];

        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
        eow = false;
    }

}

class prefixTree {

    Node root = new Node();

    public void insert(String word) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (cur.children[idx] == null) {
                cur.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                cur.children[idx].eow = true;
            }
            cur = cur.children[idx];
        }
    }

    public boolean search(String word) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (cur.children[idx] == null) {
                return false;

            }
            if (i == word.length() - 1) {
                if (cur.children[idx].eow == false) {
                    return false;
                }
            }
            cur = cur.children[idx];
        }
        return true;

    }

    public boolean wordbreak(String key) {
        if (key.length() == 0) {
            return true;

        }
        for (int i = 1; i <= key.length(); i++) {
            String first = key.substring(0, i);
            String second = key.substring(i);

            if (search(first) && wordbreak(second)) {
                return true;
            }
        }
        return false;

    }
}

public class wordbreakprblm {

    public static void main(String[] args) {
        String[] words = { "leet", "neet", "code" };
        prefixTree pt = new prefixTree();
        for (String w : words) {
            pt.insert(w);
        }

        System.out.println(pt.wordbreak("leetcode"));

    }
}
