
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Stack < Integer > s= new Stack <>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.toString());
     
        s.add(0, 0);
        System.out.println(s.toString());
    }
}
