/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

import java.util.Comparator;

/**
 *
 * @author User
 */
public class SortStdByComprator extends Student implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s = (Student) (o1);
        Student s2 = (Student) (o2);

        return (s.age - s2.age);
    }

}
