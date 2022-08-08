package com.javaex.ch2;

public class SongApp {

	public static void main(String[] args) {
		
		//Song(String artist, String title, String album, String composer, int year, int track)
		Song song1 = new Song("아이유", "좋은날", "Real", "이민수", 2010, 3);
		Song song2 = new Song("BIGBANG", "거짓말", "Always", "G-DRAGON", 2007, 2);
		Song song3 = new Song("버스커버스커", "벚꽃엔딩", "버스커버스커1집", "장범준", 2012, 4);
		
		song1.showInfo();
		song2.showInfo();
		song3.showInfo();

	}

}
