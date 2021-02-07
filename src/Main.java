
public class Main {
    //Note: lower case 'main'
    public static void main(String[] args){

        System.out.println("Calling the getInstance method of the Spooler class for the first time\n");
        Spooler spoolerObj = Spooler.getInstance();

        System.out.println("Calling the getInstance method of the Spooler class for the second time\n");
        Spooler spooler2 = Spooler.getInstance();
    }
}
