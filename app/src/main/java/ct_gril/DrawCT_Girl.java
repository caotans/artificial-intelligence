package ct_gril;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-9-4
 * Time: 下午2:37
 * To change this template use File | Settings | File Templates.
 */
public interface DrawCT_Girl  {
    public final static int time=2000;
    //活动
    public void activety(Graphics2D g2)throws Exception;
    //笑
    public void smile(Graphics2D g2)throws Exception;

    public void run_CT_Girl(CT_Girl_JFrame ct_girl_jFrame) throws Exception;


}
