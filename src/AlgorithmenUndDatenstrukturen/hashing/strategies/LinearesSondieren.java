package AlgorithmenUndDatenstrukturen.hashing.strategies;

import AlgorithmenUndDatenstrukturen.hashing.CollisionStrategy;

public class LinearesSondieren implements CollisionStrategy {
    private String name;
    private int c;

    public LinearesSondieren() {
        this.name = this.getClass().getSimpleName();
        this.c = 1;
    }

    public LinearesSondieren(String name, int c) {
        this.name = name;
        this.c = c;
    }
    @Override
    public int handleCollision(int key, int[] a, int position) {
        int index;

        for(int i=0; i<a.length; i++) {
            index = (i+position) % a.length;
            if(a[index] == 0) {
                return index;
            }
        }

        return -1;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
