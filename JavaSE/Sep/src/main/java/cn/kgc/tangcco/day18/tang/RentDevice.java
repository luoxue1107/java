package cn.kgc.tangcco.day18.tang;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/18 9:39
 */
@Setter
@Getter
@NoArgsConstructor
public class RentDevice {
    /**
     * 学号
     */
    private String studentId;

    /**
     * 设备对象
     */
    private Device device;


    /**
     * 租用信息
     */
    public void show() {
        if (device instanceof Computer){
            System.out.println("租用人学号:"+studentId+"物品信息:"+((Computer)device).getType());
        }else  if (device instanceof UsbDisk){
            System.out.println("租用人学号:"+studentId+"物品信息:"+((UsbDisk) device).getType());
        }
    }

    public RentDevice(String studentId,Device device) {
        this.studentId = studentId;
        this.device=device;
    }
}
