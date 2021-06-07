public class Exception2{
    public static void main(String[] args)
    {
        System.out.println("By using default Constructor :-");
        try {
        int array[]=new int[5];
        array[0]=12;
        array[1]=22;
        array[2]=32;
        array[3]=42;
        array[4]=52;
        array[5]=62;
        }catch(Exception e)
        {
            System.out.println("");
            System.out.println(e);
            System.out.println("");
            System.out.println(e.getClass());
            System.out.println("");
            System.out.println(e.getMessage());
            System.out.println("");
            e.printStackTrace();
        }
        System.out.println("");
        System.out.println("By using parametrized String Constructor :-");
        try {
            throw new ArrayIndexOutOfBoundsException("Hi I'm ArrayIndexOutOfBoundsException ! ");
        }catch(ArrayIndexOutOfBoundsException aie)
        {
            System.out.println("");
            System.out.println(aie);
            System.out.println("");
            System.out.println(aie.getClass());
            System.out.println("");
            System.out.println(aie.getMessage());
            System.out.println("");
            aie.printStackTrace();
        }
        System.out.println("");
        System.out.println("By using parametrized Integer Constructor :-");
        try {
            throw new ArrayIndexOutOfBoundsException(20);
        }catch(ArrayIndexOutOfBoundsException aie)
        {
            System.out.println("");
            System.out.println(aie);
            System.out.println("");
            System.out.println(aie.getClass());
            System.out.println("");
            System.out.println(aie.getMessage());
            System.out.println("");
            aie.printStackTrace();
        }
    }
}