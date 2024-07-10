package com.study.dvd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.study.dvd.entity.Dvd;

import com.study.dvd.util.DBConnectionMgr;

public class DvdDao {
	private static DBConnectionMgr pool = DBConnectionMgr.getInstance();
	
	public static List<Dvd> searchDvdTitle(String searchText) {
		List<Dvd> dvds = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = pool.getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("select * from dvd_view ");
			sql.append("where title like ? ");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, "%" + searchText + "%");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dvds;
	}
}
