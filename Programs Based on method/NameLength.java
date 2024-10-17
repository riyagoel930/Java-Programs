public class NameLength{
    public static void nameLen(String fName, String lName) {
        int firstName= fName.length();
        int lastName = lName.length();

        if (firstName > lastName) {
            int sqr = firstName * firstName; 
            System.out.println("The square first name is: " + sqr);
        } else {
            int cube = lastName * lastName * lastName;
            System.out.println("The cube last name is: " + cube);
        }
    }

    public static void main(String[] args) {
        nameLen("Riya","Goyal"); 
        nameLen("Ritika","Garg");
    }
}


