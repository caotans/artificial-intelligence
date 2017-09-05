package ct_gril;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-9-4
 * Time: 下午3:28
 * To change this template use File | Settings | File Templates.
 */
public class CT_Girl_JFrame extends JFrame {
    public CT_Girl_JFrame() {
        setTitle("绘制图形");//设置窗体的标题
        setSize(400, 400);//设置窗体的大小

    }

    /**
     * 启动机器人程序
     */
    public void runCT_Girl (){
        CT_Girl_JFrame testMain=new CT_Girl_JFrame();
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
