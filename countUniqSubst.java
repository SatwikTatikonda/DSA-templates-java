class node {
    node[] children;
    boolean eow;

    node() {
        children = new node[26];
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
        eow = false;
    }
}

class pTree {
    node root = new node();

    public void insert(String word) {
        node cur = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (cur.children[idx] == null) {

                cur.children[idx] = new node();
            }
            if (i == word.length() - 1) {
                cur.children[idx].eow = true;
            }
            cur = cur.children[idx];
        }
    }

    public int count(node root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                sum += count(root.children[i]);
            }
        }
        return sum + 1;

    }

}

class countUniqSubst {
    public static void main(String[] args) {
        String st = "ababa";
        pTree pt = new pTree();
        for (int i = 0; i < st.length(); i++) {
            pt.insert(st.substring(i));
            // System.out.println(st.substring(i));
        }
        System.out.println(pt.count(pt.root));

    }
}