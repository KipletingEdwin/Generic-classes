import java.util.ArrayList;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //bounded types = you can create the objects of a generic class to have data
        //                of specific derived types e.g Number

        MyGenericClass <Integer, Integer> myInt = new MyGenericClass<>(1,2);
        MyGenericClass <Double, Double> myDouble = new MyGenericClass<>(3.14,2.167);
        MyGenericClass <Character, Character> myChar = new MyGenericClass<>('@','G');
        MyGenericClass <String, Character> myString = new MyGenericClass<>("Hello", 'F');

        ArrayList<String> myFriends = new ArrayList<>();
        HashMap<Integer, String> users = new HashMap<>();

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());


    }
}