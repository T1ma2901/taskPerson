
public class Person {
    String fillName;
    int age;

    public Person() {
    }

    public Person(String fillName, int age) {
        this.fillName = fillName;
        this.age = age;
    }

    public String getFillName() {
        return fillName;
    }

    public void setFillName(String fillName) {
        this.fillName = fillName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void move(){
        System.out.println(fillName+" двигается!");
    }
    public void talk(){
        System.out.println(fillName+" говорит!");
    }
}
