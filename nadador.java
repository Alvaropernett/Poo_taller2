interface nadador {
    void nadar ();
}
 class delfin implements nadador{
    @Override
    public void nadar () {
        System.out.println("el delfin sabe nadar  ");
    }
 }