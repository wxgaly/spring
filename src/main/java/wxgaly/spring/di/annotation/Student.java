package wxgaly.spring.di.annotation;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author WXGALY
 * @ClassName Student
 * @Description TODO
 * @Date 2018-05-09 23:42
 * @Version 1.0
 */
public class Student {

    private Integer age;
    private String name;

    @Required
    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}