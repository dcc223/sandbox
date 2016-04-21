package caccia.david.sandbox01;

/**
 * Created by abe on 4/21/2016.
 */
public class HelloWorld {

    private static String firstMessage = "Hello world.";
    public static void main(String[] args)
    {
        HelloWorld helloWorld =  new HelloWorld();
        helloWorld.givesMessage(firstMessage);
    }

     void givesMessage(String firstMessage) {
        System.out.println(firstMessage);
    }


}
