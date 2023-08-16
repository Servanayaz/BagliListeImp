
package baglilisteımpl;


public class BagliListe {
    Node head;
    int es;
    
    public BagliListe(){
        head=null;
        es=0;
        }
    
    
    public void arayaekle(Node n){
        //ilk düğümün eklenmesi
        if(head==null){
            head=n;
        }
        //başa ekleme
        else if(head.data>n.data){
            n.next=head;
            head=n;
        }
        //araya ve sona ekleme
        else{
            Node tmp=head;
            while(tmp.next!=null && tmp.next.data<n.data){
                tmp=tmp.next;
            }
            n.next=tmp.next;
            tmp.next=n;
        }
    }
    public void sil(int d){
        if(head==null){
            System.out.println("Liste boş!");
        }
        //baştan silme
        else if(head.data==d){
            head=head.next;
        }
        //sondan ve aradan silme
        else{
            Node tmp=head;
            while(tmp != null && tmp.next!=null){
                if(tmp.next.data==d){
                    tmp.next=tmp.next.next;
                }
                tmp=tmp.next;
            }
            
        }
    }
    //sona ekleyerek devam etme
    public void ekle(Node n){
        
        if(head==null){
            head=n;
        }else{
            Node tmp=head;
            while(tmp.next!=null){
                tmp=tmp.next;
            }
            tmp.next=n;
        }
    }

    
    public void print(){
        //System.out.println(this.head);
        Node tmp=head;
        while(tmp!=null){
            System.out.print(tmp.data+" - ");
            tmp=tmp.next;
        }
        System.out.println();
    }
    
}
