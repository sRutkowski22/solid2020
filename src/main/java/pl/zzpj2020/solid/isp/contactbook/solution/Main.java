package pl.zzpj2020.solid.isp.contactbook.solution;

public class Main {

    public static void main(String[] args) {
        Contact contact = new Contact("Szymon");
        Dialler dialler = new Dialler("123 456 789", contact);
        Emailer emailer = new Emailer("rodo@gmail.com", contact);
        System.out.println(emailer.getEmailAddress());
        System.out.println(dialler.getTelephone());
        System.out.println(dialler.getName());
        System.out.println(emailer.getName());

    }
}
