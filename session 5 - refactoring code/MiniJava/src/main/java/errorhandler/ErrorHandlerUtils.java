package errorhandler;

/**
 * Created by Alireza on 6/28/2015.
 */
public abstract class ErrorHandlerUtils {
    public static boolean hasError = false;

    public static void printError(String msg) {
        hasError = true;
        System.out.println(msg);
    }
}
