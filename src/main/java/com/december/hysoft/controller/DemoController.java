package com.december.hysoft.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.december.hysoft.utils.PubResp;
import com.december.hysoft.utils.RespEntity;
import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.axis.Axis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.AxisType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2018/12/13.
 */
@RequestMapping(value = "/demo")
public class DemoController {
    @ResponseBody
    @RequestMapping(value = "/test1",method = {RequestMethod.POST})
    public String getTest1(HttpServletRequest request, @RequestParam(value = "type") String type,@RequestParam(value = "axis")String axis){
        Option option = new Option();

        //判断类型
        if(null != type && "bar".equals(type)){
            List<Axis> axes = JSONObject.parseArray(axis,Axis.class);

            System.out.println(axes.get(0));
        }
//        option.xAxis(new Axis[]);
        return "";
    }

    public static void main(String[] args){
        Axis s  = new ValueAxis();
        String[] a = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        s.setData(Arrays.asList(a));
        s.setType(AxisType.category);
        System.out.println(JSON.toJSONString(s));
    }

}
