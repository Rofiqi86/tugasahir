/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo4;
import javax.swing.JOptionPane;

/**
 *
 * @author Amin Rois
 */
public class PBO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pil,batas;
        String bat,temp;
        do{
            String sub = JOptionPane.showInputDialog("1. Bilangan Ganjil\n2. Bilangan Genap\n3. Angka Terbesar\n4. Exit");
            pil = Integer.valueOf(sub);
            
                if(pil ==1){
                    bat = JOptionPane.showInputDialog("Masukkan Batas Akhir");
                    batas = Integer.valueOf(bat);
                    temp=" ";
                    for(int i=1; i<=batas; i++)
                        if (i%2!=0)
                          if(i==batas)
                            temp = temp + i +(" ");
                        else
                            if(i!=batas-1)
                            temp = temp + i +(", ");
                        else 
                            temp = temp + i;
                   
                        JOptionPane.showMessageDialog(null, temp);
                }else
                if (pil == 2){    
                    bat = JOptionPane.showInputDialog("Masukkan Batas Akhir");
                    batas = Integer.valueOf(bat);
                    temp=" ";
                    for(int i=1; i<=batas; i++)
                        if (i%2==0)
                          if(i==batas-1)
                            temp = temp + i +(" ");
                          else
                            if(i!=batas)
                                temp = temp + i +(", ");
                            else 
                                temp = temp + i;
                   
                        JOptionPane.showMessageDialog(null, temp);
                }else 
                if(pil == 3){
                    bat = JOptionPane.showInputDialog("Masukkan Banyak Array");
                    batas = Integer.valueOf(bat);
                    int angka, tamp=0;
                    int A[];
                    A = new int[batas];
                    String tampung=" ";
                    for (int i=0; i<batas; i++){
                        String ang = JOptionPane.showInputDialog("Masukkan angka di Array ke: "+i);
                        angka = Integer.valueOf(ang);
                        A[i] = angka; 
                        if(A[i]!=A[batas-1])
                            tampung = tampung + A[i] +(", ");
                        else 
                            tampung = tampung + A[i];
                    }
                    for (int i=0; i<batas; i++){
                        for (int j=1; j<batas; j++){
                            if(A[j-1]<=A[j]){
                                tamp = A[j]; 
                        }
                    }
                    }    
                    JOptionPane.showMessageDialog(null,"Angka Yang di inputkan = "+ tampung +"\nAngka terbesar = "+tamp);
                }
            }while(pil!=4);
    
        }
    }
 

    
    
    

