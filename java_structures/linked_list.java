public class linked_list {
    
    list_node head;
    private int size;

    public linked_list() {
	head = null;
	size = 0;
    }

    public int insert(list_node head, String key_in, int data_in) {
	if (contains(head, key_in) == 0) {
	    return 0;
	    // contains will do the updating work
	} else {
	    list_node curr = head;
	    list_node to_add = new list_node();
	    to_add.key = key_in;
	    to_add.data = data_in;

	    if (curr == null) {
		curr = temp;
		to_add.next = null;
	    } else {
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
    
    private class list_node {
	String key;
	int data;
	list_node next;
    }
}