import java.util.*;

class HNode{

        int freq;
        char ch;
       HNode left;
        HNode right;

}

 class Compare implements Comparator<HNode>{

        public int compare(HNode a, HNode b){

                return a.freq-b.freq;

        }

}

class Huffman{

	public static void main(String[] args){

		char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' }; 
        	int[] charfreq = { 5, 9, 12, 13, 16, 45 };


		PriorityQueue<HNode> queue = new PriorityQueue<HNode>(charArray.length, new Compare());
		for(int i=0;i<charArray.length;i++){
			HNode node = new HNode();
			node.freq = charfreq[i];
			node.ch = charArray[i];
			node.left = null;
			node.right = null;
			queue.add(node);
		} 

		HNode root = null;

		while(queue.size()>1){

			HNode one = queue.poll();
			HNode two = queue.poll();
			HNode parent = new HNode();
			parent.freq = one.freq + two.freq;
			parent.ch = '.';
			parent.left = one;
			parent.right = two;
			root = parent;
			queue.add(parent);

		}
		printHuffman(root,"");
	}

	static void printHuffman(HNode root, String str){

		if(root.left == null && root.right == null && root.ch != '.'){
			System.out.println(root.ch+"       "+str);
			return;
		}
		printHuffman(root.left,str+"0");
		printHuffman(root.right, str+"1");
		
		
	}

}
