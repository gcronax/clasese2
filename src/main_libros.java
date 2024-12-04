public class main_libros {
    public static void main(String[] args) {
        libro l1,l2;
        l1=new libro("prueba1",111111,"autor1",6);
        l2=new libro("prueba2",222222,"autor1",8);
        System.out.println(l1.datos());
        System.out.println(l2.datos());

        if (l1.getN_pag()<l2.getN_pag()){
            System.out.println(l2.getTitulo()+" tiene mas paginas");
        }else System.out.println(l1.getTitulo()+" tiene mas paginas");

    }
}
