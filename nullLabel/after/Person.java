package nullLabel.after;

public class Person {

    private Label name;
    private Label mail;

    public Person(Label name, Label mail) {
        this.name = name;
        this.mail = mail;
    }

    public Person(Label name) {
        this(name, new NullLabel());
    }

    public void display(){

          name.display();
          mail.display();
    }

    @Override
    public String toString() {
        String result = "[ Person : name = "+ name +" mail = "+mail+" ]";
        return result;
    }
}
