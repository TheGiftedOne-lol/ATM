


public class rand{
    static long accnum;
    public static long random(){
    accnum = (long)(Math.random() * 9_000_000_000L) + 1_000_000_000L;
    return accnum;
    }
}