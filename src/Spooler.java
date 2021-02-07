/*
* This class is made using the Singleton design pattern
* Constructor must be private or protected
* Need a public method for object creation
* In this case, using a static boolean variable the class can check the number of its instances
* static variables are shared by class instances in this case, 1 instance
* Error messages
* */
public class Spooler {

    //this static variable is used to see if a Spooler instance can been created already or not
    private static boolean oneInstance = false;

    //The actual Spooler is private too
    //needs to be static because it belongs to the class and not an instance
    private static Spooler theSpooler;

    //private constructor so that user can't instantiate on their own
    private Spooler(){
        System.out.println("I'm a spooler");
    }

    /*
    * Creates a Spooler if one does not already exist
    * If a Spooler already exits, write an error to the console
    * returns a static object
    * */
    public static Spooler getInstance(){

        if(!oneInstance){
            theSpooler = new Spooler();
            System.out.println("Got 1 Spooler");
            oneInstance = true;
        }
        else{
            System.out.println("Can't get second spooler");
        }
        return theSpooler;
    }


}
