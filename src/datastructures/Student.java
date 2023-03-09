

package datastructures;
public class Student implements Comparable {
    String name  ; 
    int age ; 
    int y;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", y=" + y + '}';
    }

   

    public Student(String name, int age, int y) {
        this.name = name;
        this.age = age;
        this.y = y;
    }

   

    @Override
    public int compareTo(Object o) {
        Student s = (Student)(o);
        
        
        return (this.y - s.y);
    }
    
    
}
