package ct_gril;



import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class DrawCT_Girl_impl implements DrawCT_Girl{


    @Override
    public void activety(Graphics2D g2) throws Exception {
        //绘制矩形
        double leftX = 100;//定义开始绘制的坐标
        double topY = 100;
        double width = 200;//定义绘制宽度
        double height = 150;//定义绘制高度
        Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);//创建矩形对象
        g2.draw(rect);//将矩形对象绘制于Panel面板上
        //绘制椭圆
        Ellipse2D ellipse = new Ellipse2D.Double();//创建椭圆对象
        ellipse.setFrame(rect);//设置椭圆的绘制框架为上面的矩形（即与矩形内接）
        g2.draw(ellipse);//将椭圆对象绘制于Panel面板上
        //绘制线条
        Line2D line = new Line2D.Double(leftX, topY, leftX + width, topY + height);//创建线条对象（4个参数表示两个端点坐标）
        g2.draw(line);//将线条对象绘制于Panel面板上
        //绘制圆
        double centerX = rect.getCenterX();//定义圆心坐标（以矩形的中心为圆心）
        double centerY = rect.getCenterY();
        double radius = 150;//定义圆的半径
        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);//设置圆形的绘制框架（4个参数表示中心点坐标和角点坐标）
        g2.draw(circle);//将圆形对象绘制于Panel面板上
    }

    @Override
    public void smile(Graphics2D g2) throws Exception {
        //绘制矩形
        double leftX = 100;//定义开始绘制的坐标
        double topY = 100;
        double width = 200;//定义绘制宽度
        double height = 150;//定义绘制高度
        Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);//创建矩形对象
        g2.draw(rect);//将矩形对象绘制于Panel面板上
        //绘制椭圆
        Ellipse2D ellipse = new Ellipse2D.Double();//创建椭圆对象
        ellipse.setFrame(rect);//设置椭圆的绘制框架为上面的矩形（即与矩形内接）
        g2.draw(ellipse);//将椭圆对象绘制于Panel面板上

    }


    @Override
    public void run_CT_Girl(final RunMain runMain) throws Exception {
        final Runnable begin=new Runnable() {
            @Override
            public void run() {
                while (true){
                    for(int i=0;i<time;i++){
                        try {
                            System.out.println(i);
                            if(i==0){
                                runMain.repaint();
                                CT_Girl_JPanel_activety panel = new CT_Girl_JPanel_activety();
                                runMain.add(panel);
                            }else if(i==time-1){
                                runMain.repaint();
                                CT_Girl_JPanel_smile panel = new CT_Girl_JPanel_smile();
                                runMain.add(panel);
                            }
                        }catch (Exception e){
                            e.printStackTrace();
                        }

                    }
                }
            }
        };
        Thread thread=new Thread(begin,"启动CT_Girl");
        thread.start();
    }
}

