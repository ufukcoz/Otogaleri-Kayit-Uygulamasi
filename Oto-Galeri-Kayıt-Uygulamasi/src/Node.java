
public class Node {
     
    String plaka;
    String marka;
    String model;
    String renk;
    int alisFiyati;
    int satisFiyati;
    String aciklama;
    Node next;

    public Node(String plaka, String marka, String model, String renk, int alisFiyati,  String aciklama) {
        this.plaka = plaka;
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.alisFiyati = alisFiyati;
        this.satisFiyati = alisFiyati*12/10;
        this.aciklama = aciklama;
        next=null;
    }
}
