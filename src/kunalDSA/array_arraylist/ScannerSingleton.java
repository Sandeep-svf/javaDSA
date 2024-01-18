package kunalDSA.array_arraylist;

import java.util.Scanner;

public class ScannerSingleton {
    private static Scanner scannerInstance;

    // Private constructor to prevent instantiation from outside the class
    private ScannerSingleton() {
        // Initialize the scanner as needed
        scannerInstance = new Scanner(System.in);
    }

    // Public method to get the singleton instance
    public static Scanner getInstance() {
        if (scannerInstance == null) {
            synchronized (ScannerSingleton.class) {
                if (scannerInstance == null) {
                    new ScannerSingleton(); // Create the instance
                }
            }
        }
        return scannerInstance;
    }
}
