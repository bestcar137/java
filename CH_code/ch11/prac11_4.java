package CH_code.ch11;

import javax.swing.*;
import java.awt.*;

/** CheckBoxEx를 prac11_4로 대체 */
public class prac11_4 extends JFrame {

    public prac11_4() {
        setTitle("체크박스 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
        ImageIcon selectedCherryIcon = new ImageIcon(
                "images/selectedCherry.jpg");

        JCheckBox apple = new JCheckBox("사과");
        JCheckBox pear = new JCheckBox("배", true);
        JCheckBox cherry = new JCheckBox("체리", cherryIcon);

        cherry.setBorderPainted(true); // 체크박스 외곽선 처리
        cherry.setSelectedIcon(selectedCherryIcon);

        c.add(apple);
        c.add(pear);
        c.add(cherry);

        setSize(250, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new prac11_4();
    }
}