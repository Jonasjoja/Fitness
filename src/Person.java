public class Person {

    public String name;
    public String cpr;

    public Person() {

    }

    public Person(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }
}




