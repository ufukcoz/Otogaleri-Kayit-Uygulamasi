


import java.util.Scanner;

 public class OtoGaleriKayıtUygulamasi {


    public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
 BagliListe liste =new BagliListe();
int seçim=-1;
  while(seçim!=0)   
  {
      System.out.println("1- ekle");
        System.out.println("2-  sil");
          System.out.println("3- ara");
         System.out.println("4- yazdir");
          System.out.println("5- cikis"); 
         
  
        
      System.out.println("seciminiz: ");
      seçim=scan.nextInt();
      
       switch (seçim){
                case 1:liste.ekle();break;
                case 2:liste.sil();break;
                case 3:liste.ara();break;
                case 4:liste.yazdir();break;
                case 5:System.out.println("cikis yaptınız");;break;
                default:System.out.println("hatalı secim 0-5 arasi bir numara secin lutfen");
                
            }
            
     
     
 
    }}
        }
    





    
    

