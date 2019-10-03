
class BasicSingleton{

    private static BasicSingleton _instance;

    private BasicSingleton(){
        _instance = new BasicSingleton();
    }

    public static BasicSingleton getInstance(){
        return _instance;
    }

}

public class BeingZeroSingleton{

    public static void main(String args[]){
        BasicSingleton first = BasicSingleton.getInstance();
        BasicSingleton second = BasicSingleton.getInstance();

        if(first==second){
            System.out.println("Same Objects");
        }
        else{
            System.out.println("Different Objects");

        }
    }

}
