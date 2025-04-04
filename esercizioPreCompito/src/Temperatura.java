public class Temperatura {
    protected double valoreCelsius;

    /**
     * Costruisce un'oggetto temperatura a partire da un valore in gradi celsius
     * @param valoreCelsius
     */
    public Temperatura(double valoreCelsius) {
        this.valoreCelsius = valoreCelsius;
    }
    
    /**
     * Restituisce il valore attuale della temperatura in gradi Celsius.
     * @return il valore della temperatura in gradi celsius
     */
    public double getValoreCelsius() {
        return valoreCelsius;
    }

    /**
     * assegna un valore in gradi celsius alla temperatura
     * @param valoreCelsius
     */
    public void setValoreCelsius(double valoreCelsius) {
        this.valoreCelsius = valoreCelsius;
    }

    /**
     * aumenta il valore della temperatura 
     * @param val
     */
    public void aumenta(double val){
        this.valoreCelsius = this.valoreCelsius + val;
    }

    /**
     * diminuisce il valore della temperatura
     * @param val
     */
    public void diminuisci(double val){
        this.valoreCelsius = this.valoreCelsius - val;
    }

    /**
     * 
     * @return il valore in kelvin della temperatura
     */
    public double inKelvin(){
        double Kelvin = this.valoreCelsius;
        Kelvin = 274.15 * this.valoreCelsius;
        return Kelvin;
    }
    
    /**
     * 
     * @return il valore della temperatura in Fahrenheit
     */
    public double inFahrenheit(){
        double valFahrenheit = this.valoreCelsius;
        valFahrenheit = 33.8 * this.valoreCelsius;
        return valFahrenheit;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String s ="Temperatura: " + this.valoreCelsius + "°C " + this.inFahrenheit() + "°F " + this.inKelvin() + "°K";
        return s;
    }
}
