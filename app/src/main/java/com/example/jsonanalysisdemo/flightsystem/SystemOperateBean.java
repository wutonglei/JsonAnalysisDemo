package com.example.jsonanalysisdemo.flightsystem;


public class SystemOperateBean {
    /**
     * action_takeoff
     * action_down
     * action_take_phone
     * action_start_record
     * action_stop_record
     *
     * change_bright
     *
     * control_fly
     *
     */
    public String operate;

    //  飞行的数据
    public String message;

    //    亮度
    public int number;

    @Override
    public String toString() {
        return "SystemOperateBean{" +
                "operate='" + operate + '\'' +
                ", message='" + message + '\'' +
                ", number=" + number +
                '}';
    }
}

