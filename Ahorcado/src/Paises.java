class Paises {
    private String[] paises;

    public Paises() {
        this.paises = new String[] {
            "Argentina", "Brasil", "Chile", "Colombia", "Perú", "Venezuela",
            "Uruguay", "Paraguay", "Bolivia", "Ecuador", "México", "Cuba",
            "República Dominicana", "Honduras", "Guatemala", "El Salvador",
            "Nicaragua", "Costa Rica", "Panamá"
        };
    }
    public String[] getPaises() {
        return paises;
    }
    public void setPaises(String[] paises) {
        this.paises = paises;
    }
    public String ranPais(){
        int randomIndex = (int) (Math.random() * paises.length);
        return paises[randomIndex];
    }
}