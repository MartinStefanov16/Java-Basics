package L10_NestedLoops_Exercise;

public class test {
    public static void main(String[] args) {


        int number = 100; // initial number
        String firstStep = String.valueOf(number); // converting it to string, so that charAt can be used
       // char secondStep = firstStep.charAt(0); // gets the char at position 0, which is '1'
       // String thirdStep = String.valueOf(secondStep); // converts the char to String, so that it can be then converted to int
        int forthStep = Integer.parseInt(String.valueOf(firstStep.charAt(0))); // converting String to Int

        System.out.println(forthStep);












    }
}
