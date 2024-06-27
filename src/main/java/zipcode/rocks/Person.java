package zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;
    private String favoriteBeverage;
    private String favoriteColor;
    private String birthMonth;
    private boolean havePets;


    public Person(String fname, String lname, String beverage, String color, String birthMonth, boolean pets) {
        this.firstname = fname;
        this.lastname = lname;
        this.favoriteBeverage = beverage;
        this.favoriteColor = color;
        this.birthMonth = birthMonth;
        this.havePets = pets;
    }


    public String getfirstname() {
        return firstname;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getlastname() {
        return lastname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    public String getfavoriteBeverage() {
        return favoriteBeverage;
    }

    public void setfavoriteBeverage(String favoriteBeverage) {
        this.favoriteBeverage = favoriteBeverage;
    }

//    public String toString() {
//        return this.firstname + "'s favorite beverage is " + this.favoriteBeverage + ".";
//    }

    public String getfavoriteColor() {
        return favoriteColor;
    }

    public void setfavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

//    public String toString() {
//        return this.firstname + "'s favorite color is " + this.favoriteColor + ".";
//    }

    public String getbirthMonth() {
            return birthMonth;
    }

    public void setbirthMonth (String birthMonth){
            this.birthMonth = birthMonth;
    }

//    public String toString () {
//            return this.firstname + " was born in " + this.birthMonth + ".";
//    }

    public boolean gethavePets () {
            return havePets;
    }

    public void sethavePets ( boolean havePets){
            this.havePets = havePets;
    }

    public String toString() {
        return this.lastname + ", " + this.firstname + ". Their favorite beverage is " +
                this.favoriteBeverage + "." + " Their favorite color is " + this.favoriteColor +
                ". They were born in " + this.birthMonth + "." + " It is " + this.havePets + " that they have pets.";

//        public String toString () {
//        if (this.havePets == true);
//            return this.firstname + " has a pet/pets.";
//        else
//            return this.firstname + " does not have any pets.";  --> Attempt to
        }
    }
