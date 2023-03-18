class HocSinh{

	public void HoTen(){
		System.out.println("....");
	}

	public void lop(){
		System.out.println("....");

	}

	public void toan(){

		System.out.println("diem toan la: 8 ");
	}

	public void ly (){

		System.out.println("diem ly: 8");

	}

	public void hoa (){

		System.out.println("diem hoa:8 ");
	}

	public void DTB(){

		System.out.println("Diem Tb la:8 ");
	}
}

class HocSinhChuyenToan extends HocSinh{
	@Override

	public void DTB(){
	System.out.println("Diem TB cua hc sinh chuyen toan la:8");
	}
}


public class b2{

	public static void main(String[] args) {
		HocSinh hs = new HocSinh();
		hs.HoTen();
		hs.lop();
		hs.toan();
		hs.ly();
		hs.hoa();
		hs.DTB();

		hs = new HocSinhChuyenToan();
		hs.DTB();
	}
}
