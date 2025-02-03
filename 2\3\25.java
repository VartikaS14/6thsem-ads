import java.util.*;
class Student {
    public void qualifications() {
        System.out.println("hello qualiy");
    }

    public void details() {
        System.out.println("hello details");
    }
}
class Main{
    public static void main(String[] args) {
        Student s = new Student();
        ArrayList<Integer> as=new ArrayList<>();
        as.add(14);
        System.out.println("array list"+as.get(0));
        s.qualifications();
        s.details();
    }
}

