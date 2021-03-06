package com.kh.date01;

import java.text.SimpleDateFormat;

public class MemberDTO {
private String id;
private String pw;
private String birth_date;

public MemberDTO() {}
public MemberDTO(String id, String pw, String birth_date) {
	super();
	this.id = id;
	this.pw = pw;
	this.birth_date = birth_date;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
public String getBirth_date() {
	return birth_date;
}
public void setBirth_date(String birth_date) {
	this.birth_date = birth_date;
}
@Override
public String toString() {
	return id + " : " + pw + " : " + birth_date + " : " + getTimestamp();
}


//register_date 멤버필드를 이용해서 현재시간과 등록시간의 차이를 계산해 String값으로 반환해주는 메서드
public String getTimestamp() {
	// System.currentTimeMillis() -> 현재시간이 long형으로 반환됨
	// register_date(카페테이블 컬럼명) 를 먼저 자바의 Date 타입으로 변환 
	SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
	// sdf의 형식처럼 생긴 register_date String 값을 자바의 Date형으로 변환하는 작업
	try {
		// String 데이트 값을 가지고 있는 register_date -> 일단 long  형으로 변환하는 작업
		java.util.Date date = sdf.parse(this.birth_date);/*카페 테이블컬럼명*/
				// getTime : 자바의 date 타입 데이터를 long 형으로 반환해서 반환해주는 메서드
		long origin_date = date.getTime(); // 등록일을 long 형으로 변환
		long cur_date = System.currentTimeMillis();//현재시간값
		// 두시간 간의 갭 -> 초단위로 계산
		long gap_time = cur_date - origin_date / 1000;
		
		int sec = 60;
		int min = 60;
		int hour = 24;
		int day = 30;
		int month = 12;
		
		if(gap_time < sec) {//1분 미만이라고 한다면 '~초전
			return gap_time + "초전"; 
		}else if((gap_time/sec)< min){//1시간 미만이라고 한다면 '~분전'
			//1분 -> 60초
			// 1시간 -> 60분
			return gap_time + "분 전";
		}else if((gap_time/=min)< hour) {//1일 미만 이라면 '~시간 전'
			//gep_time 은 60이상의 값을 가지고 있을거다.
			//60분 기준으로 분 단위
			// 1일 -> 24시간
			return gap_time + "시간 전";
		}else if((gap_time/hour)<day) {//30일 미만 이라면 '~일 전'
			return gap_time + "일 전";
		}else if((gap_time/day)>month) {//12개월 미만 이라면 '개월 전'
			return gap_time + "개월 전";
		}else if((gap_time/12) < 100) { 
			return gap_time + "년 전";
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}return null;
}
//// register_date 멤버필드를 이용해서 현재시간과 등록시간의 차이를 계산해 String값으로 반환해주는 메서드
//public String getTimestamp() {
//	// System.currentTimeMillis() -> 현재시간이 long형으로 반환됨
//	// register_date(카페테이블 컬럼명) 를 먼저 자바의 Date 타입으로 변환 
//	SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
//	// sdf의 형식처럼 생긴 register_date String 값을 자바의 Date형으로 변환하는 작업
//	try {
//		// String 데이트 값을 가지고 있는 register_date -> 일단 long  형으로 변환하는 작업
//		java.util.Date date = sdf.parse(this.register_date);/*카페 테이블컬럼명*/
//				// getTime : 자바의 date 타입 데이터를 long 형으로 반환해서 반환해주는 메서드
//		long origin_date = date.getTime(); // 등록일을 long 형으로 변환
//		long cur_date = System.currentTimeMillis();//현재시간값
//		// 두시간 간의 갭 -> 초단위로 계산
//		long gap_time = cur_date - origin_date / 1000;
//		
//		int sec = 60;
//		int min = 60;
//		int hour = 24;
//		int day = 30;
//		int month = 12;
//		
//		if(gap_time < sec) {//1분 미만이라고 한다면 '~초전
//			return gap_time + "초전"; 
//		}else if((gap_time/sec)< min){//1시간 미만이라고 한다면 '~분전'
//			//1분 -> 60초
//			// 1시간 -> 60분
//			return gap_time + "분 전";
//		}else if((gap_time/=min)< hour) {//1일 미만 이라면 '~시간 전'
//			//gep_time 은 60이상의 값을 가지고 있을거다.
//			//60분 기준으로 분 단위
//			// 1일 -> 24시간
//			return gap_time + "시간 전";
//		}else if((gap_time/hour)<day) {//30일 미만 이라면 '~일 전'
//			return gap_time + "일 전";
//		}else if((gap_time/day)>month) {//12개월 미만 이라면 '개월 전'
//			return gap_time + "개월 전";
//		}else if(gap_time/12 >= 1) { 
//			return gap_time + "년 전";
//		}
//		
//	}catch(Exception e) {
//		e.printStackTrace();
//	}return null;
//}



}
