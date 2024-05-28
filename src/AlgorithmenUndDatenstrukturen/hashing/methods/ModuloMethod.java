package AlgorithmenUndDatenstrukturen.hashing.methods;

import AlgorithmenUndDatenstrukturen.hashing.HashingMethod;

public class ModuloMethod implements HashingMethod {
    String name;
    public ModuloMethod() {
        this.name = this.getClass().getSimpleName();
    }

    public ModuloMethod(String name) {
        this.name = name;
    }
    @Override
    public int getHash(int key, int m) {
        return key % m;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
