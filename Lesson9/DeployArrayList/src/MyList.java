import java.util.Arrays;

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
        if (size < elements.length)
            addsize(index, element);
        else    ensureCapacity(5);
    }



    private void addsize(int index, E element) {
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public void ensureCapacity(int minCapacity) {
        if (size >= elements.length) {
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
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
       for (int i = 0; i < elements.length; i++)
           if (e.equals(elements[i]))
               return true;

       return false;
   }

   public void clear() {
       for (int i = 0; i < elements.length; i++) {
           elements[i] = null;
       }
   }

   public int indexOf(E e) {
       for (int i = 0; i < size; i++)
           if (e.equals(elements[i])) return i;

       return -1;
   }

   public MyList(Object[] newElements ) {
        elements = newElements;
   }

   public MyList<E> clone() {
       E cloneArray[] = (E[]) elements.clone();
       return new MyList<>(cloneArray);
   }

   public int getSize() {
        int count = 0;
       for (int i = 0; i < elements.length ; i++) {
           if (elements[i] != null)
               count++;
       }
       return count;
   }

   public E get(int index) {
       for (int j = 0; j < elements.length; j++) {
           if (j == index)
               return (E) elements[j];
       }
       return (E) "ko tìm thấy";
   }

   public void sprintList() {
        for (Object e : elements)
            System.out.print(e + " ");
   }

}
