package zipcode.rocks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        //String student_source = "FakeData.csv";

        // Load data file into an ArrayList<Person> of Person objects.
        Main programObject = new Main();

        List listOfStudents = programObject.handWrittenLoadOfData();

        int numberOfPersons = listOfStudents.size();
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(listOfStudents.get(i).toString());
        }
    }

    private List loadCSVFile(String student_source) {
        ArrayList<Person> records = new ArrayList<>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);

        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                records.add(this.getRecordFromLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("File NOT FOUND.");
            e.printStackTrace();
        }
        return records;
    }

    private Person getRecordFromLine(String line) {
        // take the String of lastname,firstname and create a new Person object with it.
        String[] values = line.split(COMMA_DELIMITER);
        // Person newPerson = new Person(values[0], values[1], values[2], values[3], values[4], values[5], values[6]);
        //return newPerson;
        return null;
    }

    private List handWrittenLoadOfData() {
        ArrayList<Person> students = new ArrayList<>();

        Person person1 = new Person("Teddy", "Archibald", "half & half", "red", "March", false);
        person1.setfavoriteBeverage("half & half");
        person1.setfavoriteColor("red");
        person1.setbirthMonth("March");
        person1.sethavePets(false);
        students.add(person1);

        Person person2 = new Person("Peter", "Van Beever", "latte", "purple", "February", true);
        person2.setfavoriteBeverage("latte");
        person2.setfavoriteColor("purple");
        person2.setbirthMonth("February");
        person2.sethavePets(true);
        students.add(person2);

        Person person3 = new Person("Qian", "Wang", "water", "blue", "October", false);
        person3.setfavoriteBeverage("water");
        person3.setfavoriteColor("blue");
        person3.setbirthMonth("October");
        person3.sethavePets(false);
        students.add(person3);

        Person person4 = new Person("Diptika", "Devi", "tea", "Orange", "June", false);
        person4.setfavoriteBeverage("tea");
        person4.setfavoriteColor("Orange");
        person4.setbirthMonth("June");
        person4.sethavePets(false);
        students.add(person4);

        Person person5 = new Person("Ian", "Gordon", "water", "green", "April", true);
        person5.setfavoriteBeverage("tea");
        person5.setfavoriteColor("green");
        person5.setbirthMonth("April");
        person5.sethavePets(true);
        students.add(person5);

        Person person6 = new Person("Tim", "Nguyen", "bubble tea", "white", "November", true);
        person6.setfavoriteBeverage("tea");
        person6.setfavoriteColor("white");
        person6.setbirthMonth("November");
        person6.sethavePets(true);
        students.add(person6);

        Person person7 = new Person("Bryan", "Smith", "water", "brown", "May", false);
        person7.setfavoriteBeverage("water");
        person7.setfavoriteColor("brown");
        person7.setbirthMonth("May");
        person7.sethavePets(false);
        students.add(person7);

        Person person8 = new Person("John", "Diehl", "coffee", "green", "February", true);
        person8.setfavoriteBeverage("coffee");
        person8.setfavoriteColor("green");
        person8.setbirthMonth("February");
        person8.sethavePets(true);
        students.add(person8);

        Person person9 = new Person("Jared", "Thacker", "water", "green", "December", true);
        person9.setfavoriteBeverage("water");
        person9.setfavoriteColor("green");
        person9.setbirthMonth("December");
        person9.sethavePets(true);
        students.add(person9);

        Person person10 = new Person("Robbie", "Niemeyer", "water", "blue", "January", false);
        person10.setfavoriteBeverage("water");
        person10.setfavoriteColor("blue");
        person10.setbirthMonth("January");
        person10.sethavePets(false);
        students.add(person10);

        Person person11 = new Person("Mohammed", "Naser", "Snapple", "green", "August", false);
        person11.setfavoriteBeverage("Snapple");
        person11.setfavoriteColor("green");
        person11.setbirthMonth("December");
        person11.sethavePets(false);
        students.add(person11);

        Person person13 = new Person("Josue", "Castro", "coffee", "blue", "June", true);
        person13.setfavoriteBeverage("coffee");
        person13.setfavoriteColor("blue");
        person13.setbirthMonth("June");
        person13.sethavePets(true);
        students.add(person13);

        Person person14 = new Person("Coreye", "Ross", "water", "black", "October", false);
        person14.setfavoriteBeverage("water");
        person14.setfavoriteColor("black");
        person14.setbirthMonth("October");
        person14.sethavePets(false);
        students.add(person14);

        Person person15 = new Person("Will", "Chapman", "water", "purple", "December", false);
        person15.setfavoriteBeverage("water");
        person15.setfavoriteColor("purple");
        person15.setbirthMonth("December");
        person15.sethavePets(false);
        students.add(person15);

        return students;
    }
}
