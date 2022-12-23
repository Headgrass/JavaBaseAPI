package Lections.Lec6;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("id: %d fn: %s ln:%s s: %d", id, firstName, lastName, salary);
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        var t = (Worker) obj;
        return id == t.id && firstName == t.firstName;
    }
}
