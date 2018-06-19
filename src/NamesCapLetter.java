import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NamesCapLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Phil", "Anny", "Aaron", "Bob"));
        char capLetter;
        System.out.println("Enter begining letter:");
        capLetter= sc.next().charAt(0);
        System.out.println(namesWithStartLetter(names,capLetter));

    }
    public static ArrayList<String> namesWithStartLetter(ArrayList<String> names, char startLetter) {
        ArrayList<String> namesWithCapLetter = new ArrayList<>();
        for (String namelist: names) {
            if (startLetter==namelist.charAt(0))
                namesWithCapLetter.add(namelist);
        }
        return namesWithCapLetter;
    }
}
