public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private String dateOfBirth;
    private Address address;


    Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Person(int id, String firstName, String lastName, Gender gender, String dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    Person(int id, String firstName, String lastName, Gender gender, String dateOfBirth, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }


    public void printPersonData() {
        System.out.println("Id: " + id);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);

        if (address != null) {
            address.printAddress();
        }
        System.out.println("Gender: " + gender);
        System.out.println("Date Of Birth: " + dateOfBirth);
    }

    public int getId() {
        return id;
    }

}
