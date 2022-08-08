package com.javaex.ch2;

public class Song {

	private String title;		//제목
	private String artist;		//가수
	private String album;		//앨범 제목
	private String composer;	//작곡가
	private int year;			//연도
	private int track;			//트랙 번호
	
	public Song() {
		super();
	}

	public Song(String artist, String title, String album, String composer, int year, int track) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	//노래 제목과 가수만 입력받아 필드를 초기화하는 생성자
	public Song(String title, String artist) {
		this(title, artist, null, null, 0, 0);
	}

	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getArtist() {
		return artist;
	}



	public void setArtist(String artist) {
		this.artist = artist;
	}



	public String getAlbum() {
		return album;
	}



	public void setAlbum(String album) {
		this.album = album;
	}



	public String getComposer() {
		return composer;
	}



	public void setComposer(String composer) {
		this.composer = composer;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public int getTrack() {
		return track;
	}



	public void setTrack(int track) {
		this.track = track;
	}
	
	public void showInfo() {
		System.out.println(this.artist + ", " + this.title + "( " + this.album + ", " + this.year + ", " + this.track + "번 track, " + this.composer + " 작곡 )");
	}
	
	
	
	
}
