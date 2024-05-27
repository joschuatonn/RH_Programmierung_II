package AlgorithmenUndDatenstrukturen;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(16);
        list.add(9);
        list.add(10);
        list.add(14);
        list.add(8);
        list.add(7);
        Heap heap = new Heap(list);
        heap.print();
        heap.extractMax();

        heap.print();
        heap.insert(16);
        heap.print();

    }
}
