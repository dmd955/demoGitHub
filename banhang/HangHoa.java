package banhang;
public class HangHoa {
    private static int dem=0;
    private int mhh;
    private String ten;
    private String donVi;
    private int giaMua;
    private int giaBan;
    HangHoa(){
    }
    HangHoa(String ten, String donVi, int giaMua,int giaBan){
        this.mhh=dem++;
        this.ten=ten;
        this.donVi=donVi;
        this.giaMua=giaMua;
        this.giaBan=giaBan;
    }
    public int getLoiNhuan(){
        int loiNhuan=(this.giaBan-this.giaMua);
        return loiNhuan;
    }
    public int getMhh(){
    return this.mhh;
    }

    @Override
    public String toString() {
        return "MHH00" + mhh +" "+ ten +" "+ donVi +" "+  giaMua +" "+  giaBan + " " + getLoiNhuan() +"\n";
    }
    
}

