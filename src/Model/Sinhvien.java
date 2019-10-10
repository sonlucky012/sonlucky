package Model;

public class Sinhvien {
	private int id ;
	private String hoten;
	private String diachi;
	private int sdt;
	public Sinhvien() {
		
	}
	public Sinhvien(int id, String hoten, String diachi, int sdt) {
		super();
		this.id = id;
		this.hoten = hoten;
		this.diachi = diachi;
		this.sdt = sdt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	
}
