
import java.util.*;

class Queue{
    ListNode front,rear;
    int length;
    class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Queue(){
        this.front = null;this.rear = null;
        length = 0;
    }
    boolean isEmpty(){
        return length == 0;
    }
    int length(){
        return length;
    }
    public boolean enqueue(int data){
        ListNode ln = new ListNode(data);
        if(this.isEmpty()){
            front = ln;
        }
        else{
            rear.next = ln;
        }
        rear = ln;
        length++;
        return true;
    }
    public boolean dequeue(){
        if(this.isEmpty()){
            System.out.println("No node is there !");
            return false;
        }
        else{
            length--;
            int num = front.data;
            System.out.println("Item deleted :"+num);
            if(front == rear)
            rear = null;
            front = front.next;
        }
        return true;
    }
    public void dispQueue(){
        ListNode temp = front;
        while(temp != rear){
            System.out.print(temp.data);
            if(temp.next != rear)
            System.out.print("->");
            temp = temp.next;
        }
        return;
    }
String [] genBinNums(int n){
    String [] res = new String [n];
    Queue<String> q = new Queue<> ();
    q.offer("1");
    for(int i=0;i<n;i++){
        res[i] = q.poll();
        String n1 = res[i] + "0";
        String n2 = res[i] + "1";
        q.offer(n1);
        q.offer(n2);
    }
    return res;
}
}
class checkValidParen{
    public boolean isValid(String c){
        Stack<Character> stk = new Stack<>();
        for(char ch : c.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stk.push(ch);
            }
            else{
                if(stk.isEmpty()){
                    return false;
                }
                else{
                    char ch1 = stk.peek();
                    if((ch == ')' && ch1 == '(') || (ch == '}' && ch1 == '{') || (ch == ']' && ch1 == '[')){
                        stk.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return stk.isEmpty();
    }
}
class SinglyList
{
  public LinkedList head = null;
  public int length;
  class LinkedList
  {
	public int data;
	public LinkedList next;
	  LinkedList (int data)
	{
	  this.data = data;
	  next = null;
	}
  }
  void addFirst (int data)
  {
	LinkedList ll = new LinkedList (data);
	ll.next = head;
	head = ll;
	length++;
  }
  void addLast (int data)
  {
	LinkedList ll = new LinkedList (data);
	if (head == null)
	  {
		head = ll;
		length = 1;
	  }
	else
	  {
		LinkedList current = head;
		while (current.next != null)
		  {
			current = current.next;
		  }
		current.next = ll;
		length++;
	  }

  }
  void addAtpos (int data, int pos)
  {
	LinkedList nl = new LinkedList (data);
	if (head != null)
	  {
		if (pos <= length && pos != 1)
		  {
			int cnt = 1;
			LinkedList current = head;
			LinkedList temp = null;
			while (cnt < pos - 1)
			  {
				current = current.next;
				cnt++;
			  }
			temp = current.next;
			current.next = nl;
			nl.next = temp;
			length++;
		  }
		else
		  {
			if (pos != 1)
			  System.out.println ("invalid position entered !");
			else
			  nl.next = head;
			head = nl;
			length++;
		  }
	  }
	else
	  {
		head = nl;
	  }
  }
  LinkedList delFirst ()
  {
	if (head == null)
	  return null;
	LinkedList temp;
	{
	  temp = head;
	  head = head.next;
	  length--;
	  return temp;
	}
  }
  LinkedList delAtpos (int pos)
  {
	LinkedList temp = null;
	if (head != null && pos <= length)
	  {
		if (pos == 1)
		  {
			return this.delFirst ();
		  }

		LinkedList current = head;
		int cnt = 1;
		while (cnt < pos - 1)
		  {
			current = current.next;
			cnt++;
		  }
		temp = current.next;
		current.next = temp.next;
		length--;

	  }
	else
	  {
		if (head != null)
		  System.out.println ("Invalid Position Entered !");
		else
		  return null;
	  }
	return temp;
  }
  LinkedList delLast ()
  {
	if (head == null && head.next == null)
	  {
		if (head != null)
		  length--;
		return head;
	  }
	LinkedList temp = null;
	LinkedList current = head, prev = null;
	while (current.next != null)
	  {
		prev = current;
		current = current.next;
	  }
	prev.next = null;
	temp = current;
	this.length--;
	return temp;
  }
  LinkedList searchKey (int data)
  {
	LinkedList temp = null, current = head;
	while (current != null)
	  {
		if (current.data == data)
		  {
			temp = current;
			break;
		  }
		current = current.next;
	  }
	return temp;
  }
  LinkedList addTwoNums (LinkedList A, LinkedList B)
  {

	LinkedList dummy = new LinkedList (0);
	LinkedList tail = dummy;
	int carry = 0;
	while (A != null || B != null)
	  {
		int x = (A != null) ? A.data : 0;
		int y = (B != null) ? B.data : 0;
		int sum = carry + x + y;
		carry = sum / 10;
		tail.next = new LinkedList (sum % 10);
		tail = tail.next;
		if (A != null)
		  A = A.next;
		if (B != null)
		  B = B.next;
	  }
	if (carry > 0)
	  tail.next = new LinkedList (carry);
	return dummy.next;
  }

  void dispList (LinkedList obj)
  {
	while (obj != null)
	  {
		System.out.print (obj.data);
		if (obj.next != null)
		  System.out.print ("->");
		obj = obj.next;
	  }
  }
}

class DoublyList
{
  LinkedList head, tail;
  int length;
  public class LinkedList
  {
	int data;
	LinkedList prev;
	LinkedList next;

	  LinkedList (int data)
	{
	  this.data = data;
	  this.prev = null;
	  this.next = null;
	}

  }
  public DoublyList ()
  {
	this.head = null;
	this.tail = null;
	this.length = 0;
  }
  boolean isEmpty ()
  {
	return this.length == 0;
  }
  public int length ()
  {
	return length;
  }
  public LinkedList addFirst (int data)
  {
	LinkedList newnode = new LinkedList (data);
	if (isEmpty ())
	  {
		tail = newnode;
	  }
	else
	  {
		head.prev = newnode;
	  }
	newnode.next = head;
	head = newnode;
	length++;
	return head;
  }
  public LinkedList addLast (int data)
  {
	LinkedList newnode = new LinkedList (data);
	if (isEmpty ())
	  {
		head = newnode;
	  }
	else
	  {
		tail.next = newnode;
	  }
	newnode.prev = tail;
	tail = newnode;
	length++;
	return head;
  }
  public LinkedList delFirst ()
  {
	if (length != 0)
	  {
		LinkedList temp = head;
		head = head.next;
		head.prev = null;
		length--;
		return temp;
	  }
	return null;
  }
  public LinkedList delLast ()
  {
	if (length != 0)
	  {
		LinkedList temp = tail;
		tail = tail.prev;
		tail.next = null;
		length--;
		return temp;
	  }
	return null;
  }
  public void dispForward (LinkedList head)
  {
	LinkedList temp = head;
	while (temp != null)
	  {
		System.out.print (temp.data);
		if (temp.next != null)
		  System.out.print ("<->");
		temp = temp.next;
	  }
  }
  public void dispBack (LinkedList head)
  {
	LinkedList temp = tail;
	while (temp != null)
	  {
		System.out.print (temp.data);
		if (temp.prev != null)
		  System.out.print ("<->");
		temp = temp.prev;
	  }
  }

}
 class CircularList {
    public LinkedList tail;
    public int length;

    private class LinkedList {
        int data;
        LinkedList next;

        public LinkedList(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public CircularList() {
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public boolean addFirst(int data) {
        LinkedList newnode = new LinkedList(data);
        length++;
        if (isEmpty()) {
            tail = newnode;
            newnode.next = newnode; // Circular reference for the single node
        } else {
            newnode.next = tail.next; // The new node points to the current head
            tail.next = newnode;      // The tail points to the new node, making it the new head
        }
        return true;
    }

    public boolean addLast(int data) {
        LinkedList newnode = new LinkedList(data);
        length++;
        if (isEmpty()) {
            tail = newnode;
            newnode.next = newnode; // Circular reference for the single node
        } else {
            newnode.next = tail.next; // The new node points to the current head
            tail.next = newnode;      // The tail points to the new node, making it the new tail
            tail = newnode;           // Update tail to the new node
        }
        return true;
    }

    public boolean dispList() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return false;
        }

        LinkedList temp = tail.next; // Start from the head (tail.next)
        do {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != tail.next) { // Avoid printing '->' after the last element
                System.out.print("->");
            }
        } while (temp != tail.next);

        System.out.println();
        return true;
    }

    // Additional methods for the CircularList can be added here
}



public class Main
{
  public static void main (String[]args)
  {
	System.out.println ("Hello World");
/*	SinglyList sl = new SinglyList ();
	  sl.addFirst (1);
	  sl.addFirst (1);
	  sl.addFirst (2);
	  sl.addFirst (5);
	  sl.addLast (9);

	  //sl.addAtpos (100, 1);
	 // sl.addAtpos (54, 5);
	  sl.dispList(sl.head);
	  System.out.println("\n");
	  SinglyList sl2 = new SinglyList();
	  sl2.addFirst(2);
	  sl2.addFirst(1);
	  sl2.addFirst(3);
	  sl2.addLast(9);
	 // sl2.addAtpos(99,2);
	  sl2.dispList(sl2.head);
	  System.out.println("\n");
	  sl.dispList(sl.addTwoNums(sl.head,sl2.head));
	  
	  sl.dispList (sl.head);
	  System.out.println ("\nList Count :" + sl.length);
	  SinglyList.LinkedList tl = sl.delFirst ();
	  System.out.println ("Deleted :" + tl.data);
	  sl.dispList (sl.head);
	  System.out.println ("\nList Count :" + sl.length);
	  tl = sl.delAtpos (6);
	  System.out.println ("Deleted :" + tl.data);
	  sl.dispList (sl.head);
	  System.out.println ("\nList Count :" + sl.length);
	  tl = sl.delLast ();
	if (tl == null)
	  System.out.println ("no node is present !");
	else
	    System.out.println ("Deleted :" + tl.data);
	  sl.dispList (sl.head);
	  System.out.println ("\nList Count :" + sl.length);
	  tl = sl.searchKey (51);
	if (tl == null)
	  {
		System.out.println ("No such element found !");
	  }
	else
	    System.out.println (tl.data + " : Element found at List !");

	DoublyList dll = new DoublyList ();
	  dll.addFirst (10);
	  dll.addFirst (5);
	  dll.addLast (90);
	  System.out.println ("Forward Direction :");
	  dll.dispForward (dll.head);
	  System.out.print ("\nBackward Direction :\n");
	  dll.dispBack (dll.tail);
	  DoublyList.LinkedList list ;//= dll.delFirst ();
	  list = dll.delLast();
	if (list == null)
	  {
		System.out.println ("No node !");
	  }
	else
	  {
		System.out.println ("\nDeleted data :" + list.data);
		dll.dispForward (dll.head);
	  }
	  
	  CircularList cll = new CircularList();
	  cll.addFirst(12);
	  cll.addFirst(14);
	  cll.addLast(54);
	  cll.dispList();
	  
	  checkValidParen obj = new checkValidParen();
	  System.out.println("Result :"+obj.isValid("(({}))"));
	  
	  Queue q = new Queue();
	  q.enqueue(90);
	 q.dequeue();
	  q.dispQueue();
	  */
	  Queue q = new Queue();
	  String [] str = q.genBinNums(5);
	  
  }
}
