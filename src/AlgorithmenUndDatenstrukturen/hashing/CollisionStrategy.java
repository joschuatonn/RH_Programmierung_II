package AlgorithmenUndDatenstrukturen.hashing;

public interface CollisionStrategy {
    int handleCollision(int key, int[] a, int position);
    String getName();
}
