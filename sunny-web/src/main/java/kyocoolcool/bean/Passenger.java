package kyocoolcool.bean;

import java.util.Objects;

/**
 * @ClassName Passenger
 * @Description 旅客類別
 * @Author Chris Chen
 * @Date 2019-08-29 14:46
 * @Version 1.0
 **/

public class Passenger {
    private String name;
    private Integer age;

    public Passenger() {
    }

    public Passenger(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(name, passenger.name) &&
                Objects.equals(age, passenger.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}