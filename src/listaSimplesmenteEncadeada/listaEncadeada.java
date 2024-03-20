package listaSimplesmenteEncadeada;

public class listaEncadeada{

public static void main(String[]args){
	Lista newList = new Lista();

        System.out.println("Inserindo e mostrando itens");

        newList.insert(5);
        newList.insert(10);
        newList.insert(15);
        newList.insert(20);
        newList.insert(25);

        newList.showList();

        System.out.println("--------------------------------------------------------");


        System.out.println("Retornando o ultimo item");

        Item lastItem = newList.getLastItem();
        float lastItemData = lastItem.data;
        System.out.println(lastItemData);


        System.out.println("--------------------------------------------------------");


        System.out.println("Buscando o item desejado");

        Item findItem = newList.findItemAtIndex(0);
        System.out.println(findItem.data);


        System.out.println("--------------------------------------------------------");


        System.out.println("Inserindo o item no final");

        newList.insertEnd(111);
        newList.showList();


        System.out.println("--------------------------------------------------------");


        System.out.println("Inserindo o item no meio");

        newList.insertMiddle(222,3);
        newList.showList();


        System.out.println("--------------------------------------------------------");


        System.out.println("Escolhendo o item a ser removido");

        newList.removeItemAtIdex(4);
        newList.showList();


        System.out.println("--------------------------------------------------------");


        System.out.println("Exibindo o tamanho da lista");

        int length = newList.getListLength();
        System.out.println(length);


        System.out.println("--------------------------------------------------------");


        System.out.println("Ordenando a lista");

        newList.sortList();
        newList.showList();


        System.out.println("--------------------------------------------------------");


        System.out.println("Invertendo a ordem da lista");

        newList.invertList();
        newList.showList();
    }
}
