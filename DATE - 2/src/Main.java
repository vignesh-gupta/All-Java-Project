import java.util.*;
import java.text.*;
public class Main {

 

    public static void main(String [] args)throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yyyy = sc.nextInt();
        dd = Integer.rotateRight(dd, 2);
        mm = Integer.rotateRight(mm, 2);
        yyyy = Integer.rotateRight(yyyy, 2);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy/M/d");
        String date= "" + yyyy + "/" + mm +"/" + dd;
        Date d= sf.parse(date);
        System.out.println(sf.format(d));
        sc.close();
    }
}