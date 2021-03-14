package third_week;

class Employe{
    private int id;
    private String imie;
    private int wiek;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return imie;
    }
    public void setName(String name){
        this.imie = name;
    }
    public int getAge(){
        return wiek;
    }
    public void setAge(int age){
        this.wiek =age;
    }
}
public class privateExample {
    public static void main(String[] args) {

        Employe e = new Employe();
        e.setId(101);
        e.setName("Jacek");
        e.setAge(25);
        System.out.println("ID: "+ e.getId() + " " +"Imię: "+ e.getName() + " " +"Wiek: "+ e.getAge());
    }
}