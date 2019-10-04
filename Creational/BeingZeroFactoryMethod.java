import java.util.Calendar;
import java.util.List;

// javac BeingZeroFactoryMethod.java
// java -ea BeingZeroFactoryMethod
// java –enableassertions BeingZeroFactoryMethod
// https://www.geeksforgeeks.org/assertions-in-java
// Examples:  Calendar, NumberFormat in JAVA


/*
    Write a Website Generator, that can help us generate various types of websites - for now Blog or Shopping.
    Each website contains pages, Blog can have following types of pages - Post, Comment, Contact About.
    Shopping site can have following types of pages - Cart, Item, Search.
*/

abstract class Website{
    protected List<Page> pages = new ArrayList<>();

    public List<Page> getPages(){
        return this.pages();
    }

    public Website(){
        this.createWebsite();
    }

    public abstract void creaWebsite();
}

abstract class Page{

}
class ContactPage extends Page{

}
class CartPage extends Page{

}
class CommentPage extends Page{

}
class PostPage extends Page{

}
class SearchPage extends Page{

}
class AboutPage extends Page{

}
class ItemPage extends Page{

}

class Blog extends Website{
    @Override
    public void createWebsite(){
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}

class Shop extends Website{
    @Override
    public void createWebsite(){
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}

public class BeingZeroFactoryMethod{

    public static void main(String args[]){



    }

}
