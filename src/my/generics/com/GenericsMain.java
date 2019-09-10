package my.generics.com;

public class GenericsMain {
    public static void main(String[] args) {
        NonGen intObj = new NonGen(132);
        NonGen strObj = new NonGen("Hello!");

        String str  = (String)strObj.getObj();
        int number = (int)intObj.getObj();

        //str = number;
        intObj = strObj;
        //int number2  = (int)intObj.getObj(); //classCastException

        Gen0<Integer> intObgGen = new Gen0<>(12);
        Gen0<String> strObgGen = new Gen0<>("123123");

        //intObgGen = strObgGen; - not it is forbidden

        //не надо кастовать
        int number1 = intObgGen.getT();
        String str1 = strObgGen.getT();

        System.out.println("I am gonna add here String in brancj 4");

        String cat = "I am cat 1";

    }


}
