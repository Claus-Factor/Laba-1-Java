public class Container<T> {
    private int capacity; // Максимальная вместимость хранилища
    private int size; // Текущий размер контейнера
    private T[] arr;

    // Увеличение максимальной ёмкости хранилища в случае переполнения
    private void resize() {
        capacity *= 2;
        T[] tempArr = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
    }

    public Container(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = (T[]) new Object[capacity];
    }
    // Конструкток по умолчанию устанавливает емкость в 10 элементов
    public Container() {
       this(10);
    }

    // Добавляем элемент в определённое место по номеру
    public void add(T element, int number) {
        if (size == capacity) {
            this.resize();
        }
        for (int i = number + 1; i <= size; i++) {
            arr[i] = arr[i - 1];
        }
        arr[number] = element;
    }
    // Добавляем элемент в конец контейнера
    public void push(T element) {
        add(element, size);
    }
    // Добавляем элемент в начало контейнера
    public void unshift(T element) {
        add(element, 0);
    }

    // Считываем значение n-го элемента
    public T get(int number) {
        if (number <= size && number >= 0) {
            return arr[number];
        } else return null;
    }
    public T get() {
        return get(size-1);
    }




}
