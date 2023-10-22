public class Main {
    public static void main(String[] args) { //main running class
        Java java = new AdapterPhpToJava(); //create new object for adapter
        java.javaCreate(); //calling java method which replace with php method
        java.javaRead(); //calling java method which replace with php method
        java.javaUpdate(); //calling java method which replace with php method
        java.javaDelete(); //calling java method which replace with php method
    }
}