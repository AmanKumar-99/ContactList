package list;

public interface adt {
    void add(Person data);

    void remove(Person data);

    Person search(String firstName);

    void print();
}
