package day06;

public class House {
	int room; 
	String addr;
	String owner;
	
	public void showInfo() {
		System.out.println("---House정보---");
		System.out.println("소유주: "+owner);
		System.out.println("방 수 : "+room);
		System.out.println("주 소 : "+addr);
	}//--------------------
	public String existAt(int bunji) {
		String str=owner+"의 집은 "+addr+" "+bunji+"번지에 위치합니다";
		return str;
	}//--------------------
	//어떤 유형(전세, 월세, 매매)으로 얼마에 세를 놓아요 (매매해요) => 메소드를 만들어보세요
	public void rent(String type, int money) {
		switch(type) {
		case "매매":
			System.out.println("매매가: "+money+"만원");
			break;
		default:
			System.out.println("임대가: "+money+"만원");
		}
	}//--------------------

}/////////////////////////////////////
