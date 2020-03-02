package objecttype.structural.Facade.Example1;

public class Fund {
    Stock1 gu1;
    Stock2 gu2;
    Stock3 gu3;
    NationalDebt1 nd1;
    Realty1 rt1;

    public Fund() {
        this.gu1 = new Stock1();
        this.gu2 = new Stock2();
        this.gu3 = new Stock3();
        this.nd1 = new NationalDebt1();
        this.rt1 = new Realty1();
    }

    public void buyFund(){
        gu1.buy();
        gu2.buy();
        gu3.buy();
        nd1.buy();
        rt1.buy();
    }

    public void sellFund(){
        gu1.sell();
        gu2.sell();
        gu3.sell();
        nd1.sell();
        rt1.sell();
    }
}
