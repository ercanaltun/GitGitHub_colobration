package Lambda_Projesi;

import java.util.ArrayList;
import java.util.List;

public class LambdaMethodlar {
    public static void main(String[] args) {
/*
         **** GitHub_colobration calismasidir *****

            **** Görevli Kişiler  Ve   Görevleri****
         1_Ercan Altun(Teamlead) ==> Asagida verilen List'deki cift elemenlarin kupunu aynı satırda yazdiran bir method olusuturun(1-50 satır)
         2_Selçuk Kardeş(Tester) ==> Asagida verilen List'deki tekrarsiz tek elemenlarin karesini toplayan bir method olusturun(51-60 satır)
         3_Misafir Hocam(Tester) ==> Asagida verilen List'deki tekrarsiz 3'e bolunen elemenlari carpan bir method olusturun(61-70 satır)
 */
        List<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(6);
        liste.add(3);
        liste.add(3);
        liste.add(5);
        liste.add(6);
        liste.add(11);
        liste.add(19);
        liste.add(8);
        liste.add(8);
        liste.add(2);
        
        //Ercan Altun 
        ciftElemanlarinKupunuYazdir(liste);
        System.out.println();
        
        //Selçuk Kardeş
        


        //Misafir Hocam

        //knnoknpınuınnınpın
        
        
        
    }
    public static void ciftElemanlarinKupunuYazdir(List<Integer> mahmut) {
        mahmut.stream().filter(t->t%2==0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));


    }



    //Selçuk Kardeş









   //Misafir Hocam

 
















}
