import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MyGenericClass <Integer, Integer> myInt = new MyGenericClass<>(1,2);
        MyGenericClass <Double, Double> myDouble = new MyGenericClass<>(3.14,2.167);
        MyGenericClass <Character, Character> myChar = new MyGenericClass<>('@','G');
        MyGenericClass <String, Character> myString = new MyGenericClass<>("Hello", 'F');

        ArrayList<String> myFriends = new ArrayList<>();

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());


    }
}