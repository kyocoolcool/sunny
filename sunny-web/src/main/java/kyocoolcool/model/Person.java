package kyocoolcool.model;

/**
 * @ClassName Person
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-08-29 16:33
 * @Version 1.0
 **/

public class Person {
        private String name;
        private Integer age;
        public Person()  {
            super();
        }
        public Person(String name,Integer gae) {
            super();
            this.name=name;
            this.age=gae;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name=name;
        }
        public Integer getAge() {
            return age;
        }

        public Integer setAge(Integer age) {
            return age;
        }
}