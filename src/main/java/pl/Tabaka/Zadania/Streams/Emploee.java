package pl.Tabaka.Zadania.Streams;

public class Emploee {
    // Wypisz z mid (4k-5k) , ustaw ich na 4.8k, i wypisać ID tych typow oraz wszystkich osob
    private int id;
    private String name;
    private String surname;
    private float salary;
    public position position;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Emploee.position getPosition() {
        return position;
    }

    public void setPosition(Emploee.position position) {
        this.position = position;
    }

    public Emploee(int id, String name, String surname, float salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    private enum position{
        LOW,
        MID,
        HIGH
    }
}
