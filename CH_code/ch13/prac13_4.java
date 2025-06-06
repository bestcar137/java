package CH_code.ch13;
/**
 * 예제 13-4 : main 스레드의 정보 출력
 * main() 메소드에서 현재 실행 중인 스레드 정보를 출력하라.
 */

/**
 * ThreadMainEx를 prac13_4로 대체
 */
public class prac13_4 { // prac13_4 >> ThreadMainEx

    public static void main(String[] args) {

        long id = Thread.currentThread().getId(); // 스레드 ID 얻기
        String name = Thread.currentThread().getName(); // 스레드 이름 얻기
        int priority = Thread.currentThread().getPriority(); // 스레드 우선순위 값 얻기
        Thread.State s = Thread.currentThread().getState(); // 스레드 상태 값 얻기

        System.out.println("현재 스레드 이름 = " + name);
        System.out.println("현재 스레드 ID = " + id);
        System.out.println("현재 스레드 우선순위 값 = " + priority);
        System.out.println("현재 스레드 상태 = " + s);
    }
}