public class Main {
    public static void main(String[] args) {
        PersonList personList = new PersonList();

        personList.getPersonList().add(new Person("Przemysław", "Dudek", 186));
        personList.addPerson(new Person("Przemysław", "Dudek", 186));

        PrintView printView = new PrintView(personList);
        printView.printView();


    }
}
