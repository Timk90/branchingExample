public class ClassUsingInterface {

    private final Event event;

    public ClassUsingInterface(Event event){
        this.event = event;
    }

    public void callEvent(MyLambdaInterface myLambdaInterface){
        myLambdaInterface.oneMethod(event);
        if(event instanceof SuperEvent){
            System.out.println("Hello my SuperEvent");
        }
    }


}
