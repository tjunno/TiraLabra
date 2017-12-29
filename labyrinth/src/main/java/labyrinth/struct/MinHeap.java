package labyrinth.struct;

import java.util.Comparator;

/**
 * Will be implementing MinHeap
 * 
 * @author Tuomas Junno
 * @param <T> 
 */
public class MinHeap<T> {
    private T[] heap;
    private Comparator c;
    private int size;
    
    public MinHeap(int initsize, Comparator c){
        this.heap = (T[])new Comparable[initsize];
        this.c = c;
    }

    public MinHeap(Comparator c) {
        this.heap = (T[])new Comparable[1];
        this.c = c;
    }
    
    public void add(T e){
        heap[size] = e;
        size++;
        upHeapify(size - 1);
    }
    
    public void swap(int i, int j){
        T t = heap[i];
        heap[i] = heap[j];
        heap[j] = t;      
    }
    
    public T poll(){
        if (size == 0){
            return null;            
        }
        size--;
        swap(0, size);
        downHeapify(size);
        return heap[size];
    }
    
    private int parent(int c) {
        return (c - 1) >> 1;        
    }
    
    public boolean isEmpty() {
        return size==0;   
    }
    
    private int right(int p) {
        return (p + 1)>>1;
    }

    private int left(int p) {
        return (p << 1) + 1;
    }    

    private void upHeapify(int i) {
        if (i == 0){
            return;
        }
        while (i>0){
            if (c.compare(heap[parent(i)], heap[i]) >= 0){
//            if (heap[j].compareTo(heap[i])>=0){
                return;
            } else { 
            swap(i, parent(i));
            i=parent(i);
            }
        }    
    }

    private void downHeapify(int size) {
        int i;
        int j = 0;
        do{
            i=j;
            if (right(i) < size){            
                if (c.compare(heap[j], heap[i]) < 0){
                //if (heap[j].compareTo(heap[i]) < 0){
                    j=left(i);
                }
                if (right(i) < size && c.compare(heap[j], heap[i]) < 0){
                //if (right(i) < size && heap[j].compareTo(heap[i]) < 0){
                    j=right(i);
                }
            }
            swap(i,j);
        }while(i!=j);
    }
}
