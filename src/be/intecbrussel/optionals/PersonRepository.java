package be.intecbrussel.optionals;

import java.util.Optional;

public class PersonRepository {
    private Personn [] people;

    public PersonRepository() {
        people = new Personn[5];
        people[0]= new Personn("Jean",12);
        people[1]= new Personn("Bob",16);
        people[2]= new Personn("Kadir",35);
        people[3]= new Personn("Avi",23);
        people[4]= new Personn("Zakaria",25);

    }
    public Optional<Personn>  findByName (String name){
        for (Personn personn : people){
            if (personn.getName().equalsIgnoreCase(name)){
                return Optional.of(personn);
            }
        }
        return Optional.empty();
    }

}
