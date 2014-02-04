import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

class Person {
    String myName;
    int myAge;
    public void SetName(String name) {
        myName = name;
    }
    public String GetName() {
        return myName;
    }
    public void SetAge(int age) {
        myAge = age;
    }
    public int GetAge() {
        return myAge;
    }
}
