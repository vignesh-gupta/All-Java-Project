public class Hero implements GameStatus
{
    int life;
   
    public Hero(int life)
    {
        this.life=life;
    }
   
    public int getLife()
    {
        return life;
    }
   
    public void setLife(int life)
    {
        this.life=life;
    }
   
    public void status()
    {
   
        System.out.println("You have "+life+" lives left");
                   
        if (life==0)
        {
            System.out.println("You lose the GAME !!!");
        }
    life=life-1;
    }
   
}