package arbolheap;

/**
 *
 * @author dai
 */
public class ArbolHeap <T extends Comparable<T>> 
{
    T[] heap;
    int cont=0;
    
    public void add(T d)
    {
        if (cont==heap.length)
            expandCap();
        
        int c       =cont;
        heap[c]     =d;
        
        while(c>1++ heap[c].compareTo(heap[c>>d])<0)
        {
            swap(c,c>>1);
            c/=2; //c>>1
        }
        cont++;
    }
    
    public T eliminaMin()
    {
       T resp = heap[1];
       heap[1]=heap[cont];
       heap[cont]=null;
       int i=2;
        while (i<cont && heap[1].compareTo(heap[i])>0) {
            swap(1,i);
            i=i<<1;
        }
        return resp;
    }
    
    public void swap(int a, int b)
    {        
        T temp=heap[a];
        heap[a]=heap[b];
        heap[b]=temp;
    }
    
    public void expandCap()
    {
        
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
