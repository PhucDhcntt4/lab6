
import java.util.Scanner;

class NhanVien{
    protected String ten;
    protected long luong;
    protected String loainhanvien;

    public void ten(){
       Scanner sc = new Scanner(System.in); 
         System.out.println("Nhap ten nhan vien :");
      String ten = sc.nextString();
}

    public void luong(){

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong: ");
        long luong = sc.nextLong();

    }

    public void loainhanvien(){

        Scanner sc = new Scanner(System.in);
        System.out.println("loai nhan vien la;");
        String loainhanvien = sc.nextString();

    }
}

class NhanVienFullTime extends NhanVien{
  @Override
 int LoaiChucVu;
     int NgayLamThem;
     int songay;
     double luonggio,sogio;
    public void LoaiChucVu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("chuc vu la :");
        int LoaiChucVu = sc.nextInt();
    }

    public void NgayLamThem(){

        Scanner sc = new Scanner(System.in);
        System.out.println("so ngay lam them la: ");
        int NgayLamThem = sc.nextInt();
    }

    public void luong(){

        Scanner sc = new Scanner(System.in);
        System.out.println("so gio la :");
        double sogio = sc.nextDouble();
        System.out.println("luong gio la: ");
        double luonggio = sc.nextDouble();

        luong = sogio * luonggio;

    }
}

class NhanVienPartime extends NhanVien{
    @Override

    int giolamviec,luongcoban;
    double luongpart;
    public void gluong(){

        Scanner sc = new Scanner(System.in);
        System.out.println("gio lam la: ");
        int giolamviec = sc.nextInt();
        System.out.println("luong co ban la :");
        int luongcoban = sc.nextInt();

        luongpart = giolamviec * luongcoban;

    }
}

public class b1{
    public static void main(String[] args) {
        
      NhanVien nv = new NhanVien();
      nv.ten();
      nv.luong();
      nv.loainhanvien();

      nv = new NhanVienFullTime();
      nv.LoaiChucVu();
      nv.NgayLamThem();
      nv.luong();

      nv = new NhanVienPartime();
      nv.gluong();
      
    }
}