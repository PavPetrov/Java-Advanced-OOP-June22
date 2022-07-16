package p08_Inheritance.p06_Animals;

public class Tomcat extends Cat{
    private static final String TOMCAT_GENDER = "Male";

    public Tomcat(String name, int age) {
        super(name, age, TOMCAT_GENDER);
    }

    public String produceSound(){
        return "MEOW";
    }
}
