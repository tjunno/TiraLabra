package labyrinth.struct;

import java.util.Comparator;

/**
 * . MinHeap implemention
 *
 * @author Tuomas Junno
 * @param <T>
 */
public class MinHeap<T> {
    /**
     * . Heap
     */
    private T[] heap;
    /**
     * . Comparator
     */
    private Comparator<T> c;
    /**
     * . Size of the heap.
     */
    private int size;

    /**
     * . Minheap with size.
     *
     * @param initsize initsize
     * @param c2 c2
     */
    public MinHeap(final int initsize, final Comparator<T> c2) {
        @SuppressWarnings("unchecked")
        T[] h = (T[]) new Object[initsize];
        this.heap = h;
        this.c = c2;
    }

    /**
     * . Minheap without size.
     *
     * @param c2 c2
     */
    public MinHeap(final Comparator<T> c2) {
        this(1, c2);
    }

    /**
     * . Adds to the heap
     *
     * @param e e
     */
    public void add(final T e) {
        if (size + 1 > heap.length - 1) {
            upsize();
        }
        size++;
        heap[size] = e;
        upHeapify();
    }

    /**
     * . Swap places in the heap.
     *
     * @param i i
     * @param j j
     */
    public void swap(final int i, final int j) {
        T t = heap[i];
        heap[i] = heap[j];
        heap[j] = t;
    }

    /**
     * . Poll
     *
     * @return h heap
     */
    public T poll() {
        if (isEmpty()) {
            return null;
        }
        T h = heap[1];
        heap[1] = heap[size];
        heap[size] = null;
        size--;
        downHeapify();
        return h;
    }

    /**.
     * Tests if the heap is empty.
     * @return boolean
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**.
     * Returns size of the heap.
     * @return size
     */
    public int size() {
        return this.size;
    }

    private int parent(final int c2) {
        return c2 / 2;
    }

    private int left(final int p) {
        return (2 * p);
    }

    private int right(final int p) {
        return (2 * p) + 1;
    }

    private void upHeapify() {
        int i = size;
        while (i > 1 && c.compare(heap[parent(i)], heap[i]) > 0) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    private void downHeapify() {
        int i = 1;
        while (left(i) < size) {
            int j = left(i);
            if (right(i) <= size && c.compare(heap[left(i)],
            heap[right(i)]) > 0) {
                j = right(i);
            }
            if (c.compare(heap[i], heap[j]) > 0) {
                swap(i, j);
            }
            i = j;
        }
    }

    private void upsize() {
        @SuppressWarnings("unchecked")
        T[] n = (T[]) new Object[this.heap.length * 2];
        // System.arraycopy(this.heap, 0, n, 0, this.heap.length);
        for (int i = 0; i < this.heap.length; i++) {
            n[i] = this.heap[i];
        }
        this.heap = n;
    }
}
