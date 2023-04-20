package com.multi.travel;

//RAM에 만드는 저장공간을 만든다.
public class CourseVO {
	//MemberVO가방에 넣은 데이터는 Member테이블에 들어갈 예정
	//각 컬럼과 일치시켜 줌. 
	@Override
	public String toString() {
		return "CourseVO [id=" + id + ", name=" + name + ", text=" + text + ", img=" + img + ", courseroad="
				+ courseroad + "]";
	}

	private String id;
	private String name;
	private String text;
	private String img;
	private String courseroad;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getCourseroad() {
		return courseroad;
	}

	public void setCourseroad(String courseroad) {
		this.courseroad = courseroad;
	}



	//하나의 변수당 set/get하나씩 만들어줌. 
	//가방에 하나씩 값을 넣어주어야 함. ==> setter
	public void setId(String id) {
		this.id = id;
	}
	
	//가방에 하나씩 값을 꺼내주어야 함. ==> getter
	public String getId() {
		return id;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	

	
	//가방에 어떤 값들이 들어있는지 string으로 다 찍어볼 수 있다.
	
}
