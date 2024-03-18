package listaEncadeada;

public class Lista {

	Item start;

	public Lista() {
		this.start = null;
	}

	public void insert(int data) {

		if (this.start == null) {
			this.start = new Item(data);
		} else {
			Item newItem = new Item(data);

			newItem.next = this.start;

			this.start = newItem;
		}

	}

	public void insertEnd(int data) {

		if (this.start == null) {
			insert(data);
		} else {
			Item current = this.start;
			while (current.next != null) {
				current = current.next;
				current.next = new Item(data);
			}
		}
	}
/**
 ta errado **/
	
	public void insertMiddle(int data) {
		if(this.start == null) {
			insert(data);
		}else {
			Item previousItem = this.start
		}
	}
}
