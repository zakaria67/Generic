package be.intecbrussel.duos;

public class DuoApp {
    public static void main(String[] args) {
        IntDuo euroAndCents = new IntDuo(50,80);
        System.out.println("I have "+ euroAndCents.getNumber1()+ "euros");
        System.out.println("I have "+ euroAndCents.getNumber2()+ "cents");

        Duo<Integer> euroAndCent = new Duo<>(50,80);
        System.out.println("I have "+euroAndCent.getElement1() + "euros");
        System.out.println("I have "+euroAndCent.getElement2() + "cents");

        Duo<String> synonym = new Duo<>("Happy", "Joyful");
        System.out.println(synonym.getElement1()+ " means ..." +synonym.getElement2());


        DifferntDuo<Integer, String> numbers = new DifferntDuo<>(20,"Twenty");
        System.out.println(numbers.getElement1()+ " = " +numbers.getElement2());

    }
}
