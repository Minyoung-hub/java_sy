package ch02.ex02.string;

public class C02 {
	public static void main(String[] args) {
		String src = "우리 개는";
		String s1, s2, s3, s4;
		char c;
		
		int len = src.length();
		System.out.println("lenth : " + len);
		
		s1 = src.concat(" 짖는다.");
		s2 = src.replace("개", "고양이");
		s3 = src.substring(0, 4); 
		// 글자 사이사이를 index로 카운트 하자 "와 우 사이에 하나 우와리 사이에 하나 이런식으로
		s4 = s2.concat(" 귀엽다.");
		c = src.charAt(3); // 문자 하나를 읽어내는 것 이기 때문에 char타입으로도 가능
		
		System.out.printf("%s\n%s\n%s\n%s\n%s\n", s1, s2, s3, c, s4);
		System.out.println("src : " + src);
		
		// 메모리를 낭비하게 된다는 단점이 있다. 그래서 위를 대신할 함수가 Buffer이다.
		// 뭔가 데이터 수정을 많이 해야할때 위와 같은 방법보다 StringBuffer를 이용하는 것이 메모리 절약 차원에서 좋다.
	}

}
