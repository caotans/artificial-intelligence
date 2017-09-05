package ct_gril;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-9-4
 * Time: 下午3:28
 * To change this template use File | Settings | File Templates.
 */
public class CT_Girl_JPanel_smile extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            Graphics2D g2 = (Graphics2D) g;//将Graphics对象转换为Graphics2D对象
            DrawCT_Girl_impl drawCT_gril_impl=new DrawCT_Girl_impl();
            drawCT_gril_impl.smile(g2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
