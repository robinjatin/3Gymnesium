package fitness.model;

import org.springframework.data.annotation.Id;

public class Person {
    @Id
    String id;

    String firstName,eMail;
    int age;
    String password;
    String number;

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    String plan;
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person(String firstName, String eMail, int age,String password, String number, String plan) {
        this.firstName = firstName;
        this.eMail = eMail;
        this.age = age;
        this.password=password;
        this.number=number;
        this.plan=plan;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}