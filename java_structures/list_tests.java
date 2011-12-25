import linked_list.java;
import org.junit;
import java.lang.string;

public class list_tests extends TestCase {

    public void test_insert() {
	
    }

    public static void print_list(list_node head) {
	list_node curr = head;
	while (curr != null) {
	    int cnt = 0;
	    System.out.println("Node " + cnt);
	    System.out.print("Key: " + curr.key + " ");
	    System.out.println("Data: " + curr.data);
	    curr = curr.next;
	}
    }

    public static void main(String[] args) {
	linked_list test = new linked_list();
	
	list.insert(list.head, "Apple", 6);
    }
}