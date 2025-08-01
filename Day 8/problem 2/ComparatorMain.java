import java.util.*;
class Student {
       String name;
       int marks;
       
       Student (String name, int marks){
        this.name = name;
        this.marks = marks;
       }

       public String toString(){
          return name + " - " + marks;
       }
}

class MarksComparator  implements Comparator<Student>{

    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.marks, s2.marks);
    }
}

class NameComparator implements Comparator <Student>{
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorMain {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Murali", 95));
        students.add(new Student("Arun", 92));
        students.add(new Student("Deepak", 78));
        students.add(new Student("Karthik", 92));

        System.out.println("Original List:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting by marks
        Collections.sort(students, new MarksComparator());
        System.out.println("\nSorted by Marks:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting by name
        Collections.sort(students, new NameComparator());
        System.out.println("\nSorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
