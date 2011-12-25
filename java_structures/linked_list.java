public class linked_list {
    
    list_node head;
    private int size;

    public linked_list() {
	head = null;
	size = 0;
    }

    public int insert(list_node head, String key_in, int data_in) {
	if (contains(head, key_in, data_in) == 0) {
	    return 0;
	    // contains will do the updating work
	} else {
	    list_node curr = head;
	    list_node to_add = new list_node();
	    to_add.key = key_in;
	    to_add.data = data_in;

	    if (curr == null) {
		head = to_add;
		to_add.next = null;
	    } else {
		if (strcmp(head.key, key_in) >= 0) {
		    head = to_add;
		    to_add.next = curr;
		}
		list_node prev = curr;
		curr = curr.next;
		while (curr != null) {
		    if (strcmp(curr.key, key_in) >= 0) {
			prev.next = to_add;
			to_add.next = curr;
		    }
		}
		// got to end of list
		insert(curr, key_in, data_in);
	    } 
	}
    }

    public int size(list_node head) {
	int ret_size = 0;
	list_node curr = head;
	while (curr != null) {
	    curr = curr.next;
	    ret_size++;
	}
	return ret_size;
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
	System.out.println("EOL");
    }
    
    public static int contains(list_node head_in, String key_in, int data_in) {
	list_node curr = head_in;
	while (curr != null) {
	    if (strcmp(curr.key, key) == 0) {
		curr.data = data_in;
		return 0;
	    }
	}
    }
    
    private class list_node {
	String key;
	int data;
	list_node next;
    }

    public static void main(String[] args) {
	linked_list test = new linked_list();
	print_list(test);
	list.insert(list.head, "Apple", 6);
	print_list(test);
    }
}