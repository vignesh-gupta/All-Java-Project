import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a integer :");
        Integer n = Integer.parseInt(br.readLine());
        System.out.println("Enter a string :");
        String n2 = br.readLine();
        Item<Integer> it1 = new  Item<Integer>();

        it1.set(n);
        Item<String> it2 = new  Item<String>();
        it2.set(n2);
        System.out.println("Integer Value :"+it1.get());
        System.out.println("String Value :"+it2.get());
    }
}