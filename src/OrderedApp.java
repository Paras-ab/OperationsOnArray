import java.util.Arrays;

public class OrderedApp {
    public static void main(String[] args){
        int maxSize = 100;
        OrdArray arr = new  OrdArray(maxSize);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);

        int searchkey = 55;
        if ( arr.find(searchkey)!=arr.size())
            System.out.println("Found " + searchkey);
        else
            System.out.println("cant find" + searchkey);

        arr.display();

        arr.delete(44);
        arr.delete(00);
        arr.delete(88);

        arr.display();

    }
}
