package listaSimplesmenteEncadeada;

public class Lista {

	Item start;

    public Lista() {
        this.start = null;
    }

    public void insert(int data) { // TESTADO
        if (this.start == null) {
            this.start = new Item(data);
        } else {
            Item novoItem = new Item(data);
            novoItem.next = this.start;
            this.start = novoItem;
        }
    }

    public Item findItemAtIndex(int index) { // TESTADO
        if (index < 0) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        Item atual = this.start;
        int indexAtual = 0;
        while (atual != null && indexAtual != index) {
            atual = atual.next;
            indexAtual++;
        }
        if (atual == null) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        return atual;

    }

    public Item getLastItem() { // TESTADO
        if (this.start == null) {
            throw new IndexOutOfBoundsException("Lista vazia.");
        }
        Item atual = this.start;
        while (atual.next != null) {
            atual = atual.next;
        }
        return atual;
    }

    public void insertEnd(int data) { // TESTADO
        if (this.start == null) {
            insert(data);
            return;
        }
        Item ultimoItem = getLastItem();
        ultimoItem.next = new Item(data);
    }

    public void insertMiddle(int data) { // TESTADO
        if (this.start == null) {

            insert(data);
            return;
        }

        int listLength = getListLength();
        int middleIndex = listLength / 2;

        Item itemAnterior = findItemAtIndex(middleIndex - 1);
        Item novoItem = new Item(data);
        novoItem.next = itemAnterior.next;
        itemAnterior.next = novoItem;
    }

    public void removeItemAtIdex(int index) { // TESTADO
        if (index < 0) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        if (index == 0) {
            if (this.start == null) {
                this.start = this.start.next;
            } else {
                throw new IndexOutOfBoundsException("Lista vazia");
            }
            return;
        }
        Item itemAnterior = findItemAtIndex(index - 1);

        if (itemAnterior.next == null) {
            throw new IndexOutOfBoundsException("Índice Inválido");
        }
        itemAnterior.next = itemAnterior.next.next;

    }

    public int getListLength() { // TESTADO
        Item atual = this.start;
        int listLength = 0;

        while (atual != null) {
            atual = atual.next;
            listLength++;
        }

        return listLength;
    }

    public void sortList() { // TESTADO
        if (this.start.next == null) {
            System.out.println("A lista ainda não tem itens");
            return;
        }

        int listLength = getListLength();

        for (int i = 0; i < listLength; i++) {
            Item current = this.start;


            for (int j = 0; j < listLength - 1 && current.next != null; j++) {
                if (current.data > current.next.data) {
                    float tempData = current.data;
                    current.data = current.next.data;
                    current.next.data = tempData;
                }
                if (current.next != null) {
                    current = current.next;
                }
            }
        }
    }
    public void showList() { // TESTADO
        if (this.start == null) {
            System.out.println("A lista ainda não tem itens");
            return;
        }
        Item atual = this.start;

        while (atual != null) {
            System.out.println(atual.data);
            atual = atual.next;
        }
    }

    public void invertList() { // TESTADO
        if (this.start == null || this.start.next == null) {
            System.out.println("A lista ainda não tem itens ou contém apenas um valor");
            return;
        }

        Item previous = null;
        Item current = this.start;
        Item next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        this.start = previous;
    }
}
