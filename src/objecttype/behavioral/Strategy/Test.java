package objecttype.behavioral.Strategy;

import objecttype.behavioral.Strategy.Example1.*;
import objecttype.behavioral.Strategy.Example2.CashContext;
import objecttype.behavioral.Strategy.Example2.CashContextRevision;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //实现根据客户所购买商品的单价和数量对客户收费
        System.out.println("--------------------1.直接核算");
        double total = 0.0;
        //获取界面商品价格
        String textPrice = "2.5";
        //获取界面商品数目
        String txtNum = "300";
        //计算总价格
        double totalPrices = btnOk_click(textPrice,txtNum);
        total += totalPrices;
        System.out.println("单价：" + textPrice + "，数量：" + txtNum);
        System.out.println(" 合计："  + totalPrices);

        //新增需求要对商品打折
        System.out.println("--------------------2.新增打折策略");
        //选择打折策略
        String type = form1_load().get(3);
        //计算总价格
        double totalPrices_discount = btnOk_click_discount(textPrice,txtNum,type);
        System.out.println("单价：" + textPrice + "，数量：" + txtNum+ "，打折策略：" + type);
        System.out.println(" 合计："  + totalPrices_discount);

        //根据简单工厂模式改写
        System.out.println("--------------------3.简单工厂模式实现");
        //实现内容于Example1
        List<String> types = Arrays.asList("正常收费","满300返100","八折");
        System.out.println("单价：" + textPrice + "，数量：" + txtNum);
        double totalPrices_example1 = btnOk_click(textPrice,txtNum);
        for(String type_example1 : types){
            Charging charging = ChargingFactory.createCharging(type_example1);
            System.out.println("策略："  + type_example1);
            double totalPrices_value_example1 = charging.charge(totalPrices_example1);
            System.out.println(" 合计："  + totalPrices_value_example1);
        }

        //简单工厂模式只是解决了对象创建的变更问题，而对于打折力度和返利条件这些变更却无法应对

        //策略模式结构参考包Struct
        System.out.println("--------------------4.策略模式实现");
        //实现内容于Example2
        List<String> types_example2 = Arrays.asList("正常收费","满300返100","八折");
        System.out.println("单价：" + textPrice + "，数量：" + txtNum);
        double totalPrices_example2 = btnOk_click(textPrice,txtNum);
        for(String type_example2 : types_example2){
            CashContextRevision context = new CashContextRevision(type_example2);//和简单工厂模式的区别在消除了客户端和实现算法的耦合，只须关注context
            System.out.println("策略："  + type_example2);
            double totalPrices_value_example2 = context.getResult(totalPrices_example2);
            System.out.println(" 合计："  + totalPrices_value_example2);
        }
    }

    //点击OK按钮，获取当前商品总价格
    private static double btnOk_click(String textPrice, String txtNum){
        return Double.parseDouble(textPrice) * Double.parseDouble(txtNum);
    }

    //点击打折策略，获取可选策略
    private static List<String> form1_load(){
        return Arrays.asList("正常价格","八折","七折","六折");
    }

    private static double btnOk_click_discount(String textPrice, String txtNum, String type){
        double discount_parm = 0.0;
        switch (type){
            case "正常价格":
                discount_parm = 1.0;
                break;
            case "八折":
                discount_parm = 0.8;
                break;
            case "七折":
                discount_parm = 0.7;
                break;
            case "六折":
                discount_parm = 0.6;
                break;
        }
        return Double.parseDouble(textPrice) * Double.parseDouble(txtNum) * discount_parm;
    }

    //根据策略模式实现，可以通过将switch模块转移到Context构造器实现选择具体策略由客户端控制转移到Context控制，即结合了策略和工厂模式
    private static double btnOk_click_strategy(String textPrice, String txtNum, String type){
        CashContext context = null;
        switch (type){
            case "正常收费":
                context = new CashContext(new NormalCharging());
                break;
            case "满300返100":
                context = new CashContext(new CashReturnCharging(300,100));
                break;
            case "八折":
                context = new CashContext(new DiscountCharging(0.8));
                break;
        }
        return context.getResult(Double.parseDouble(textPrice) * Double.parseDouble(txtNum));
    }
}
