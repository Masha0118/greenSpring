package polymorphism;

public class SamsungTv implements Tv{
	public SamsungTv() {
		System.out.println("==> �ＺTV ��ü ����");
	}
	
	public void powerOn() {
		System.out.println("SamsngTV---���� �Ҵ�.");
	}
	
	public void powerOff() {
		System.out.println("SamsngTV---���� ����.");
	}
		
	public void volumeUp() {
		System.out.println("SamsngTV---�Ҹ� �ø���.");
	}
	
	public void volumeDown() {
		System.out.println("SamsngTV---�Ҹ� ������.");
	}
}