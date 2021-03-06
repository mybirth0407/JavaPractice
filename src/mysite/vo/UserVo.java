package mysite.vo;

public class UserVo {
    private Long no;
    private String name;
    private String email;
    private String passwd;
    private String gender;

    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "UserVo{" +
            "no=" + no +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", passwd='" + passwd + '\'' +
            ", gender='" + gender + '\'' +
            '}';
    }
}
