import java.util.*;
public class Test {
    public static void main(String[] args) {
    	List<Integer> list = new ArrayList<>();
    	list.add(10);
    	list.add(50);
    	list.add(60);
    	list.add(30);
    	list.add(20);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);        
        Collections.reverse(list);
        System.out.println(list);
    }
}
