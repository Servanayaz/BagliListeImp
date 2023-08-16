
package baglilisteımpl;

public class BagliListeImpl {

    public static void main(String[] args) {
        CYCUBagliListe bl=new CYCUBagliListe();
        
        Node n1=new Node(5);
        Node n2=new Node(25);
        Node n3=new Node(10);
        Node n4=new Node(50);
        Node n5=new Node(2);
        
        bl.arayaEkle(n1);
        bl.print();
        bl.arayaEkle(n2);
        bl.print();
        bl.arayaEkle(n3);
        bl.print();
        bl.arayaEkle(n4);
        bl.print();
        bl.arayaEkle(n5);
        bl.print();
        
        bl.sil(5);
        bl.print();
        bl.sil(25);
        bl.print();
        bl.sil(10);
        bl.print();
        bl.sil(50);
        bl.print();
        bl.sil(2);
        bl.print();
        
        
    }
    
}
