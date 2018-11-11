package ru.yu_go.model;

public class ContactData {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String nickName;
    private final String title;
    private final String company;
    private final String address;
    private final String home;
    private final String mobile;
    private final String worck;
    private final String fax;
    private final String email;
    private final String email1;
    private final String address2;
    private final String phone2;
    private final String notes;
    private final String bdate;
    private final String month;
    private final String year;
    private String group;

    public ContactData(String firstName, String middleName, String lastName, String nickName, String title, String company, String address, String home, String mobile, String worck, String fax, String email, String email1, String address2, String phone2, String notes, String bdate, String month, String year, String group) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.title = title;
        this.company = company;
        this.address = address;
        this.home = home;
        this.mobile = mobile;
        this.worck = worck;
        this.fax = fax;
        this.email = email;
        this.email1 = email1;
        this.address2 = address2;
        this.phone2 = phone2;
        this.notes = notes;
        this.bdate = bdate;
        this.month = month;
        this.year = year;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHome() {
        return home;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWorck() {
        return worck;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail1() {
        return email1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getPhone2() {
        return phone2;
    }

    public String getNotes() {
        return notes;
    }
    public String getBdate() {
        return bdate;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getGroup() {
        return group;
    }
}
