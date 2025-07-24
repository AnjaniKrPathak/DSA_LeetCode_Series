class TrieNode {
    boolean isWord;
    TrieNode[] children = new TrieNode[26];

    public TrieNode() {
        isWord = false;
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            int k = word.charAt(i) - 'a';
            if (curr.children[k] == null) {
                curr.children[k] = new TrieNode();
            }
            curr = curr.children[k];
        }
        curr.isWord = true;
    }

    public boolean search(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            int k = word.charAt(i) - 'a';
            if (curr.children[k] == null) {
                return false;
            }
            curr = curr.children[k];
        }
        return curr.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int k = prefix.charAt(i) - 'a';
            if (curr.children[k] == null) {
                return false;
            }
            curr = curr.children[k];
        }
        return true;
    }
}