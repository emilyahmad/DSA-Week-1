import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddressBook<E extends Person> {
    private final ArrayList<E> Entries = new ArrayList<>();

    public boolean add(E person) {
        if (findById(person.getUniqueID()) != null)
            return false;
        Entries.add(person);
        return true;
    }

    public boolean delete(E person) {
        if (person == null)
            return false;
        int id = person.getUniqueID();
        return Entries.removeIf(p -> p.getUniqueID() == id);
    }

    public boolean deleteById(int id) {
        return Entries.removeIf(p -> p.getUniqueID() == id);
    }

    public List<E> searchByFirstName(String firstName) {
        ArrayList<E> out = new ArrayList<>();
        for (E p : Entries) {
            if (p.getFirstName().equalsIgnoreCase(firstName)) {
                out.add(p);
            }
        }
        return out;
    }

    public List<E> searchByLastName(String lastName) {
        ArrayList<E> out = new ArrayList<>();
        for (E p : Entries) {
            if (p.getLastName().equalsIgnoreCase(lastName)) {
                out.add(p);
            }
        }
        return out;
    }

    public E findById(int id) {
        for (E p : Entries) {
            if (p.getUniqueID() == id)
                return p;
        }
        return null;
    }

    public List<E> all() {
        return Collections.unmodifiableList(Entries);
    }

    public int size() {
        return Entries.size();
    }

    public void printAll() {
        for (E p : Entries)
            System.out.println(p);
    }

    @Override
    public String toString() {
        String type = Entries.isEmpty() ? "Person" : Entries.get(0).getClass().getSimpleName();
        return "AddressBook<" + type + ">(size=" + Entries.size() + ")";
    }
}
