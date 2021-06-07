public class Villain implements GameStatus
{
    int damage;
   
    public Villain(int damage)
    {
        this.damage=damage;
    }
    public int getDamage()
    {
        return damage;
    }
    public void setDamage(int damage)
    {
        this.damage=damage;
    }
   
    public void status()
    {
        System.out.println("The Villain Damage level is :"+getDamage());
       
        if (damage==100)
        {
        System.out.println("----GAME OVER----\nYOU WINS!!!");
        }
        damage=damage+50;
    }
}