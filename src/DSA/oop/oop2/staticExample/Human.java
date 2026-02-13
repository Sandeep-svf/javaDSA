package DSA.oop.oop2.staticExample;

public class Human {
    int age;
    String name;
    String behaviour;
    boolean marrie;
    static long population; // basically common to all the object

    static void message(){
        System.out.println("Hello world!");
        // System.out.println(this.name); // can not use it here... using non-static or without instance is created
        // in static method.


    }

    public Human(int age, String name, String behaviour, boolean marrie) {
        this.age = age;
        this.name = name;
        this.behaviour = behaviour;
        this.marrie = marrie;
        // this.population +=1; common to all human obj so no need to use this keywords here... use class name
        Human.population += 1;
        Human.message();
    }


}
