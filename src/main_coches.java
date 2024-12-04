public class main_coches {
    public static void main(String[] args) {
        coche c1 ,c2 ,c3, c4;
        c1 = new coche();
        c2 = new coche("matricula");
        c3 = new coche("1234JMV","Renault","clio",2022,true);
        c4 = new coche(c3);

        System.out.println(c1.datos());
        System.out.println(c2.datos());
        System.out.println(c3.datos());
        System.out.println(c4.datos());


    }
}
