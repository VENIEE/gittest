package day07;

public class Teacher {
	private int no;//교번
	private String name;//이름
	private String subject;//과목
	
	public void setNo(int no)
	{
		this.no = no;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	public String getSubject() {
		return subject;
	}
	
	public void showInfo() {
		System.out.println("---교사 정보----");
		System.out.println("교번: "+no);
		System.out.println("이름: "+name);
		System.out.println("과목: "+subject);
	}
	
}
