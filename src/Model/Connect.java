package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Connect {
	private Connection connection;
	private ResultSet rs = null;
	public void Myconnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			System.out.println("Done");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Sinhvien> getALl(){
		Myconnect();
		ArrayList<Sinhvien> list = new ArrayList<Sinhvien>();
		String sql = "select * from demo";
		Statement st;
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String hoten = rs.getString("diachi");
				String diachi = rs.getString("diachi");
				int sdt = rs.getInt("sdt");
				Sinhvien sv = new Sinhvien(id,hoten,diachi,sdt);
				list.add(sv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}
	public void Delete(int id) {
		Myconnect();
		String sql = "delete from demo where id = ?";
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("Delet Ok");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void Insert(Sinhvien sv) {
		Myconnect();
		String sql = "insert into demo value(?, ?, ?, ?)";
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1, sv.getId());
			pst.setString(2, sv.getHoten());
			pst.setString(3, sv.getDiachi());
			pst.setInt(4, sv.getSdt());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void Update(Sinhvien sv) {
		Myconnect();
		String sql = "update demo set hoten = ?, diachi = ?, sdt = ? where id = ?";
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, sv.getHoten());
			pst.setString(2, sv.getDiachi());
			pst.setInt(3, sv.getSdt());
			pst.setInt(4, sv.getId());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Sinhvien getSinhvien(int id) throws SQLException {
		Myconnect();
		String sql = "select * from demo where id = ?";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1, id);
			Sinhvien sv = null;
			rs = pst.executeQuery();
			while (rs.next()) {
				int id1 = rs.getInt("id");
				String hoten = rs.getString("hoten");
				String diachi =rs.getString("diachi");
				int sdt = rs.getInt("sdt");
				sv = new Sinhvien(id1,hoten,diachi,sdt);
		}		
		return sv;
	}
	public static void main(String[] args) {
		Connect connect = new Connect();
		connect.Myconnect();
	}

}