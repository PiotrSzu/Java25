package builder;

public class Pizza {
    private String ciasto;
    private String składnik;
    private String sos;

    private boolean biała;
    private boolean ostra;

    public String getCiasto() {
        return ciasto;
    }

    public String getSkładnik() {
        return składnik;
    }

    public String getSos() {
        return sos;
    }

    public boolean isBiała() {
        return biała;
    }

    public boolean isOstra() {
        return ostra;
    }

    private Pizza(PizzaBuilder builder) {
        this.ciasto = builder.ciasto;
        this.składnik = builder.składnik;
        this.sos = builder.sos;
        this.biała = builder.biała;
        this.ostra = builder.ostra;
    }

    @Override
    public String toString() {
        return "PizzaBuilder{" +
                "ciasto='" + ciasto + '\'' +
                ", składnik='" + składnik + '\'' +
                ", sos='" + sos + '\'' +
                ", biała=" + biała +
                ", ostra=" + ostra +
                '}';
    }
    public static class PizzaBuilder{
        private String ciasto;
        private String składnik;
        private String sos;

        private boolean biała;
        private boolean ostra;

        public PizzaBuilder(String ciasto, String składnik, String sos) {
            this.ciasto = ciasto;
            this.składnik = składnik;
            this.sos = sos;
        }

        public PizzaBuilder setBiała(boolean biała) {
            this.biała = biała;
            return this;
        }

        public PizzaBuilder setOstra(boolean ostra) {
            this.ostra = ostra;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
