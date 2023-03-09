package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Q {

    public static void Rearranege(Queue< Integer> q) {
        for (int i = 0; i < q.size(); i++) {
            int ind = findEven(q.size() - i - 1, q);  // بكل مرة رح اصير اضيف الايفن ورا فعشان مرجعش اوخد نفس الايفن ببطل لازم امشي للمنطقة الي ضفت عليها  يعني نفس فكرة لما كنا نعمل سورت بصير عنا منطقة مرتبة ورا بلزمش امشي عليها 
            if (ind != -1) { //  معناها لقيت ايفن ضمن هاد الرينج
                addEven(ind, q); //  ضيف هاد الايفن عالكيو من ورا
            } else { //  مضلش ولا ايفن
                // بالنهاية بعد البرنامج رح تصفي معي كيو فيها  الايفن من ورا والاود من قدام فعملت وايل عشان انقل الاود الي قدام ورا 

                while (q.element() % 2 == 1) { //  لاني حطيت كل الايفن ورا فالاود ضلو قدام عشان انقلهم ورا بقول طالما اود انقل ورا 
                    q.add(q.remove());
                }
                // اضافة مني عشان التاكد من الاوتبوت 
                while (!q.isEmpty()) {
                    System.out.println(q.remove());
                }
            }
        }
    }

    private static int findEven(int k, Queue<Integer> q) {
        int n = q.size();
        int ind = -1;
        for (int i = 0; i < n; i++) {
            if (q.element() % 2 == 0 && i <= k) { //   طالما انا ايفن وضمن هاد الرينج  بدي اوخد اندكسه عدلت هون بالشرط وعندي غلط بالبريك 
                ind = i;
            }
            q.add(q.remove()); //  احذف وضيف ورا ومشيت للسايز كله عشان ترجع الكيو زي قبل
        }
        return ind;
        //  لو الاندكس رجع ب  بسالب واحد معناها ملقيتش ولا ايفن اما لو رجع باندكس مش سالب واحد رح تتم اضافته عالكيو من ورا 

    }

    private static void addEven(int ind, Queue< Integer> q) {
        int n = q.size();
        int num = 0;
        for (int i = 0; i < n; i++) {
            if (i == ind) { //  رح امشي ادور على الرقم الي بهاد الاندكس واوخد قيمته عشان اضيفه ورا
                num = q.element();
                q.remove(); // لو لقيت الرقم الي بالاندكس هاد بدي اوخد قيمته واحذفه

            } else {
                q.add(q.remove()); // غير هيك بدي احذف واضيف ورا بالنهاية رح ترجع الكيو زي ما كانت قبل بس بدون الرقم الايغن الي بال   اندكس
            }
        }
        q.add(num); //  اخر اشي بعد ما يخلص الفنكشن رح اضيف هاد الرقم الايفن من ورا 

    }

    public static void main(String[] args) {
        BST b = new BST();
        b.add(2);
        b.add(1);
        System.out.println(Math.log(8));
        b.add(3);
        // b.Preorder();
        //  b.Preorder();
         b.Inorder();
        b.update(1, 0);
        b.update(3, 1);
        System.out.println("------------------");
         b.Inorder();
        // b.Preorder();
    }
}
