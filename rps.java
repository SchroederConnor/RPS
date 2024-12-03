public class rps
{
    public String theGame()
    {
        double num = Math.random();
        if(num <= 0.05)
        {
            return "scissors";
        }
        else if(num > 0.05 && num <= 0.25)
        {
            return "paper";
        }
        else
        {
            return "rock";
        }
    }

    
}