package code.oswaldogh89.whatsapptemplate.objects;

/**
 * Created by oswaldogh89 on 16/09/15.
 */
public class Contact {
    private String name;
    private String phoneNumber;
    private String imgProfile;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getImgProfile() {
        return imgProfile;
    }
    public void setImgProfile(String imgProfile) {
        this.imgProfile = imgProfile;
    }

}
