package com.example;

public class CSSS06669101636Y1 {
	 public static void main(String[] args) {
		try {

			Class.forName("cdata.jdbc.youtubeanalytics.YouTubeAnalyticsDriver");
			Class.forName("cdata.jdbc.youtube.YouTubeDriver");

			// GetRTK

			//Youtube Analytics
			System.out.println(cdata.jdbc.youtubeanalytics.YouTubeAnalyticsDriver.getRTK());

			//Youtube
			System.out.println(cdata.jdbc.youtube.YouTubeDriver.getRTK());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



