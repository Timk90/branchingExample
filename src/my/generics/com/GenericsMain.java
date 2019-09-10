package my.generics.com;

import java.sql.SQLOutput;

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
        
        System.out.println("I am gonna add here some comments in bransh 5");

        System.out.println("I still want to add something");

        System.out.println("Hello from b 4");
        System.out.println("Hello 2d time from b 4");

        System.out.println("new commit from four");

        System.out.println("Hello from branch 5");
        System.out.println("Hello 2 from branch 5");

        System.out.println("Hi 5");
    }


}
