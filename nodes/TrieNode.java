class TrieNode{

    TrieNode[] child = new TrieNode[26];
    boolean end;

    TrieNode(){
      end = false;
      for(int i=0;i<26;i++){
        child[i] = null;
    }
  }
}


class Trie{

  TrieNode root;

  Trie(){
    root = new TrieNode();
  }


}
