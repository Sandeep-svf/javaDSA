package DSA.methods;

public class Shadowing {
    //Global class
    static int sponderdAccount = 90;
    // reason for adding static -> we can not use object dependent things in object independent things..
    public static void main(String[] args) {
        int sponderdAccount ;
        //System.out.println(sponderdAccount);  / give error... have to initialized first...
        sponderdAccount=900;// class variable sponderAccount is shadowed by this.
        // higher varibale scoped is shadowed by this variable inside main method...
        System.out.println(sponderdAccount);    //900
        greeting();
    }

    private static void greeting() {
        System.out.println(sponderdAccount);    //90
    }
}

