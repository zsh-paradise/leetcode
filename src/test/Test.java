package test;

import com.sensorsdata.analytics.javasdk.exceptions.InvalidArgumentException;
import net.sf.json.JSONObject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.sensorsdata.analytics.javasdk.SensorsAnalytics;
/**
 * Created by zsh_paradise on 2018/9/12.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //String SA_SERVER_URL = "http://brs.huijiaoyun.com:8044/behaviorManager/dataAcceptance/actOfAcc?project=default&token=bbb";
//
//        String SA_SERVER_URL = "http://localhost:8001/behaviorManager/dataAcceptance/actOfAcc?project=default&token=bbb";
//
//        SensorsAnalytics saHttp = new SensorsAnalytics(
//                new SensorsAnalytics.BatchConsumer(SA_SERVER_URL));
//        String anonymousId = "JKER1232JKJFD7217"; // 用户未登录时，可以使用神策前端 SDK 生成的匿名 id 来标识用户
//        // 匿名状态下的浏览商品事件
//
//        String registerId = "tes2t";
//
//        Map<String, Object> properties = new HashMap<String, Object>();
//        //把 IP 传递给 SA，SA 会自动根据这个解析国家、省份、城市
//        properties.put("$ip", "123.123.123.123");
//        // 商品 ID
//        properties.put("ProductId", "123456");
//        // 商品类别
//        properties.put("ProductCatalog", "Laptop Computer");
//        // 登录状态下的浏览商品事件
//        //sa.track(registerId, true, "viewProduct", properties);
//        saHttp.track(registerId, true, "viewProduct", properties);
//
//        properties.clear();
//        properties.put("$os", "Windows");         // 通过请求中的UA，可以解析出用户使用设备的操作系统是windows的
//        properties.put("$os_version", "8.1");     // 操作系统的具体版本
//        properties.put("$ip", "123.123.123.123");         // 请求中能够拿到用户的IP，则把这个传递给SA，SA会自动根据这个解析省份、城市
//        properties.put("OrderId", "SN_123_AB_TEST");   // 订单ID
//        properties.put("ShipPrice", 10.0);             // 运费
//        properties.put("OrderTotalPrice", 1234.0);         // 订单的总价格，默认是元
//        saHttp.track(registerId, true, "SubmitOrder", properties); // 注意，此时使用的已经是注册ID了
//
//        // 订单中手机这个商品的信息
//        properties.clear();
//        properties.put("$os", "Windows");         // 通过请求中的UA，可以解析出用户使用设备的操作系统是windows的
//        properties.put("$os_version", "8.1");     // 操作系统的具体版本
//        properties.put("$ip", "123.123.123.123");     // 请求中能够拿到用户的IP，则把这个传递给SA，SA会自动根据这个解析省份、城市
//        properties.put("OrderId", "SN_123_AB_TEST");  // 订单ID
//        properties.put("ProductName", "XX手机");    // 商品名称
//        properties.put("ProductType", "智能手机");   // 商品类别
//        properties.put("ShopName", "XX官方旗舰店");  // 店铺名称
//        properties.put("ProductUnitPrice", 1200.0);   // 商品单价
//        properties.put("ProductAmount", 1.0);         // 商品数量，可以是个数，也可以是重量
//        properties.put("ProductTotalPrice", 1200.0);  // 商品总价
//        saHttp.track(registerId, true, "SubmitOrderDetail", properties);
//
//        saHttp.flush();
//        saHttp.shutdown();
//        double i = 14, j=4 ;
//        System.out.println(Math.ceil((i/j)));
//        System.out.println(Math.floor(i/j));
//        System.out.println(i%j);
//        System.out.println(i/j);
        String s = "";
        System.out.println(s.length()==0);
        System.out.println(s.equals(""));
        int result = Integer.MAX_VALUE;
        }
        int[] arr = new int[]{1,2};


}
