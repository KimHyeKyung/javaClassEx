package com.javaex.ch2;

public class TV {

	private int channel;
	private int volume;
	private boolean power;
	
	public TV() {
		this(7, 20, false); //이런 식으로 작성을 하면 밑에있는 TV생성자가 호출이 된다.
	}
	
	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}
	
	public void power(boolean on) {
		if(on) {
			System.out.println("TV가 켜졌습니다.");
		}else {
			System.out.println("TV가 꺼졌습니다.");
		}
		this.power = on;
	}
	
	public void channel(int channel) {
		if(channel<1 || channel>255) {
			System.out.println("잘못된 채널입니다.");
		}else {
			System.out.println(channel+"번 입니다.");
		}
	}
	
	public void channel(boolean up) {
		if(up) {
			if(this.channel == 255) {
				System.out.println("채널 변경이 불가능합니다.");
			}else {
				this.channel++;
			}
			System.out.println("현재 채널번호 : "+channel);
		}else {
			if(this.channel == 1) {
				System.out.println("채널 변경이 불가능합니다.");
			}
			this.channel--;
			System.out.println("현재 채널번호 : "+channel);
		}
	}
	
	public void volume(int volume) {
		if(volume<0 || volume>100) {
			System.out.println("음량은 0~100사이로 입력해주세요.");
		}else {
			System.out.println("현재 음량은 " + volume + "입니다.");
		}
	}
	
	public void volume(boolean up) {
		if(up) {
			volume++;
			System.out.println("현재 음량 : "+volume);
		}else {
			volume--;
			System.out.println("현재 음량 : "+volume);
		}
	}
	
	public void status() {
		if(power==false) {
			System.out.println("현재 TV가 꺼져있습니다. TV의 상태를 표시할 수 없습니다.");
		}else {
			System.out.println("현재 채널은 " + channel + "번이고 음량은 "+ volume + "입니다.");
		}
		
	}
	
	
}
