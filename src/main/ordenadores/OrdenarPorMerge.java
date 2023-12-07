package ordenadores;
public class OrdenarPorMerge implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        return array;
    }

    public int[] merge(int[] array1, int[] array2) {
        int tamanho1 = array1.length;
        int tamanho2 = array2.length;
        int[] mArray = new int[tamanho1 + tamanho2];

        int i = 0, j = 0, k = 0;

        while (i < tamanho1 && j < tamanho2) {
            if (array1[i] < array2[j]) {
                mArray[k++] = array1[i++];
            } else {
                mArray[k++] = array2[j++];
            }
        }

        while (i < tamanho1) {
            mArray[k++] = array1[i++];
        }

        while (j < tamanho2) {
            mArray[k++] = array2[j++];
        }

        return mArray;
    }
    
}
