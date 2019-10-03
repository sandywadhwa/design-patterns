
class BasicSingleton{

    private static BasicSingleton _instance = new BasicSingleton();

    private BasicSingleton(){
        //_instance = new BasicSingleton();
    }

    public static BasicSingleton getInstance(){
        return _instance;
    }

}

// javac BeingZeroSingleton.java
// java -ea BeingZeroSingleton
// java –enableassertions BeingZeroSingleton
// https://www.geeksforgeeks.org/assertions-in-java

public class BeingZeroSingleton{

    public static void main(String args[]){
        BasicSingleton first = BasicSingleton.getInstance();
        BasicSingleton second = BasicSingleton.getInstance();

        assert (first==second);
    }

}
