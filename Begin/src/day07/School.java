package day07;

public class School {

	public static void main(String[] args) {
		
		/*[1] 학생객체를 생성하고, 학번,이름,전공값을 할당하세요*/
		Student s1=new Student();
		s1.setNo(1);
		s1.setName("홍길동");
		s1.setMajor("SW");
		
		s1.setNo(1);
		s1.setName("홍길동");
		s1.setMajor("SW");
		
		System.out.println("학번: "+s1.getNo());
		System.out.println("이름: "+s1.getName());
		String mj=s1.getMajor();
		System.out.println("전공: "+mj);
		
		s1.showInfo();
		
		
		/*[2] 교사객체를 생성하고, 교번,이름,담당과목을 할당하세요*/
		Teacher t1=new Teacher();
		t1.setNo(100);
		t1.setName("최교사");
		t1.setSubject("자바");
		
		t1.showInfo();
		
		/*[3] 직원객체를 생성하고, 사번,이름,소속부서를 할당하세요*/
		
		//문제1]학생 객체를 2개 더 생성하고...
		//        각각 이름,학번,전공 값을 넣어준뒤...
		//			배열에 저장하자.
		//			for루프 돌리면서 저장된 학생 객체들의
		//         정보를 출력해보자.
		Student s2=new Student();
		s2.setNo(2);
		s2.setName("김철수");
		s2.setMajor("데이터과학");
		
		Student s3=new Student();
		s3.setNo(3);
		s3.setName("이영희");
		s3.setMajor("인공지능");
		
		Student[] arr1=new Student[3];
		arr1[0]=s1;
		arr1[1]=s2;
		arr1[2]=s3;
		
		for(int i=0;i<arr1.length;i++) {
			Student st=arr1[i];
			//System.out.println(st);
			st.showInfo();
		}
		
		//문제2] 교사 객체 1개 더 생성
		//    값 할당 후 배열에 저장후, 확장 for루프 이용해서 교사정보 출력하기
		Teacher t2=new Teacher();
		t2.setNo(101);
		t2.setName("이교사");
		t2.setSubject("파이썬");
		
		Teacher arr2[]= {t1, t2};
		
		for(Teacher tc: arr2) {
			tc.showInfo();
		}
		
		
		
		
		
		
	}

}
