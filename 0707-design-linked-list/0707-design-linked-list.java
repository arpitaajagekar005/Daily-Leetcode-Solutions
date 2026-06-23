class MyLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    private Node head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
        
    }
    
    public int get(int index) {
        if(index < 0 || index >= size){
            return -1;
        }
        Node cur = head;
        for(int i = 0; i < index; i++){
            cur = cur.next;
        }
        
        return cur.data;

    }
    
    public void addAtHead(int val) {
        Node newnode = new Node(val);
        newnode.next=head;
        head = newnode;
        size++;

    }
    
    public void addAtTail(int val) {
        
        if(head == null){
            addAtHead(val);
        }else{
            Node newnode = new Node(val);
            Node cur = head;

            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = newnode;
            size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size){
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }

        Node cur = head;
        for(int i = 0; i < index - 1; i++){
            cur = cur.next;
        }
        Node newnode = new Node(val);
        newnode.next = cur.next;
        cur.next = newnode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size){
            return;
        }
        if(index == 0){
            head = head.next;
            size--;
            return;
        }
        Node cur = head;
        for(int i = 0; i < index - 1; i++){
            cur = cur.next;
        }
        Node temp = cur.next;
        cur.next = temp.next;
        size--;

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */