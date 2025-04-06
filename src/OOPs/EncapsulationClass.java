package OOPs;

class Person{
     private String firstName ;
     private String lastName ;

    // Getters and setters method 
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}

public class EncapsulationClass {
    public static void main(String[] args) {
        Person p = new Person() ;

        p.setFirstName("Shubham");
        p.setLastName("haldkar");

        System.out.println("First name : " + p.getFirstName() );
        System.out.println("Last name : " + p.getLastName() );
    }
}
