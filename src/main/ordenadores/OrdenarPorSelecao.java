package ordenadores;

public class OrdenarPorSelecao implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        return array;
    }

    
}
