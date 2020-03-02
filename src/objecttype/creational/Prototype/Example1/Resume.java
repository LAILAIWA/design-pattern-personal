package objecttype.creational.Prototype.Example1;

public class Resume {
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    //设置个人信息
    public void setPersonalInfo(String sex,String age){
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void setWorkExperience(String timeArea, String company){
        this.timeArea = timeArea;
        this.company = company;
    }

    //显式
    public void display(){
        System.out.println("{" + name + "} {" + sex + "} {" + age + "}");
        System.out.println("工作经历：{" + timeArea + "} {" + company + "}");
    }
}
