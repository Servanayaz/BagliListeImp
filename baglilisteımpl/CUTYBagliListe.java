/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baglilisteımpl;

/**
 *
 * @author Msi
 */
public class CUTYBagliListe {

    Node head;
    int es;
    Node tail;

    public CUTYBagliListe() {
        head = null;
        es = 0;
        tail = null;
    }

    public void basaEkle(Node n) {
        //ilk düğümün eklenmesi
        if (head == null) {
            tail = n;
            head = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public void sonaEkle(Node n) {

        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public void arayaEkle(Node n) {
        if (head == null) {
            tail = n;
            head = n;
        } else {
            if (head.data > n.data) {
                n.next = head;
                head = n;
            } else {
                Node tmp = head;
                while (tmp.next != null && tmp.next.data < n.data) {
                    tmp = tmp.next;
                }
                n.next = tmp.next;
                tmp.next = n;
            }
        }

    }

    public void aradanSil(int n) {
        if (head == null) {
            System.out.println("Liste boş!");
        } else if (head.data == n) {
            head = head.next;
        } else {
            Node tmp = head;
            while (tmp != null && tmp.next != null) {
                if (tmp.next.data == n) {
                    tmp.next = tmp.next.next;
                }
                tmp = tmp.next;
            }
        }

    }

    public void bastanSil() {
        if (head != null) {

            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
        } else {
            System.out.println("Liste boş!");
        }
    }

    public void sondanSil() {
        if (head == null) {
            System.out.println("Liste boş!");
        } else {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node tmp = head;
                while (tmp.next != tail) {
                    tmp = tmp.next;
                }
                tmp.next = null;
                tail = tmp;
            }
        }
    }

    public void print() {
        //System.out.println(this.head);
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " - ");
            tmp = tmp.next;
        }
        System.out.println();
    }
}
