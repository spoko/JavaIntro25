package exceptionsdemo;

public class CookieMonsterException extends Exception {

    public CookieMonsterException(String message){
        super("Imagine that you have zero cookies and you split them evenly among zero friends. " +
                "How many cookies does each person get? " +
                "See? It doesn’t make sense. " +
                "And Cookie Monster is sad that there are no cookies, " +
                "and you are sad that you have no friends.");
    }
}
