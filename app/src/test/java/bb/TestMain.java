package bb;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-9-4
 * Time: 下午3:16
 * To change this template use File | Settings | File Templates.
 */
public class TestMain extends JFrame{
    public TestMain() {
        setTitle("绘制图形");//设置窗体的标题
        setSize(400, 400);//设置窗体的大小

    }

    public static void main(String[] args) {
        TestMain testMain=new TestMain();
        testMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testMain.setLocationRelativeTo(null);
        testMain.setVisible(true);

        //将定义的DrawPanel对象添加到窗体


    }
}
