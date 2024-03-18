package src.listaEncadeada;

public class Lista {

	Item start;

	public Lista() {
		this.start = null;
	}

	public void insert(int data) {
		if (this.start == null) {
			this.start = new Item(data);
		} else {
			Item novoItem = new Item(data);
			novoItem.next = this.start;
			this.start = novoItem;
		}
	}

	private Item findItemAtIndex(int index) {
		if (index < 0) {
			throw new IndexOutOfBoundsException("Índice inválido.");
		}
		Item atual = this.start;
		int indexAtual = 0;
		while (atual != null && indexAtual < index) {
			atual = atual.next;
			indexAtual++;
		}
		if (atual == null) {
			throw new IndexOutOfBoundsException("Índice inválido.");
		}
		return atual;
	}

	public Item getLastItem() {
		if (this.start == null) {
			throw new IndexOutOfBoundsException("Lista vazia.");
		}
		Item atual = this.start;
		while (atual.next != null) {
			atual = atual.next;
		}
		return atual;
	}

	public void insertEnd(int data) {
		if (this.start == null) {
			insert(data);
			return;
		}
		Item ultimoItem = getLastItem();
		ultimoItem.next = new Item(data);
	}

	public void insertMiddle(int data, int index) {
		if (index < 0) {
			throw new IndexOutOfBoundsException("Índice inválido.");
		}
		if (index == 0) {
			insert(data);
			return;
		}
		Item itemAnterior = findItemAtIndex(index - 1);
		Item novoItem = new Item(data);
		novoItem.next = itemAnterior.next;
		itemAnterior.next = novoItem;
	}
}