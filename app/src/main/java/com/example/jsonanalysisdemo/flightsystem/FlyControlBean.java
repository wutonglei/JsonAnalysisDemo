package com.example.jsonanalysisdemo.flightsystem;


/**
 * 文档里没给出数值范围
 *JoyControlMaxSpeed 0-15
 * verticalJoyControlMaxSpeed 0-4
 * 前进 roll = rollJoyControlMaxSpeed * step
 * 后退 roll = -rollJoyControlMaxSpeed * step
 * 左移  pitch = -pitchJoyControlMaxSpeed * step
 * 右移 pitch = pitchJoyControlMaxSpeed * step
 *
 * 左转 yaw = -yawJoyControlMaxSpeed * step
 * 右转  yaw = yawJoyControlMaxSpeed * step
 * 上升  throttle = verticalJoyControlMaxSpeed * step
 * 下降throttle = -verticalJoyControlMaxSpeed * step


 亮度范围 2-11
 0为设置自动调整亮度
 flightController?.rollPitchCoordinateSystem = FlightCoordinateSystem.BODY
 * 坐标 按地面  按飞机机身
 *
 */
public class FlyControlBean {
    @Override
    public String toString() {
        return "FlyControlBean{" +
                "roll=" + roll +
                ", pitch=" + pitch +
                ", yaw=" + yaw +
                ", throttle=" + throttle +
                ", isBody=" + isBody +
                '}';
    }

    public float roll;
    public  float pitch;
    public  float yaw;
    public  float throttle;
    public boolean isBody;
}
