public class AdapterPhpToJava extends PhpApplication implements Java{ //adapter for convert php code to java

    @Override //overiding java method from java interfcae
    public void javaCreate() {
        phpCreate(); //replacing method in java to php
    }

    @Override //overiding java method from java interfcae
    public void javaRead() {
        phpRead(); //replacing method in java to php
    }

    @Override //overiding java method from java interfcae
    public void javaUpdate() {
        phpUpdate(); //replacing method in java to php
    }

    @Override //overiding java method from java interfcae
    public void javaDelete() {
        phpDelete(); //replacing method in java to php
    }
}
