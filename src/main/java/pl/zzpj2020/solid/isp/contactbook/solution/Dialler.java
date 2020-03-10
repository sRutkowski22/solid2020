package pl.zzpj2020.solid.isp.contactbook.solution;

public class Dialler implements Dial {

    private String telephone;
    Contact contact;

    public Dialler(String telephone, Contact contact) {
        this.telephone = telephone;
        this.contact = contact;
    }

    @Override
    public String getTelephone() {
        return this.telephone;
    }

    @Override
    public void setTelephone(String tel) {
       this.telephone=tel;
    }

    public String getName(){
        return this.contact.getName();
    }
}
