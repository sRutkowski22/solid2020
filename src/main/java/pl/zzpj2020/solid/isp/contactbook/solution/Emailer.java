package pl.zzpj2020.solid.isp.contactbook.solution;

public class Emailer implements Email {

    private String emailAddress;
    Contact contact;

    public Emailer(String emailAddress, Contact contact){
        this.emailAddress=emailAddress;
        this.contact=contact;
    }

    @Override
    public String getEmailAddress() {
        return this.emailAddress;
    }

    @Override
    public void setAddressEmail(String email) {
        this.emailAddress=email;
    }

    public String getName(){
        return this.contact.getName();
    }
}
