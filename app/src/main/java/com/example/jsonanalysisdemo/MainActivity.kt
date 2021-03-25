package com.example.jsonanalysisdemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.fastjson.JSON

class MainActivity : AppCompatActivity() {
    private  val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val json="{ \"code\": \"0\", \"msg\": \"SUCCESS\", \"data\": { \"total\": 3, \"pageNo\": 1, \"pageSize\": 1, \"list\": [ { \"indexCode\": \"df8w8cr800283c24c\", \"resourceType\": \"camera\", \"externalIndexCode\": \"gb1231341\", \"name\": \"资源1\", \"chanNum\": 1, \"cascadeCode\": \"8w8cy82c084y0289c3\", \"parentIndexCode\": \"80d9099q9e991231\", \"longitude\": 5, \"latitude\": 5, \"elevation\": \"12\", \"cameraType\": 1, \"capability\": \"vss\", \"recordLocation\": \"12\", \"channelType\": \"analog\", \"regionIndexCode\": \"d8a5476e-25c0-4aa2-b7e3-db3788ba1f77\", \"regionPath\": \"@root000000@\", \"transType\": 0, \"treatyType\": \"hiksdk_net\", \"installLocation\": \"vault\", \"createTime\": \"2018-11-28T16:47:27:358+08:00\", \"updateTime\": \"2018-11-28T16:48:34:011+08:00\", \"disOrder\": 433, \"resourceIndexCode\": \"a13a1e641ed841a2bd7567e5d00235d2\", \"decodeTag\": \"hikvision\", \"cameraRelateTalk\": \"bf097a5a30634db3b3c4a797c66e4a14\", \"regionName\": \"@root000000@22c61b3e-7fea-46ed-89c4-b310d9fd9fe7@\", \"regionPathName\": \"根节点/global_setUp_02178\" } ] } }"
        val healthBean: TestBean = JSON.parseObject(json, TestBean::class.java)

        Log.i(TAG, "onCreate: ${healthBean.toString()}")

        //bean 转 json

        //bean 转 json

        val string: String =   JSON.toJSONString(healthBean)
        Log.i(TAG, "onCreate java 2 json: $string")

//        正常的json解析
    }
}