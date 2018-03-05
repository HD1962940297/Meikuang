package hdd.com.meikuang;

import cn.bmob.v3.BmobUser;

public class info extends BmobUser {
    private String age;
    private String address;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
