import java.util.ArrayList;
import java.util.List;

public class PersonList implements View {
    private List<Person> personList = new ArrayList<>();

    public List<Person> getPersonList() {
        return personList;
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    @Override
    public String title() {
        return "           Person List";
    }

    @Override
    public String header() {
        return "Surname        Name        Height";
    }

    @Override
    public String content() {
        String s = "";
        for(Person person : personList) {
            String n = person.getSurname();
            String i = person.getName();
            int h = person.getHeight();
            s+= String.format("%-15s %-12s %3d\n", n, i, h);
        }
        return s;
    }
}
