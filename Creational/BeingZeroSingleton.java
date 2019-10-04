
class BasicSingleton{

    private static BasicSingleton _instance = new BasicSingleton();

    private BasicSingleton(){
        //_instance = new BasicSingleton();
    }

    public static BasicSingleton getInstance(){
        return _instance;
    }

}


class LazySingleton{

    private static LazySingleton _instance;

    private LazySingleton(){
    }

    public static LazySingleton getInstance(){
        if(_instance==null)
            _instance = new LazySingleton();
        return _instance;
    }

}

class ThreadSafeSingleton{

    private static ThreadSafeSingleton _instance;

    private ThreadSafeSingleton(){
        if(_instance!=null)
            throw new RuntimeException("Use getInstance() method to instantiate");
    }

    public static ThreadSafeSingleton getInstance(){
        if(_instance==null){
            synchronized(ThreadSafeSingleton.class){
                if(_instance==null)
                    _instance = new ThreadSafeSingleton();
            }
        }
        return _instance;
    }

}

// javac BeingZeroSingleton.java
// java -ea BeingZeroSingleton
// java –enableassertions BeingZeroSingleton
// https://www.geeksforgeeks.org/assertions-in-java

public class BeingZeroSingleton{

    public static void main(String args[]){
        BasicSingleton bfirst = BasicSingleton.getInstance();
        BasicSingleton bsecond = BasicSingleton.getInstance();
        assert (bfirst==bsecond);


        LazySingleton lfirst = LazySingleton.getInstance();
        LazySingleton lsecond = LazySingleton.getInstance();
        assert (lfirst==lsecond);

        ThreadSafeSingleton tsfirst = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton tssecond = ThreadSafeSingleton.getInstance();
        assert (tsfirst==tssecond);

    }

}
