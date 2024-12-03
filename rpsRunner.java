public class rpsRunner 
{
    public static void main (String [] args)
    {
        rps rps = new rps();
        String move = rps.theGame();
        System.out.println(move);
    }
}
