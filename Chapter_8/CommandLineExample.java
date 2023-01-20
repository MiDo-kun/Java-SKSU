package Chapter_8;
public class CommandLineExample {
    public static void main(String[] args) {
        int firstArg = 0;
        if (args.length != 0)
            firstArg = Integer.parseInt(args[0]);
        
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        
        System.out.println(firstArg);
    }
}