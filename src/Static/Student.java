package Static;

public class Student {
    private  String name ;
    private  int age;
    private int id;
    static  String room;
    static  int Counter;
    Student(){Counter++;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++Counter;
    }
}
