import ordenadores.OrdenarPorInsercao;
import ordenadores.OrdenarPorMerge;
import ordenadores.OrdenarPorSelecao;

public class Main {
    public static void main(String[] args) {

    System.out.println("\nSeleção\n");
     int[] array = {5,3,2,4,7,1,0,6};
     OrdenarPorSelecao o = new OrdenarPorSelecao();
     int [] array2 = o.ordene(array);
     for (int i: array2){
        System.out.println(i);
     }

    System.out.println("\nMerge\n");
    int[] array5 = {7,9,15,17,20};
    int [] array6 = {0,1,2,22,30};
    OrdenarPorMerge m = new OrdenarPorMerge();
    int[] r = m.merge(array5, array6);
    for (int i : r){
        System.out.println(i);
    }
}
}
