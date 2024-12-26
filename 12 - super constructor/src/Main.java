/**
 *
 * - tidak hanya untuk mengakses method atau field yang ada di parent class, kata kunci super juga bisa digunakan untuk
 * mengakses constructor
 * - namun syaratnya untuk mengakses parent class constructor, kita harus mengaksesnya di dalam class child constructor
 * - jika sebuah class parent tidak memiliki constructor yang tidak ada parameternya (tidak memiliki default constructor), maka class child
 * wajib mengakses constructor class parent tersebut
 * - intinya jika si class parent semua constrctor ada parameternya, maka semua childnya wajib mengakses constructor di class parent
 *
 */

public class Main {
    public static void main(String[] args) {


        Assasin harley = new Assasin("Harley", 100, 10);

        Rusher hayato = new Rusher();
        hayato.name = "Hayato";

        System.out.println(harley.name);
        System.out.println(hayato.name);
    }
}