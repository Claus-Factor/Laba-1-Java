public class Container<T> {
    private int capacity; // Максимальная вместимость хранилища
    private int size; // Текущий размер контейнера
    private T[] arr;

    public Container(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = (T[]) new Object[capacity];
    }
    public Container() {
       this(10);
    }

}
