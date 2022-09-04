package Modul4;

public class BinnaryTree1 {

	Node root;

	public void tambah(int data) {

		Node nodebaru = new Node(data);
		if (root == null) {
			root = nodebaru;
		}

		else {
			Node a = root;
			Node child;
			while (true) {
				child = a;

				if (data < a.data) {
					a = a.kiri;

					if (a == null) {
						child.kiri = nodebaru;
						return;
					}
				}

				else {
					a = a.kanan;
					if (a == null) {
						child.kanan = nodebaru;
						return;
					}
				}
			}
		}
	}

	void Preorder(Node a) {
		if (a != null) {
			System.out.print(a.data + " ");
			Preorder(a.kiri);
			Preorder(a.kanan);
		}
	}

	void Inorder(Node a) {
		if (a != null) {
			Inorder(a.kiri);
			System.out.print(a.data + " ");
			Inorder(a.kanan);
		}
	}

	public void postOrder(Node a) {
		if (a != null) {
			postOrder(a.kiri);
			postOrder(a.kanan);
			System.out.print(a.data + " ");
		}
	}

	public void printPost() {
		postOrder(root);
	}

	public void printIn() {
		Inorder(root);
	}

	public void printPre() {
		Preorder(root);
	}

	int total(Node root) {
		if (root == null)
			return 0;
		return (root.data + total(root.kiri) + total(root.kanan));
	}

	public BinnaryTree1() {
		root = null;
	}

	int jumlahLeaf() {
		return jumlahLeaf(root);
	}

	int jumlahLeaf(Node node) {
		if (node == null)
			return 0;
		if (node.kiri == null && node.kanan == null)
			return 1;
		else
			return jumlahLeaf(node.kiri) + jumlahLeaf(node.kanan);
	}

	int totalNode(Node root) {
		int totalNode, ltinggi, rtinggi;
		if (root == null)
			return 0;
		else {
			ltinggi = totalNode(root.kiri);
			rtinggi = totalNode(root.kanan);
			if (ltinggi > rtinggi)
				ltinggi += 1;
			else
				rtinggi += 1;
		}
		totalNode = ltinggi + rtinggi;
		return totalNode;
	}

	int tinggi(Node root) {
		if (root == null)
			return 0;
		else {
			int ltinggi = tinggi(root.kiri);
			int rtinggi = tinggi(root.kanan);
			if (ltinggi > rtinggi)
				return (ltinggi + 1);
			else
				return (rtinggi + 1);
		}
	}

	void cetakLevel(Node root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.data + ", ");
		else if (level > 1) {
			cetakLevel(root.kiri, level - 1);
			cetakLevel(root.kanan, level - 1);
		}
	}

	void level() {
		int h = tinggi(root);
		int i;
		for (i = 1; i <= h; i++) {
			System.out.print("Data : ");
			cetakLevel(root, i);
			System.out.println("Level node : " + (i - 1));
		}
	}
}
