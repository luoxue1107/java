import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

public class t18 {
    public static void main(String[] args) throws AWTException {

        String sentence = "������������";//����Ҫ���͵Ļ�

        //��������Ϊ�������ַ����ŵ����а��ڣ��൱������һ�θ��Ʋ���
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable tText = new StringSelection(sentence);
        clip.setContents(tText, null);


        Robot robot = new Robot();//����Robot����
        robot.delay(3000);//�ӳ����룬��Ҫ��Ϊ��Ԥ�����򿪴��ڵ�ʱ�䣬�����ڵĵ�λΪ����
        for (int i = 1; i <= 10; i++) {//ѭ��ʮ�Σ���Ȼ��������������ѭ��Ҳû����

            //�������а�����ctrl+v�����ճ������
            robot.keyPress( KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_CONTROL);//�ͷ�ctrl��������ctrl���˸����ɾ���������Ĺ����԰������ڰ��º�һ��Ҫ�ͷţ���Ȼ������⡣crtl�����סû���ͷţ��ڰ�������ĸ�����ǣ��ó����Ļ���ctrl�Ŀ�ݼ���
            robot.delay(3000);//�ӳ�һ���ٷ��ͣ���Ȼ��һ����ȫ������ȥ����Ϊ���ԵĴ����ٶȺܿ죬ÿ��ճ�����͵��ٶȼ�����һ˲�䣬���Ը��˵ĸо�����һ���Է�����ȫ�������ʱ������Լ��ģ��뼸�뷢��һ��������
            robot.keyPress( KeyEvent.VK_ENTER);//�س�
        }
    }
}

