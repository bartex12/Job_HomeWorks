package Less3.Task1;

public class Sort_Insertion_Demo {
    public static void main(String[] args) {

        //сортируем вставкой
        int[] arrayDemo = {5, -2, 48, 1, -14, 0 };
        sortInsertion(arrayDemo);
        printArray(arrayDemo);

        int[] arrayDemo1 = {5};
        sortInsertion(arrayDemo1);
        printArray(arrayDemo1);

    }

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
