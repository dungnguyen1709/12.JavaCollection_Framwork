package phan_biet_hashmap_hashset;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student("Nam",20, "HN");
//        Student student2 = new Student("Hung",21, "HN");
//        Student student3 = new Student("Ha",22, "HN");
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,new Student("nam",23,"hanoi"));
        studentMap.put(2,new Student("huy",25,"nghean"));
        studentMap.put(3,new Student("quan",25,"hoabinh"));
        studentMap.put(4,new Student("dung",23,"haiduong"));

        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<>();
        students.add(new Student("nam",23,"hanoi"));
        students.add(new Student("huy",25,"nghean"));
        students.add(new Student("quan",25,"hoabinh"));
        students.add(new Student("dung",23,"haiduong"));
//
//        for(Student student : students){
//            System.out.println(student.toString());
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
