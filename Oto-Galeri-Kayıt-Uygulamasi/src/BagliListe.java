
import java.util.Scanner;


public class BagliListe {
    Scanner scan=new Scanner(System.in);
   Node head=null;
   Node tail=null;
   
  
    String plaka;
    String marka;
    String model;
    String renk;
    int alisFiyati;
    int satisFiyati;
    String aciklama;
    
    void ekle(){
        System.out.println(" Galeriye gelecek olan otomobilin bilgilerini giriniz  ");
        System.out.println("plaka :");plaka=scan.nextLine();
        System.out.println("marka :");marka=scan.nextLine();
        System.out.println("model :");model=scan.nextLine();
        System.out.println("renk  :");renk=scan.nextLine();
        System.out.println("aciklama :");aciklama=scan.nextLine();
        System.out.println("alis fiyati :");alisFiyati=scan.nextInt();
        
        Node arac=new Node(plaka,marka,model,renk,alisFiyati,aciklama);
        
        if(head==null){
            head=arac;
            tail=arac;
            tail.next=head;
            System.out.println(plaka+" plakali arac otogaleriye kayit edildi.");
        }else{
            arac.next=head;
            head=arac;
            tail.next=head;
            System.out.println(plaka+" plakali arac otogaleriye kayit edildi.");
        }
        
    }
    void sil(){
        
        if(head==null){
            System.out.println("Otogaleride arac yok");
            
        }else{
            System.out.println("satisini yaptiginiz aracin plakasi : ");plaka=scan.next();
            
        }
        if(head==tail&&head.plaka.equals(plaka)){
             System.out.println(plaka+" plakali arac "+ head.satisFiyati +"tl ye satildi");
           head=null;
           tail=null;
           
        }
        else if(head!=tail&&head.plaka.equals(plaka)){
             System.out.println(plaka+" plakali arac "+ head.satisFiyati +"tl ye satildi");
             head=head.next;
             tail=head;
        }
        else{
             Node temp=head;
                Node temp2=temp;
                while(temp!=tail){
                    if(temp.plaka.equals(plaka)){
                     System.out.println(plaka+" plakali arac "+temp.satisFiyati +"tl ye satildi");
                    temp2.next=temp.next;
                    
                }
                temp2=temp;
                temp=temp.next;
                }
              if(temp.plaka.equals(plaka)){
                System.out.println(plaka+" plakali arac "+ temp.satisFiyati +"tl ye satildi");
                 tail=temp2;
                 tail.next=head;
                  
              }      
        }
        
    }
    void yazdir(){
        if(head==null){
            System.out.println("Otogaleride arac yok");
        }else{
            Node temp=head;
            while(head!=tail){
        System.out.println("plaka :"+temp.plaka);
        System.out.println("marka :"+temp.marka);
        System.out.println("model :"+temp.model);
        System.out.println("renk  :"+temp.renk);
        System.out.println("satis Fiyati : "+ temp.satisFiyati);
        System.out.println("alis fiyati :"+temp.alisFiyati);
        System.out.println("aciklama :"+temp.aciklama); 
            }
        System.out.println("plaka :"+temp.plaka);
        System.out.println("marka :"+temp.marka);
        System.out.println("model :"+temp.model);
        System.out.println("renk  :"+temp.renk);
        System.out.println("satis Fiyati : "+ temp.satisFiyati);
        System.out.println("alis fiyati :"+temp.alisFiyati);
        System.out.println("aciklama :"+temp.aciklama); 
        }
            
    }
    void ara(){
         if(head==null){
            System.out.println("Otogaleride arac yok");
        }else{
              System.out.println("satisini yaptiginiz aracin plakasi : ");plaka=scan.next();
              boolean sonuc=false;
              Node temp=head;
              Node temp2=head;
             while(temp!=tail){
                    if(temp.plaka.equals(plaka)){
                   temp2=temp;
                  sonuc=true;
                }
                temp=temp.next;
                }
              if(temp.plaka.equals(plaka)){
                temp2=temp;
                  sonuc=true;
         }
              if(sonuc==false){
                  System.out.println(plaka+" plakali arac bulunamadi");
              }else{
        System.out.println(plaka+ " plakali arac bilgileri");
        System.out.println("marka :"+temp2.marka);
        System.out.println("model :"+temp2.model);
        System.out.println("renk  :"+temp2.renk);
        System.out.println("satis Fiyati : "+ temp2.satisFiyati);
        System.out.println("alis fiyati :"+temp2.alisFiyati);
        System.out.println("aciklama :"+temp2.aciklama); 
              }
    }
    
}}
