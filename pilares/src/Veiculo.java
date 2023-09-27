public abstract class Veiculo {
    public String chassi;
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    /* Abstração */
    public abstract void ligar();
}
