package day07;

public class Staff {
	private int no;//사번
	private String name;
	private String dept;//부서
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	public void showInfo() {
		System.out.println("---직원 정보----");
		System.out.println("사번: "+no);
		System.out.println("이름: "+name);
		System.out.println("부서: "+dept);
	}

}
