package multicampus;

public class JobSeeker {
	
	private int age;
	private String name;
	private String field;
	
	//setter
	public void setAge(int age) {
		this.age=age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setField(String field) {
		this.field=field;
	}
	
	//getter
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getField() {
		return field;
    }
	
	public void ShowInfo() {
		System.out.println("-----구직자정보----");
		System.out.println("나이: "+age);
		System.out.println("이름: "+name);
		System.out.println("분야: "+field);
		
	}

}
