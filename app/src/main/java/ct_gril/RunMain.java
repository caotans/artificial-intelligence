package ct_gril;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-9-4
 * Time: 下午4:18
 * To change this template use File | Settings | File Templates.
 */
public class RunMain extends JFrame {
    public RunMain() {
        setTitle("绘制图形");//设置窗体的标题
        setSize(400, 400);//设置窗体的大小

    }

    public static void main(String[] args) {
        RunMain testMain=new RunMain();
        testMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testMain.setLocationRelativeTo(null);
        testMain.setVisible(true);
        DrawCT_Girl_impl drawCT_gril_impl=new DrawCT_Girl_impl();
        try {
            drawCT_gril_impl.run_CT_Girl(testMain);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}