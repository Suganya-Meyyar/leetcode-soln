class Solution {

    class TrieNode {
        TrieNode[] child = new TrieNode[26];

        int index = -1;
        int length = Integer.MAX_VALUE;
    }

    TrieNode root = new TrieNode();

    private void update(TrieNode node, int idx, int len) {

        if (len < node.length ||
           (len == node.length && idx < node.index)) {

            node.length = len;
            node.index = idx;
        }
    }

    private void insert(String word, int idx) {

        TrieNode node = root;

        update(node, idx, word.length());

        for (int i = word.length() - 1; i >= 0; i--) {

            int ch = word.charAt(i) - 'a';

            if (node.child[ch] == null) {
                node.child[ch] = new TrieNode();
            }

            node = node.child[ch];

            update(node, idx, word.length());
        }
    }

    private int query(String word) {

        TrieNode node = root;

        for (int i = word.length() - 1; i >= 0; i--) {

            int ch = word.charAt(i) - 'a';

            if (node.child[ch] == null) {
                break;
            }

            node = node.child[ch];
        }

        return node.index;
    }

    public int[] stringIndices(String[] wordsContainer,
                               String[] wordsQuery) {

        for (int i = 0; i < wordsContainer.length; i++) {
            insert(wordsContainer[i], i);
        }

        int[] ans = new int[wordsQuery.length];

        for (int i = 0; i < wordsQuery.length; i++) {
            ans[i] = query(wordsQuery[i]);
        }

        return ans;
    }
}