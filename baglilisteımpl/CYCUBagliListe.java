/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baglilisteımpl;

public class CYCUBagliListe {

    Node head;
    int es;
    Node tail;

    public CYCUBagliListe() {
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
            head.prev = n;
            n.next = head;
            head = n;
        }
        es++;
    }

    public void sonaEkle(Node n) {

        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
        es++;
    }

    public void arayaEkle(Node n) {
        if (head == null) {
            tail = n;
            head = n;
        } else {
            if (n.data < head.data) {
                n.next = head;
                head.prev = n;
                head = n;
            } else if (n.data > tail.data) {
                tail.next = n;
                n.prev = tail;
                tail = n;
            } else {
                Node tmp = head;
                while (tmp != null && tmp.data > n.data) {
                    tmp = tmp.next;
                }

                n.next = tmp.next;
                tmp.next.prev = n;
                tmp.next = n;
                n.prev = tmp;
            }
        }

    }

    public void sil(int n) {
        if (head == null) {
            System.out.println("liste boş");
        } else {
            if (head.data == n) {
                bastanSil();
            } else if (tail.data == n) {
                sondanSil();
            }
            aradanSil(n);
        }
    }

    public void aradanSil(int n) {

        Node tmp = head;
        while (tmp != null && tmp.data != n) {
            tmp = tmp.next;

        }

        if (tmp != null) {

            tmp.next.prev = tmp.prev;
            tmp.prev.next = tmp.next;

        }
    }

    public void bastanSil() {

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head.next.prev = null;
            head = head.next;
        }
        es--;

    }

    public void sondanSil() {

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail.prev.next = null;
            tail = tail.prev;
        }
        es--;
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
