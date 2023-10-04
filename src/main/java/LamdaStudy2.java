import java.util.*;

//Comparator 인터페이스는 (public abstract 생략)int compare(T o1, T o2); 를 갖는 함수형인터페이스다.
//근데 함수형 인터페이스에는 static메서드와 default메서드의 개수에는 제약이 없지만 람다식과 인터페이스의 메서드가
//1:1로 연결되려면 오직 하나의 추상 메서드만 정의되어 있어야 한다고 배웠는데 Comparator 인터페이스에는
//boolean equals(Object obj); 라는 추상메서드가 더 있다.... 아 이건 추상메서드가 아니라 Object 클래스의
//메서드를 오버라이드 한 거라서 괜찮은건가? 잘 모르겠네
public class LamdaStudy2 {
    public static void main(String[] args){
        List<String> strList = Arrays.asList("a","b","c","d");
//        Collections.sort(strList, new Comparator<String>(){
//            public int compare(String s1, String s2) {
//                return s2.compareTo(s1);
//            }
//        });
        Collections.sort(strList, (s1, s2) -> s2.compareTo(s1));
        System.out.println(strList);

    }
}
