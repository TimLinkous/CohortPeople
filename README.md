# Cohort People

This lab gets you reading some code and then making modifications to working code to add a few features.

## First Thing

READ the code in the repo.
There are two class files, and one data file.

`Main.java` has some code that opens up a data text file, and reads it into an ArrayList of Person objects.
Then, the code loops thru the List a[FakeData.csv](src%2Fmain%2Fresources%2FFakeData.csv)nd prints out each person's name.

`Person.java` is a "plain old java object".
It is used to track information about each person.

In the `src/main/resources/` folder inside the project, you will find a text file called `FakeData.csv`.
In there is a list of (lastname, firstname) of a series of super heroes.

Right now, when you run the program in the Main class, it opens the file `FakeData.csv`, loads 
each line in the file into an object of class `Person`. 
That object is then added to an ArrayList (see below for what that is!)

Run the main program to see what it does.

## Thing to Add

I will slack you a file, with all the names of the people in this cohort.
You will change its name from `TenFiveZero.txt` to `TenFiveZero.csv` and put into the 
`src/main/resources/` folder.


You'll need to gather MORE data on the people in this cohort.
You need to add some things to the `Person` class.
Add the following information about _each_ person:

- favorite colors (yes, a String like "yellow")
- birth month (a String like "February")
- github handle (a String like "xt0fer")
- have pets  (does the person have any pets at home?)(this is a true or false)
- like pets  (does the person LIKE pets)(this is true of false)
- which hand do they write with? (a String like "right", "left" or "ambi")
- favorite beverage (a String like "coffee", "tea", "soda" ...)

_Pick four of these pieces of data. You do not need to do all seven._

You will need to add a new instance variable for each of these pieces of data that you will now
track about a person.
You should add `getters` and `setters` for each new instance variable.
You will change the `toString()` method to add all of the new instance variables. That way when you 
tell a particular `Person` object to give you a String representing the `state` if the object,
your method adds all those details about the person in question.

Get a sheet of paper, and go around and gather all the extra data you need from your cohort.
Once you have gathered all the data on all your cohort mates,
you will write a big long method called 'handWrittenLoadOfData()' which will look something like this:

```java
// this goes in class Main.java

class Main {
    
    // copy from here...
    private List handWrittenLoadOfData() {
        ArrayList<Person> students = new ArrayList<>();

        Person newPerson = new Person("Margaret", "Hamilton");
        newPerson.setGithubHandle("apollo_momma");
        newPerson.setFavoriteColor("gray");
        newPerson.setBirthMonth("August");
        newPerson.setFavoriteBeverage("coffee");
        record.add(newPerson);

        Person newPerson = new Person("Grace", "Murray Hopper");
        newPerson.setGithubHandle("AdmiralCOBOL");
        newPerson.setFavoriteColor("navy blue");
        newPerson.setBirthMonth("December");
        newPerson.setFavoriteBeverage("green tea");
        record.add(newPerson);

        // and so on for EACH person in the cohort.

        return students;
    }
    //...to here. Paste below the `getRecordFromLine()` method in Main.java
    
}
```

_And yes, this means you will have a block of code for each person in the cohort,
so you will learn how to be a bit lazy and copy and paste the block, changing the details on each one._

_It's okay, it's only 29 names._
Don't get fancy, just do the code.

Now you will need to change the `main` routine in the `Main` class.
Change

```java
List listOfStudents = programObject.loadCSVFile(student_source);
```

to 
```java
List listOfStudents = programObject.handWrittenLoadOfData();
```

and re-run the program. Does it print out the right stuff?


## What's an ArrayList?

An ArrayList in Java is a resizable array (but wait!, what's an `array`?? see below), which can be 
found in the java.util package. 
Unlike a traditional array that has a fixed length, ArrayLists can dynamically grow and 
shrink as you add or remove elements.

Here are some key points about ArrayList:

1. **Dynamic Size**: ArrayList can grow or shrink dynamically in your program, 
2. providing a more flexible way to handle your data.

3. **Ordering**: ArrayList maintains the insertion order, which means while 
4. displaying ArrayList elements, the result set would be having the same order in which the elements got inserted into the List.

5. **Access**: You can access any element directly by using the get method, 
6. which takes the index number as an argument.

7. **Manipulation**: ArrayList provides methods to manipulate the list, like adding, 
8. removing, or getting elements.

Here is a simple example of how to use an ArrayList:

```java
import java.util.ArrayList; // import the ArrayList class

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
    cars.add("Volvo"); // Add an item
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars); // Print the ArrayList
  }
}
```

In this example, we create an ArrayList named 'cars' and add four car names to it. 
Then we print out the entire ArrayList.

## What's an Array?

An array in Java is a fundamental data structure that allows you to store multiple values of the same type in a single variable.

Here are some key points about arrays in Java:

1. **Fixed Size**: Once an array is created, its size cannot be changed. 
2. You need to know the size of the array at the time of creation.

3. **Indexing**: Each stored value in an array is associated with a number, 
4. known as its index. Indexing starts from 0, meaning the first element is at index 0, 
5. the second element is at index 1, and so on.

6. **Access**: You can access any element in the array directly if you know its index.

7. **Type**: All elements in an array must be of the same type. 
8. For example, an array can hold all integers or all strings, but not a mix of integers and strings.

Here's a simple example of how to use an array in Java:

```java
public class Main {
  public static void main(String[] args) {
      String[] fruits = {"apple", "banana", "cherry"};  // Create an array
      String lastFruit = fruits[2];
      System.out.println(fruits[0]);  // Access the first element of the array
      System.out.println(lastFruit);
  }
}
```

In this example, we create an array named 'fruits' and add three fruit names to it. 
Then we print out the first fruit in the array, which is "apple".
The variable `lastFruit` would print "cherry".