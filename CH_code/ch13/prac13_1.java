package CH_code.ch13; /**
 * 예제 13-1 : Thread를 상속받아 1초 단위의 타이머 만들기
 */

import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {
    private JLabel timerLabel;

    public TimerThread(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    @Override
    public void run() {
        int n = 0;
        while (true) {
            timerLabel.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

/**
 * ThreadTimerEx를 prac13_1로 대체
 */
public class prac13_1 extends JFrame {
    /// ThreadTimer >> prac13_1

    public prac13_1() {
        setTitle("Thread를 상속받은 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        c.add(timerLabel);

        TimerThread th = new TimerThread(timerLabel);

        setSize(300, 170);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args) {
        new prac13_1();
    }
}
