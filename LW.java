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

class pTree {
    Node root = new Node();

    public void insert(String st) {
        Node cur = root;
        for (int i = 0; i < st.length(); i++) {
            int idx = st.charAt(i) - 'a';

            if (cur.children[idx] == null) { // Check if the child node doesn't exist
                cur.children[idx] = new Node();
            }
            if (i == st.length() - 1) {
                cur.children[idx].eow = true;
            }
            cur = cur.children[idx];
        }
    }

    public String ans = "";

    public void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        if (temp.length() > ans.length()) {
            ans = temp.toString();
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow) { // Simplified condition
                temp.append((char) (i + 'a'));
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }
}

public class LW {
    public static void main(String[] args) {
        String[] words = { "a", "banana", "app", "ap", "appl", "apply", "apple" };
        pTree pt = new pTree();

        for (String w : words) {
            pt.insert(w);
        }
        pt.longestWord(pt.root, new StringBuilder(""));
        System.out.println(pt.ans);
    }
}
