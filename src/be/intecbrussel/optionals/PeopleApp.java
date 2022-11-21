package be.intecbrussel.optionals;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class PeopleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("who do you want to find?");
        String name = scanner.nextLine();

        PersonRepository pr = new PersonRepository();
        Optional<Personn> optionalPersonn = pr.findByName(name);

        if (optionalPersonn.isPresent()) {
            Personn personn = optionalPersonn.get();
            System.out.println("The age of " + name + " is " + personn.getAge());
            //System.out.println(personn);
        }else {
            System.out.println("Person "+ name+ " is not found");
        }
        ArrayList<Personn> peoples= new ArrayList<>();
    }
}
