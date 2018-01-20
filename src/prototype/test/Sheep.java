package prototype.test;

import java.util.Date;

public class Sheep implements Cloneable {
    private String name;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }


    public Sheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep) super.clone();
        sheep.birthday = (Date) birthday.clone();
        return sheep;
    }

}
