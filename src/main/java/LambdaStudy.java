//람다식은 익명 클래스의 객체와 동등하다.
//익명 클래스를 만들기 위해선 상속받을 클래스 또는 구현할 인터페이스가 필요하다.
//상속할 인터페이스를 만들고 f1과 같이 이를 구현할 익명 클래스를 만들어 일회용 객체를 반환하는 행위는
//f2와 같이 람다식으로 익명 클래스를 만들어 일회용 객체를 반환하는 행위와 완전히 같다.
//이 때, 람다식이 인터페이스를 구현한다는 근거는 람다식에 사용되는 input parameter와
//return 값의 타입에 달려 있다. f2와 같이 입력이 i이고 return이 i+10인 람다식이 MyFunction 인터페이스 참조변수에게
//주어졌을 때, MyFunction 인터페이스는 람다식에 사용된 input parameter의 개수와 return 값 존재 여부,
//input parameter와 return값 parameter사이의 관계를 파악 후 인터페이스의 메서드를 구현한 것이 맞는지 확인하여
//맥락상 말이 된다고 판단되면 이를 올바른 람다식이라 판단 후 처리하는 것으로 보인다.

public class LambdaStudy {
    public static void main(String[] args){
        MyFunction f1 = new MyFunction() {
            @Override
            public int getPlusTen(int i) {
                return i+10;
            }
        };
        MyFunction f2 = (i) -> i+10;
        System.out.println(f1.getPlusTen(1));
        System.out.println(f2.getPlusTen(2));
    }
}

interface MyFunction {
    public abstract int getPlusTen(int i);
}
