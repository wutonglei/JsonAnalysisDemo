package com.example.jsonanalysisdemo

import android.util.Log
import com.alibaba.fastjson.JSON
import com.example.jsonanalysisdemo.flightsystem.FlyControlBean
import com.example.jsonanalysisdemo.flightsystem.SystemOperateBean
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

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
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        var system = SystemOperateBean()
        system.operate = "action_takeoff"
        system.number = 12
        system.message = "{\"isBody\":true,\"pitch\":3.5,\"roll\":3.5,\"throttle\":3.5,\"yaw\":3.5}"

        val string: String = JSON.toJSONString(system)


        println("$string")

        val healthBean: SystemOperateBean = JSON.parseObject(string, SystemOperateBean::class.java)
        println(healthBean)
        val flyControlBean: FlyControlBean = JSON.parseObject(healthBean.message, FlyControlBean::class.java)
        println(flyControlBean)

        /**  已经是这样的表现了
         * {{"number":0,"operate":"action_takeoff"}}  //已经能解析这样的了
        SystemOperateBean{operate='action_takeoff', message='null', number=0.0} // 这个是自己打印的
         */

//        var flyControlBean = FlyControlBean()
//        flyControlBean.isBody = true
//        flyControlBean.pitch = 3.5f
//        flyControlBean.throttle = 3.5f
//        flyControlBean.roll = 3.5f
//        flyControlBean.yaw = 3.5f
//        val flyControl: String = JSON.toJSONString(flyControlBean)
//        println("$flyControl")


    }


}