public class BranchingMain {
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("World! From Branch #1");
        System.out.println("It has been slightly changed...");
        System.out.println("World...from the second branch...");
        System.out.println(new SecondClass("Name"));
        System.out.println("one more line in master");

        System.out.println("one more line from third branch");
    }
}
