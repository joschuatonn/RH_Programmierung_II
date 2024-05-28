package AlgorithmenUndDatenstrukturen.hashing.strategies;

import AlgorithmenUndDatenstrukturen.hashing.CollisionStrategy;

public class QuadratischesSondieren implements CollisionStrategy {
    @Override
    public int handleCollision(int key, int[] a, int position) {
        for(int i=1; i<(a.length - 1) / 2; i++) {

            int index;
            for(int j=1; j>-1; j-=2) {
                index = Math.floorMod(position + ((int) (Math.pow(i, 2) * j)), a.length);

                if(a[index] == 0) {
                    return index;
                }
            }
        }
        return -1;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
