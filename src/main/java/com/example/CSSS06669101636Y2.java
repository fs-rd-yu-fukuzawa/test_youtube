package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CSSS06669101636Y2 {
	 public static void main(String[] args) {
		try {

			Class.forName("cdata.jdbc.youtubeanalytics.YouTubeAnalyticsDriver");
			Class.forName("cdata.jdbc.youtube.YouTubeDriver");

			//Youtube Analytics
			String connectionString3 = "jdbc:youtubeanalytics:InitiateOAuth=GETANDREFRESH;Logfile=/Applications/CData/YoutubeAnalytics.log;Verbosity=3;";
			Connection conn3 = DriverManager.getConnection(connectionString3);
			PreparedStatement pstmt3 = conn3.prepareStatement("SELECT * from sys_views;");
			pstmt3.executeQuery();
		    	ResultSet rs3 = pstmt3.getResultSet();
		    	System.out.println("*** Youtube Analytics ***");
			while (rs3.next()) {
				for (int i = 1; i <= rs3.getMetaData().getColumnCount(); i++) {
					System.out.println(rs3.getMetaData().getColumnName(i) + "=" + rs3.getString(i));
				}
			}
			conn3.close();

			//Youtube
			String connectionString4 = "jdbc:youtube:InitiateOAuth=GETANDREFRESH;Logfile=/Applications/CData/Youtube.log;Verbosity=3;";
			Connection conn4 = DriverManager.getConnection(connectionString4);
			PreparedStatement pstmt4 = conn4.prepareStatement("SELECT * from sys_views;");
			pstmt4.executeQuery();
			ResultSet rs4 = pstmt4.getResultSet();
			System.out.println("*** Youtube ***");
			while (rs4.next()) {
				for (int i = 1; i <= rs4.getMetaData().getColumnCount(); i++) {
					System.out.println(rs4.getMetaData().getColumnName(i) + "=" + rs4.getString(i));
				}
			}
			conn4.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



