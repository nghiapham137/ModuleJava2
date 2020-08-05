public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index , E element) {
        if (size < elements.length){
        for (int i = size - 1; i >= index ; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
        }else System.out.println("Đã quá kích thước danh sách");
    }

   public void ensureCapacity(int minCapacity) {
        if (size >= elements.length) {
            E[] newElements = (E[]) (new Object[minCapacity]);
            System.arraycopy(elements,0,  newElements,0,size );
            elements = newElements;
        }
   }

   public E remove(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Vị trí " + index + " ko thuộc mảng");
        }else {
            E e = (E) elements[index];
            for (int i = index; i < size - 1 ; i++)
                elements[i] = elements[i + 1];
            elements[size - 1] = null;
            size--;
            return e;
        }
   }


   public Object getElement(int index) {
        return elements[index];
   }

   public boolean contains(E e) {
       for (int i = 0; i < size; i++)
           if (e.equals(elements[i]))
               return true;

       return false;
   }

   public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
   }

   public int indexOf(E e) {
       for (int i = 0; i < size; i++)
           if (e.equals(elements[i])) return i;

       return -1;
   }

   public E clone() {
        return (E) elements.clone();
   }

   public int getSize() {
        return elements.length;
   }


}
