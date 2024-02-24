package creationalPatterns.singleton;

public class SingletonExampleClass {
    private static SingletonExampleClass singletonExampleClass;

    protected SingletonExampleClass() {
    }

    // Method to create the instance. Will only be called once when the getSingletonExampleClass (getInstance)
    // method is called for the first time.
    // Synchronised keyword is used to make sure only one instance is created between multiple threads.
    private synchronized static void createSingletonExampleClass() {
        if (singletonExampleClass == null)
            singletonExampleClass = new SingletonExampleClass();
    }

    // Method to get the instance of the Singleton class.
    public static SingletonExampleClass getSingletonExampleClass() {
        if (singletonExampleClass == null) createSingletonExampleClass();
        return singletonExampleClass;

    }

    // Example method to be used when the instance is called. Usually singleton pattern is used for database
    // access objects and factory classes thread pools and the like where it is essential to have a single and
    // globally accessible instance of the object for better resource management, logging, caching and state
    // management.
    public void print() {
        System.out.println("Instance of the singleton class has been used to print this line.");
    }
}
