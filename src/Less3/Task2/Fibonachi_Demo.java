package Less3.Task2;

public class Fibonachi_Demo {
    public static void main(String[] args) {

        long[] arr = fiboRecur(20);
        printArray(arr);
        System.out.println("*****************************");
        long[] arr1 = fiboRecur(94);
        printArray(arr1);
    }

    // Вычисление чисел Фибоначи методом рекурсии
    //время вычислений растёт экспоненциально от n
    private static long[] fiboRecur(int n){

        //если n>93, результат неверный
        if (n>93){
            System.out.println("Превышение диапазона значений long");
        return  null;
        }

        long[] fibonachiArray = new long[n];
        fibonachiArray[0] = 0;
        fibonachiArray[1] = 1;
        for (int i = 2; i < n; ++i) {
            fibonachiArray[i] = fibonachiArray[i - 1] + fibonachiArray[i - 2];
        }
        return fibonachiArray;
    }

    private static void printArray(long[] arrayDemo) {

        if (arrayDemo != null){
            System.out.println("Первые " + arrayDemo.length + " чисел Фибоначи");
        }

      try {
          for (long i : arrayDemo) {
              System.out.print(i + " ");
          }
          System.out.println();
      }catch (NullPointerException e){
          System.out.println("Печать невозможна: массив = null");
      }

    }
}
