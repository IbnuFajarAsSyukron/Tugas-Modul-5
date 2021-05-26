
package SlinkedList;

public class SinglyLinkedList {
   
    public static void main(String[] args) {
        
        SinglyLinkedList lk = new SinglyLinkedList();
        lk.insertAwal(100);
        lk.display();
        lk.insertAwal(200);
        lk.display();
        lk.insertAkhir(50);
        lk.display();
        lk.insertAwal(50);
        lk.display();
        lk.insertAtPos(50, 2);
        lk.display();
        lk.insertAkhir(80);
        lk.display();
        lk.deleteAtPos(2);
        lk.display();
    }
}
