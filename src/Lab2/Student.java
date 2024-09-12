package Lab2;

public class Student {

    private String name;
    private String id;


    public Student(String name,String id){
        this.name = name;
        this.id = id;
    }

    public String toSring(){
        return"Student:" + id + "," +"name";
    }

}
