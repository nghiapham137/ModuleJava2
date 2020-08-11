public interface Iservice<T> {
    void add(T t);
    void update(int id);
    void getAll();
    void delete(int id);
}
