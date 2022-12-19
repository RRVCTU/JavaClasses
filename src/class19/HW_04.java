package class19;
/*
Write program: userClass that has a constructor that initializes instance variable name and mobile number.
Create a subclass userInfo that will have user address variable and it also being initialized through
constructor call. Print users name, mobile number and address in userDetails method. Test your code.
 */
public class HW_04 {
    public static void main(String[] args) {
        userInfo userObj = new userInfo("Josh", 123456789, "Earth");
        userObj.userDetail();
    }
}

class userClass{
    String name;
    int mobileNumber;
}

class userInfo extends userClass{
    String address;

    userInfo(String name, int mobileNumber, String address) {
        super.name = name;
        super.mobileNumber = mobileNumber;
        this.address = address;
    }

    void userDetail() {
        System.out.println("Name: "+name+" Mobile Number: "+mobileNumber+" Address: "+address);
    }
}
