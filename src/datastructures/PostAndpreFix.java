package datastructures;

import java.util.Scanner;
import java.util.Stack;

public class PostAndpreFix {

    public static int prec(Character ch) {

        switch (ch) {
            case '+':
            case '-':

                return 1;
            case '*':
            case '/':

                return 2;
            case '^':

                return 3;

            default:
                return -1;

        }
    }

    public static void PosfFix(String s) {

        String ans = "";
        Stack< Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) { // + - * / ^ ...   a ...  () 

            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                ans += c;
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {

                while (!st.empty() && st.peek() != '(') {
                    ans = ans + (st.pop());
                }

                st.pop();

            } else {

                while (!st.empty() && prec(c) <= prec(st.peek())) {
                    ans += (st.pop());
                }

                st.push(c);

            }

        }
        while (!st.empty()) {
            ans += (st.pop());

        }

        System.out.println(ans);

    }

    public static void PreFix(String s) {

        String ans = "";
        Stack< Character> st = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) { // + - * / ^ ...   a ...  () 

            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                ans += c;
            } else if (c == ')') {
                st.push(c);
            } else if (c == '(') {

                while (!st.empty() && st.peek() != ')') {
                    ans = ans + (st.pop());
                }

                st.pop();

            } else {

                while (!st.empty() && prec(c) < prec(st.peek())) {
                    ans += (st.pop());
                }

                st.push(c);

            }

        }
        while (!st.empty()) {
            ans += (st.pop());

        }

        String str = "";

        for (int i = ans.length() - 1; i >= 0; i--) {
            str += ans.charAt(i);
        }

        System.out.println(str);

    }

    public static void main(String[] args) {
// abcd^e-fgh*+^*+i-

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        PreFix(s);
        PosfFix(s);

    }
}
