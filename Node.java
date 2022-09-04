package Modul4;

public class Node {

	int data;
	Node kiri, kanan;

	public Node() {

	}

	public Node(int item) {
		data = item;
		kiri = kanan = null;
	}

	public Node Nodes(int key) {
		Node node = new Node();
		node.data = key;
		node.kiri = node.kanan = null;
		return node;
	}
}
