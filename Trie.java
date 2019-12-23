class TrieNode{
    TrieNode[] child = new TrieNode[26];
            boolean isEndOfWord;
    
    TrieNode(){
                    isEndOfWord = false;
                    for(int i=0;i<26;i++){
                        child[i] = null;
                    }
            }
}

class Trie {
    TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {     
           root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        int length = word.length();
        TrieNode temp=root;
        
        for(int i=0;i<length;i++){
            int index = word.charAt(i) - 'a';
            if(temp.child[index] == null){
                temp.child[index] = new TrieNode();
            }
            temp = temp.child[index];
        }
        temp.isEndOfWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        int length = word.length();
        TrieNode temp=root;
        
        for(int i=0;i<length;i++){
            int index = word.charAt(i) - 'a';
            if(temp.child[index] == null){
                return false;
            }
            temp = temp.child[index];
        }
        
        return (temp!=null && temp.isEndOfWord);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String word) {
        int length = word.length();
        TrieNode temp=root;
        
        for(int i=0;i<length;i++){
            int index = word.charAt(i) - 'a';
            if(temp.child[index] == null){
                return false;
            }
            temp = temp.child[index];
        }
        
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
