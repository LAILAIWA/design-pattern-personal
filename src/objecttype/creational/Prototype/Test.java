package objecttype.creational.Prototype;

import objecttype.creational.Prototype.Example1.Resume;
import objecttype.creational.Prototype.Example2.ResumeCloneable;

public class Test {
    public static void main(String[] args) {
        //构建简历，可以设置基本信息和工作经历等
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男","29");
        a.setWorkExperience("1998-2000", "XX公司");

        Resume b = new Resume("大鸟");
        b.setPersonalInfo("男","29");
        b.setWorkExperience("1998-2000", "XX公司");

        Resume c = new Resume("大鸟");
        c.setPersonalInfo("男","29");
        c.setWorkExperience("1998-2000", "XX公司");

        a.display();
        b.display();
        c.display();


        //原型模式
        System.out.println("---------------------原型模式");
        ResumeCloneable aNew = new ResumeCloneable("大鸟");
        aNew.setPersonalInfo("男","29");
        aNew.setWorkExperience("1998-2000", "XX公司");

        ResumeCloneable bNew = (ResumeCloneable) aNew.clone();
        bNew.setWorkExperience("1998-2006", "XX公司");

        ResumeCloneable cNew = (ResumeCloneable) aNew.clone();
        cNew.setPersonalInfo("男","24");

        aNew.display();
        bNew.display();
        cNew.display();

        //这样的实现仅仅是浅克隆，对于对象属性域需要更改结构为深克隆
    }
}
