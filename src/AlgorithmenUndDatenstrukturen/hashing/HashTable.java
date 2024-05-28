package AlgorithmenUndDatenstrukturen.hashing;

import java.util.Arrays;

public class HashTable {
    int[] table;
    HashingMethod method;
    CollisionStrategy strategy;
    public HashTable(int m, int b, HashingMethod method, CollisionStrategy strategy) {
        this.table = new int[m*b];
        this.method = method;
        this.strategy = strategy;

        System.out.println("X-----------------------------------------------X");

        System.out.println("Es wird die HashingMethode " + method.getName() + " verwendet");

        if(strategy == null) {
            System.out.println("Es wird keine Kollisionsstrategie angewendet");
        } else {
            System.out.println("Es wird die Kollisionsstrategie " + strategy.getName() + " angewendet");
        }
        System.out.println("X-----------------------------------------------X");
    }

    public HashTable(int m, int b, HashingMethod method) {
        this(m, b, method, null);
    }

    public int search(int key) {
        int index;

        for(int i=0; i<this.table.length; i++) {
            index = (this.method.getHash(key, this.table.length) + i) % this.table.length;
            if(this.table[index] == key) {
                return key;
            } else if(this.table[index] == 0) {
                break;
            }
        }

        return -1;
    }

    public void insert(int key) {
        int index = this.method.getHash(key, this.table.length);

        System.out.println("Element mit dem Key '" + key + "' soll an Stelle '"+index+"' eingefügt werden");

        if(this.table[index] == 0) {
            this.table[index] = key;
        } else {
            System.out.println("Es ist zu einer Kollision gekommen, die wird jetzt von der Strategy gehandelt");
            if(this.strategy != null) {
                int indexHandled = strategy.handleCollision(key, this.table, index);
                if(indexHandled == -1) {
                    System.out.println("Konnte nicht gehandelt werden");
                } else {
                    this.table[indexHandled] = key;
                }
            }
        }

    }

    public void delete(int key) {
        this.table[this.method.getHash(key, this.table.length)] = -1;
    }

    public void print() {
        System.out.println(Arrays.toString(this.table));
        System.out.println();
    }
}
