package Product;

public interface ProductManager<T> {
    void add(T T);
    void print();
    int find(int id);
    void set(int id,T t);
    void delete(int id);
    void sort ();




}
