/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phonebookdirectorydsa;

/**
 *
 * @author Hammad Ali
 */
public class Node {
   String data;
   String num;
   String email;
   Node next;
 
    Node(String data, String no , String email)
    {
            this.data = data;
            this.num = no;
            this.email = email;
            this.next = null;
    }    
}
