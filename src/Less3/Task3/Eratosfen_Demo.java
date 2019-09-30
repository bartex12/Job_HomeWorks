package Less3.Task3;

import java.util.Arrays;

public class Eratosfen_Demo {

    public static void main(String[] args) {
        new Eratosfen(100).fillSieve();
    }

    //https://ru.wikibooks.org/wiki/Реализации_алгоритмов/Решето_Эратосфена#Java
    // 1)- создаём boolean массив primes размером n = primes.length, заполняяя его true со 2 элемента
    // 2) перебираем элементы массива от 2 до n
    // 3) если элемент массива всё ещё true, то
    // 4) -изменяем на false элементы массива  от 2j до n считая шагами по i (это будут числа кратные i: 2i, 3i, 4i, …)
    // 5) = выводим в консоль индексы элементов массива primes, значение которых = true

    private static class Eratosfen {
        boolean[] primes;
        public Eratosfen(int n) {
            primes=new boolean[n+1];  // от 0 до 100 - это 101 элемент
        }

        public void fillSieve() {
            Arrays.fill(primes, true);                          // 1)
            primes[0] = false;
            primes[1] = false;

            for (int i = 2; i < primes.length; i++) {               // 2)
                if (primes[i]) {                                    // 3)
                    for (int j = 2; i * j < primes.length; j++) {   // 4)
                        primes[i * j] = false;
                    }
                }
            }

            for (int i = 2; i< primes.length; i++){                 // 5)
                if (primes[i]){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

    }
}
