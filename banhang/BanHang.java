package banhang;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BanHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số lượng hàng hóa: ");
        int n=sc.nextInt();
        ArrayList<HangHoa> hh = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            sc.nextLine();
            System.out.print("\nNhập tên: ");
            String ten=sc.nextLine();
            System.out.print("\nNhập đơn vị: ");
            String donVi=sc.nextLine();
            System.out.print("\nNhập giá mua: ");
            int giaMua=sc.nextInt();
            sc.nextLine();
            System.out.print("\nNhập giá bán: ");
            int giaBan=sc.nextInt();
            hh.add(new HangHoa(ten,donVi,giaMua,giaBan));
            sc.nextLine();
        }
        for(int i=0;i<hh.size();i++){
            for(int j=hh.size()-1;j>i;j--){
                if(hh.get(j).getLoiNhuan()<hh.get(j-1).getLoiNhuan()){
                    HangHoa tmp = hh.get(j);
                    hh.set(j, hh.get(j-1));
                    hh.set(j-1, tmp);
                }
            }
        }
        for(int i=0;i<hh.size();i++){
            System.out.println(hh.get(i));
        }
    }
    
}
