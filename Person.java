public class Person {
    public int id;
    public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Başvuranın ID'si " + id + ", ismi " + name;
    }
}