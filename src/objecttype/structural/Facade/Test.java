package objecttype.structural.Facade;

import objecttype.structural.Facade.Example1.*;

public class Test {
    public static void main(String[] args) {

        Stock1 gu1 = new Stock1();
        Stock2 gu2 = new Stock2();
        Stock3 gu3 = new Stock3();
        NationalDebt1 nd1 = new NationalDebt1();
        Realty1 rt1 = new Realty1();

        gu1.buy();
        gu2.buy();
        gu3.buy();
        nd1.buy();
        rt1.buy();

        gu1.sell();
        gu2.sell();
        gu3.sell();
        nd1.sell();
        rt1.sell();

        //客户不需要一个个股票去了解和买卖，只要购买基金即可，具体买卖由基金公司完成
        Fund jijin = new Fund();
        jijin.buyFund();
        jijin.sellFund();

    }
}
