package Less3.Task1;

public class Sort_Insertion_Demo {
    public static void main(String[] args) {

        //Вычислительная сложность алгоритма сортировки вставкой
        // Для НЕ отсортированного массива время работы квадратично зависит от размера входных данных
        // Для отсортированного массива время работы линейно зависит от размера входных данных

        //сортируем вставкой
        int[] arrayDemo = {5, -2, 48, 1, -14, 0 };
        sortInsertion(arrayDemo);
        printArray(arrayDemo);
        System.out.println("*****************************");
        int[] arrayDemo1 = {5};
        sortInsertion(arrayDemo1);
        printArray(arrayDemo1);

    }

    //Метод сортировки вставкой на примере типа int
    private static int[]  sortInsertion(int[] array){

        for (int i = 1; i<array.length; i++ ){
            int x = array[i];
            int j = i;
            while (j>0 && array[j-1]>x){
                array[j] = array [j-1];
                j--;
            }
            array[j] = x;
        }
        return array;
    }

    private static void printArray(int[] arrayDemo) {
        for (int i : arrayDemo) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
