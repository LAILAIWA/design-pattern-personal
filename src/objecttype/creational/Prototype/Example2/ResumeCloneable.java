package objecttype.creational.Prototype.Example2;

public class ResumeCloneable extends ICloneable {
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public ResumeCloneable(String name) {
        this.name = name;
    }

    public ResumeCloneable(String name, String sex, String age, String timeArea, String company) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.timeArea = timeArea;
        this.company = company;
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

    @Override
    public Object clone() {
        return (Object) this.memberwiseClone();
    }
    private ResumeCloneable memberwiseClone(){
        //创建一个新的对象，然后将当前对象的非静态字段复制到该新对象。
        //如果字段是值类型的，则对该字段执行逐位复制。
        //如果字段是引用类型，则复制引用但不复制引用的对象；
        //因此，原始对象及其副本引用同一对象
        return new ResumeCloneable(this.name,this.sex,this.age,this.timeArea,this.company);
    }
}