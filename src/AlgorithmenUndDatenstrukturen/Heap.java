package AlgorithmenUndDatenstrukturen;

import java.util.Arrays;
import java.util.List;

public class Heap {
    List<Integer> heap;

    public Heap(List<Integer> heap) {
        this.heap = heap;
        buildHeap();
    }

    public void heapify(int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;
        if (l < heap.size() && heap.get(l) > heap.get(i)) {
            largest = l;
        }
        if (r < heap.size() && heap.get(r) > heap.get(largest)) {
            largest = r;
        }
        if (largest != i) {
            int temp = heap.get(i);
            heap.set(i, heap.get(largest));
            heap.set(largest, temp);
            heapify(largest);
        }
    }

    public void buildHeap() {
        for (int i = heap.size()/2; i >= 0; i--) {
            heapify(i);
        }
    }

    public int extractMax() {
        if (heap.isEmpty()) {
            return -1;
        }
        int max = heap.get(0);
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        heapify(0);
        return max;
    }

    public void insert(int key) {
        heap.add(key);
        int i = heap.size() - 1;
        while (i > 0 && heap.get(i) > heap.get(parent(i))) {
            int temp = heap.get(i);
            heap.set(i, heap.get(parent(i)));
            heap.set(parent(i), temp);
            i = parent(i);
        }
    }

    public int parent(int i) {
        return (i-1)/2;
    }

    public int left(int i) {
        return 2*i + 1;
    }

    public int right(int i) {
        return 2*i + 2;
    }

    public void print() {
        System.out.println(Arrays.toString(heap.toArray()));
    }
}
