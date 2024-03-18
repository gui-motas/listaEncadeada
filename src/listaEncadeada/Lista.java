package listaEncadeada;

public class Lista {

	Item start;

	public Lista() {
		this.start = null;
	}

	public void insert(int data) {

		if (this.start == null) {// se o start tiver apontando pra null, ou seja, não tiver item, vai passar a apontar pra o novo item
			this.start = new Item(data);
		} else {
			Item newItem = new Item(data);

			newItem.next = this.start;//novo item aponta pro que o start estava apontando

			this.start = newItem;// start agora aponta pro novo item
		}

	}

	private Item findItemAtIndex(int index) {

		// Verificar se o índice é válido
		if (index < 0 || isEmpty()) {
			throw new IndexOutOfBoundsException("Índice inválido ou lista vazia.");
		}

		// Percorrer a lista até o índice especificado
		Item atual = this.start;
		int atualIndex = 0;
		while (atual != null && atualIndex < index) {
			atual = atual.next;
			atualIndexIndex++;
		}

		return atual;
	}

	public Item getLastItem() {

		// Obter o tamanho da lista
		int size = this.size();

		// Encontrar o item no índice size - 1
		return findItemAtIndex(size - 1);
	}


	public void insertEnd(int data) {

		if (this.start == null) {
			insert(data);
			return;
		} else {
			Item ultimo = Item getLastItem();
			ultimo.next = Item(data);// o que antes era o ultimo agora aponta para o dado inserido
		}
	}
	
	public void insertMiddle(int data, int index) {
		if (index < 0 || isEmpty()) {
			throw new IndexOutOfBoundsException("Índice inválido ou lista vazia.");
		}

		if (index == 0) {// se index for 0, insere no inicio
			insert(data);
			return;
		}

		// Encontrar o item anterior à posição de inserção
		Item previousItem = findItemAtIndex(index - 1);

		// Criar o novo item
		Item newItem = new Item(data);

		// Inserir o novo item após o item anterior
		newItem.next = previousItem.next;
		previousItem.next = newItem;
		}
}
