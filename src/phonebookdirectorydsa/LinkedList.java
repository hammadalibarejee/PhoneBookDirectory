/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phonebookdirectorydsa;

import static java.lang.ProcessHandle.current;

/**
 *
 * @author Hammad Ali
 */
public class LinkedList {
    String temp1;
    String temp2;
    String temp3;
    Node head;
    Node nxt1;
    int size;
    
    public void addNode(String data ,String no, String email){
        
        if (this.head==null){
            this.head= new Node(data,no,email);
            size++;
            
        }
        else{
            Node node = new Node(data,no,email);
            nxt1=head;
            while (nxt1.next !=null){
                nxt1=nxt1.next;
            }
            head.next=node;
            size++;
//            sort(head, nxt1);
        }
        
    }
    public void showList(){
        nxt1=head;
//        String s = "";
//        if (head !=null){               
//            for (Node p = head; p !=null; p = p.next){
//                return p.data +"\t"+ p.num + "\t "+p.e;                   
//        
//            
//            }    
//        }
//        return s; 
        while (nxt1!= null){
            System.out.println(nxt1.data);
            System.out.println(nxt1.num);
            System.out.println(nxt1.email);
            temp1=nxt1.data;
            temp2=nxt1.num;
            temp3=nxt1.email;
            
            nxt1=nxt1.next;
        }

    }
     public void insertAt(String data,String no,String email, int pos){
        Node node= new Node(data,no,email);
        if (pos==0){
            node.next=head;
            head=node;
        }
        else{
            nxt1=head;
            for (int i=0;i<pos-1;i++){
                nxt1=nxt1.next;
                
            }
            node.next=nxt1.next;
            nxt1.next=node;
            
        }
    }
    public void deleteAt(int pos){
        if (pos==0){
            head=head.next;
            return;
        }
        else{
            nxt1=head;
            for (int i=0;i<pos-1;i++){
                nxt1=nxt1.next;
            
        }
            nxt1.next=nxt1.next.next;
        }
    }
//        Node paritionLast(Node start, Node end)
//    {
//        if (start == end || start == null || end == null)
//            return start;
// 
//        Node pivot_prev = start;
//        Node curr = start;
//        String pivot = end.data;
// 
//        while (start != end) {
//            if (start.data.compareTo(pivot) < 0) {
//                // keep tracks of last modified item
//                pivot_prev = curr;
//                String temp = curr.data;
//                curr.data = start.data;
//                start.data = temp;
//                curr = curr.next;
//            }
//            start = start.next;
//        }
// 
//        String temp = curr.data;
//        curr.data = pivot;
//        end.data = temp;
// 
//        return pivot_prev;
//    }
// 
//     void sort(Node start, Node end)
//    {
//        if(start == null || start == end|| start == end.next )
//            return;
// 
//        Node pivot_prev = paritionLast(start, end);
//        sort(start, pivot_prev);
// 
//        if (pivot_prev != null && pivot_prev == start)
//            sort(pivot_prev.next, end);
// 
//        else if (pivot_prev != null
//                 && pivot_prev.next != null)
//            sort(pivot_prev.next.next, end);
//    }
    
//   
}
