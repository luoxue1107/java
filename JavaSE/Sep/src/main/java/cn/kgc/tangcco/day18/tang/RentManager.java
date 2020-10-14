package cn.kgc.tangcco.day18.tang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 李庆华
 * @Description
 * @date 2020/9/18 10:12
 */
public class RentManager {
    private static RentManager instance = new RentManager();

    public static RentManager getInstance() {
        return instance;
    }

    private Scanner input = new Scanner(System.in);
    /**
     * 所有设备数组
     */
    private List<Device> devices = new ArrayList<Device>();

    /**
     * 初始值
     */ {
        devices.add(new UsbDisk(100, 100, "容量1T", 1.48));
        devices.add(new UsbDisk(100, 100, "容量512G", 1));
        devices.add(new UsbDisk(100, 100, "容量256G", 0.88));
        devices.add(new UsbDisk(100, 100, "容量低于256G", 0.5));
        devices.add(new Computer(100, 100, "联想13.9英寸超轻薄翻转笔记本", 10));
        devices.add(new Computer(100, 100, "小米15.6英寸金属轻薄笔记本", 8.8));
        devices.add(new Computer(100, 100, "惠普小欧14英寸笔记本", 5));
        devices.add(new Computer(100, 100, "其他型号笔记本", 4));
    }

    /**
     * 出租设备数组
     */
    private List<RentDevice> rentDevices = new ArrayList<RentDevice>();

    /**
     * 查看物品
     */
    public void show() {
        devices.forEach(device -> {
            System.out.print((devices.indexOf(device) + 1) + "\t");
            device.showInfo();
        });
        //            if (device instanceof Computer){
//                ((Computer)device).showInfo();
//            }else  if (device instanceof UsbDisk){
//                ((UsbDisk)device).showInfo();
//            }

    }

    public void showRentDevices() {
        if (rentDevices.size() > 0) {

            rentDevices.forEach(RentDevice -> {
                System.out.print((rentDevices.indexOf(RentDevice) + 1) + "\t");
                RentDevice.show();
            });
        } else {
            System.out.println("空空如也");
        }
    }

    public String rent(int index, String studentId) {
        String str = "";
        if (studentId != null) {
            Device device = devices.get(index - 1);
            rentDevices.add(new RentDevice(studentId, device));
            device.setResidue(devices.get(index - 1).getResidue() - 1);

            if (device instanceof Computer) {
                str = ((Computer) device).getType();
            } else if (device instanceof UsbDisk) {
                str = ((UsbDisk) device).getType();
            }
            return "租用成功" + studentId + "租用的是:" + str;
        }
        return "有误";
    }


    public boolean giveBack(int index, int days) {
        if (days > 0 && index <= rentDevices.size()) {
            Device device = rentDevices.get(index - 1).getDevice();
            if (device instanceof Computer) {

                for (Device d : devices) {

                    String type = "";
                    if (d instanceof Computer) {
                        type = ((Computer) d).getType();
                    }
                    String type1 = ((Computer) device).getType();
                    if (type.equals(type1)) {
                        d.setResidue(d.getResidue() + 1);
                        System.out.println("归还成功，" + rentDevices.get(index - 1).getStudentId() +
                                "你好，你的租用的是:" + ((Computer) device).getType() + "\n"
                                + days + "天的租金共:" + device.calcRent(days) + "元");

                        rentDevices.remove(index - 1);
                        return true;

                    }
                }

            } else if (device instanceof UsbDisk) {
                for (Device d : devices) {
                    String type = "";
                    if (d instanceof UsbDisk) {
                        type = ((UsbDisk) d).getType();
                    }
                    String type1 = ((UsbDisk) device).getType();
                    if (type.equals(type1)) {
                        d.setResidue(d.getResidue() + 1);

                        System.out.println("归还成功，" + rentDevices.get(index - 1).getStudentId() +
                                "你好，你的租用的是:" + ((UsbDisk) device).getType() + "\n"
                                + days + "天的租金共:" + ((UsbDisk) device).calcRent(days) + "元");
                        rentDevices.remove(index - 1);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
