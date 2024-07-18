class MyHashSet {

    ListNode head;

    class ListNode
    {
        int data;
        ListNode next;

        ListNode (int val)
        {
            this.data = val;
            this.next = null;
        }
    } 

    public MyHashSet() {
         head = null;
    }
    
    public void add(int key) {
        ListNode curr = head;
        ListNode newnode = new ListNode(key);
        if(contains(key))
        return;
        if(curr == null)
        {
            head = newnode;
        }else {
        while(curr !=null && curr.next != null)
        {
            curr =curr.next;
        }
        curr.next = newnode;
        }
    }
    
    public void remove(int key) {

        ListNode curr = head;
        ListNode prev = null;

        while(curr !=null)
        {
            if (head.data == key)
            {
                ListNode temp = head;
                head = head.next;
                temp.next = null;
                return;

            } else if (head.data == key && head.next == null)
            {
                head = null;
                return;
            }else
            {
            if(curr.data == key)
            {
            prev.next = curr.next;
            }
            prev = curr;
            curr = curr.next;
            }
        }
        
    }
    
    public boolean contains(int key) {
            ListNode curr = head;
        while(curr != null)
        {
            if(curr.data == key)
            return true;
            curr = curr.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */