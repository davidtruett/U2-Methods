public class StringExamples {
    public static void main(String[] args) {
        String name = "hephaestus";
        String greeting = "Hello!";

        //Style 1
        int stringSize = name.length();
        System.out.println(name + " has " + stringSize + " letters.");

        //Style 2
        System.out.println(name + " has " + name.length() + " letters.");

        System.out.println(greeting + " has " + greeting.length() + " letters.");

        //Create a program that capitalizes the first letter of a name
        //Attempt 1

        /*

        Plan
        1. Get input
        2. isolate first letter
        3. capitalize first letter
        4. isolate the other letters
        5. put 3 & 4 together
        6  return results

         */

        System.out.println(capFirst(name));
    }
    public static String capFirst(String name){
        String letter = name.substring(0,1);
        letter = letter.toUpperCase();
        return letter + name.substring(1);
    }
}
