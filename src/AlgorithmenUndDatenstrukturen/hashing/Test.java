package AlgorithmenUndDatenstrukturen.hashing;

import AlgorithmenUndDatenstrukturen.hashing.methods.ModuloMethod;
import AlgorithmenUndDatenstrukturen.hashing.strategies.LinearesSondieren;
import AlgorithmenUndDatenstrukturen.hashing.strategies.QuadratischesSondieren;

public class Test {
    public static void main(String[] args) {
        int[] keys = {16, 44, 21, 5, 19, 22, 8, 33, 27, 30, 12};
        HashTable hashTable = new HashTable(keys.length, 1, new ModuloMethod(), new LinearesSondieren());

        for(int key : keys) {
            hashTable.insert(key);
            hashTable.print();
        }

        System.out.println(hashTable.search(2));
        System.out.println(hashTable.search(21));
    }
}
