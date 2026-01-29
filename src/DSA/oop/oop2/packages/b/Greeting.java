package DSA.oop.oop2.packages.b;

import static DSA.oop.oop2.packages.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        message();

        ///  how java determine where to look for message()
        /*
        by default java runtime will look in the system which use the current working directory...

        * */

    }

    // if we try to create Greeting class inside same folder packages it will not create
    // Unable to parse template "Class"
    //Error message: File '/Users/sandeepmaurya/Documents/javaDSA/src/DSA/oop/oop2/packages/Greeting.java' already exists.

    //  for create same class name inside folder packages we need another packages...
    // basically packages create compartments / filder for your classes.

    // created package a and inside that same class name Greeting.
    // used for Naming... and visibility and stuff like use cases.

    // package DSA.oop.oop2.packages; convenstion is company url in opposite direction.
    // mention where this file lies. we have to specify this.



}
