package Java_Core.BasicCode;

public class TemperatureCheck {
    private double temperature;

    public void setTemperature(double temp){
        this.temperature = temp;
    }
    public String temperatureCondition(){
double celsius = (this.temperature-32.0)*(5.0/9.0);
        System.out.println("check celsiue"+celsius +" " +this.temperature+" ");
        System.out.printf("Temperature in celsius %.2fC%n", celsius);
if(celsius<0.0){
    return "Freezing";
}
else if(celsius<=15.0){
    return "Cold";
}
else if(celsius<=30.0){
    return "Moderate";
}
else{
    return "Hot";
}

//return null;"+celsius +" " +this.temperature);
    }
}
