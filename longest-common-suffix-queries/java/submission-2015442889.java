class Solution {
    class TrieNode{
        TrieNode[] children = new TrieNode[26];

        int index = -1;
    }

    TrieNode root = new TrieNode();
    String[] wordsContainer;


    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
        this.wordsContainer = wordsContainer;

        // Build the Trie
        for(int i=0;i<wordsContainer.length;i++){
            insert(wordsContainer[i], i);
        }

        int[] ans = new int[wordsQuery.length];
        for(int i=0;i<wordsQuery.length;i++){
            ans[i] = search(wordsQuery[i]);
        }
        return ans;
    }

    void updateIndex(TrieNode node, int idx){
        if(node.index==-1 || wordsContainer[idx].length() < wordsContainer[node.index].length() || ((wordsContainer[idx].length()
             == wordsContainer[node.index].length()
             && idx < node.index))){
                node.index = idx;
             }
    }

    void insert(String word, int idx){
        TrieNode node = root;
        updateIndex(node, idx);

        for(int i=word.length()-1;i>=0;i--){
            int ch = word.charAt(i) - 'a';

            if(node.children[ch]==null){
                node.children[ch] = new TrieNode();
            }

            node = node.children[ch];
            updateIndex(node, idx);
        }
    }

    int search(String word){
        TrieNode node = root;
        for(int i=word.length()-1;i>=0;i--){
            int ch = word.charAt(i)-'a';

            if(node.children[ch]==null){
                break;
            }
            node = node.children[ch];
        }
        return node.index;
    }
}