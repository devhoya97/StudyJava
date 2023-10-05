//입력받은 String이 숫자로만 이루어져있는지 판단하기 위해선,
//        1. String 클래스의 void toCharArray() 메서드를 활용해 String을 char[]로 변환한다.
//
//        2. char[]의 요소를 하나씩 불러온다.
//
//        3. Character 클래스의 boolean isDigit(char c) 메서드를 활용해 해당 문자가 숫자인지 판별한다.
//
//        가장 기초적인 판별법인데, 일단 이를 쉽게 떠올릴 수 있을 만큼 익숙해질 필요가 있다.
public class Characters_isDigit {
    public static void main(String[] args) {
        String input = "123";
        for(char c : input.toCharArray()){
            System.out.println(c+" is digit? : "+Character.isDigit(c));
        }
    }
}
