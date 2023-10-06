package com.singleton;
public class CandyMaker {

    private boolean empty;
    private boolean boiled;

    // Singleton instance
    private static CandyMaker instance;

    // Private constructor to prevent instantiation outside of the class
    private CandyMaker() {
        empty = true;
        boiled = false;
    }

 
    public static synchronized CandyMaker getInstance() {
        if (instance == null) {
            instance = new CandyMaker();
        }
        return instance;
    }

    // Thread-safe fill method using synchronized
    public synchronized void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
          
        }
    }

    public synchronized boolean isEmpty() {
        return empty;
    }

    public synchronized boolean isBoiled() {
        return boiled;
    }

    
}
