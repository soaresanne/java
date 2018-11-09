package arvore.binaria;

public class Main {

	public static void main(String[] args) {
		Arvore<Integer> a = new Arvore<>();
		
		/*
		a.adiciona(5);
		a.adiciona(3);
		a.adiciona(2);
		a.adiciona(4);
		a.adiciona(7);
		a.adiciona(6);
		a.adiciona(8);
		*/
		
		a.adiciona(8);
		BTreePrinter.printNode(a.raiz);
		a.adiciona(7);
		BTreePrinter.printNode(a.raiz);
		a.adiciona(6);
		BTreePrinter.printNode(a.raiz);
		a.adiciona(5);
		BTreePrinter.printNode(a.raiz);
		a.adiciona(2);
		BTreePrinter.printNode(a.raiz);
		a.adiciona(3);
		BTreePrinter.printNode(a.raiz);
		a.adiciona(4);
		BTreePrinter.printNode(a.raiz);
	}
}