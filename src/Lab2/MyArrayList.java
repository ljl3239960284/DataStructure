package Lab2;

public class MyArrayList {
    private Student list[];
    private int INIT_SIZE = 5;
    private int MAX_SIZE = 5;
    private int CURRENT_SIZE = 0;

    public MyArrayList() {
        list = new Student[INIT_SIZE];
    }
    public void add(Student student){
        list[CURRENT_SIZE++] = student;
    }
    public Student get(int index) {
        return list[index];
    }
}
