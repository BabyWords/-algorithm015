package DequeRefactor;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 用 add first 或 add last 这套新的 API 改写 Deque 的代码
 */
public class DequeTest {
    public  static void main(String[] args) {
        //Stack
        Deque<String> deque= new LinkedList<String>();
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");
        System.out.println(deque);
        String str =deque.peekFirst();
        System.out.println(str);
        System.out.println(deque);

        while (deque.size()>0){
            System.out.println(deque.removeFirst());
        }
        System.out.println(deque);

        //Queue
        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");
        System.out.println(deque);

        String peek = deque.peekFirst();
        System.out.println(peek);
        System.out.println(deque);

        while (deque.size() > 0) {
            System.out.println(deque.pollFirst());
        }

        System.out.println(deque);


    }
}
