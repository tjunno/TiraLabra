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
        this(1, c);
    }
    
    public void add(T e){
        if (size >= heap.length - 1){
            upsize();
        }
        size++;
        heap[size] = e;
        upHeapify();
    }
    
    public void swap(int i, int j){
        T t = heap[i];
        heap[i] = heap[j];
        heap[j] = t;
    }
    
    public T poll(){
        if (isEmpty()){
            return null;            
        }
        T h = heap[1];
        heap[1] = heap[size];
        heap[size] = null;
        size--;
        downHeapify();
        return h;
    }
    
    private int parent(int c) {
        return c/2;
    }
    
    public boolean isEmpty() {
        return size==0;   
    }
    
    public int size(){
        return size;
    }
    
    private int right(int p) {        
        return (2 * p);
    }

    private int left(int p) {        
        return (2 * p) + 1;
    }    

    private void upHeapify() {
        int i = this.size;
        while (i>0 && c.compare(heap[parent(i)], heap[i]) > 0){
//            if (c.compare(heap[parent(i)], heap[i]) > 0){
//            if (heap[j].compareTo(heap[i])>0){
            //    return;
            //} else { 
            swap(i, parent(i));
            i=parent(i);
            //}
        }    
    }
/*
    private void downHeapify2(int size) {
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
    }*/
    private void downHeapify(){
        int i=1;
        while(left(i) <= size){
            int j = left(i);
            if (right(i) <= size && c.compare(heap[left(i)], right(i)) > 0){
                j = right(i);
            }
            if (c.compare(heap[i], heap[j]) > 0){
                swap(i,j);
            }
            i=j;
        }
    }
    
    private void upsize() {
        T[] n = (T[]) new Object[this.heap.length * 2];
        //System.arraycopy(this.heap, 0, n, 0, n.length);
        for(int i=0; i<n.length; i++){
            n[i] = this.heap[i];
        }
        this.heap = n;
    }

}
