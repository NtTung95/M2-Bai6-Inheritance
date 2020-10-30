public class Human {
    private String name;
    void setName(String name){this.name = name; }
    String getName(){ return this.name;}
    String sua(){ return "ABC";}
    String adress (){return "TG";}

}
class HumanVN extends Human {
    String noi (){return "CBA";}
    String sua(){return"VN";}
}
class main{
    public static void main(String[] args) {
        Human h1 = new HumanVN();
        System.out.println(h1.sua());
    }
}
