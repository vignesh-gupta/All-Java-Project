import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        int heroCount = 4;
        int villainCount = 50;
      
        Scanner scan = new Scanner(System.in);
      
        Hero hero = new Hero(4);
        hero.setLife(4);
        Villain villain = new Villain(50);
        villain.setDamage(50);
      
        while (heroCount>=0 && villainCount<=100)
        {
            System.out.println("Enter who punches :\n1.Hero\n2.Villain");
            int n= scan.nextInt();
          
            switch(n)
            {
                case 1:
                    villain.status();
                    villainCount = villain.getDamage();
                    if(villainCount==100)
                        break;
                    break;
               
                case 2:
                    hero.status();
                    heroCount = hero.getLife();
                    if(heroCount==0)
                    {
                        break;
                    }
                    break;
                   
                default :
                    System.out.println("Invalid Input");
            }
              
        }
        
        scan.close();
      
    }
}