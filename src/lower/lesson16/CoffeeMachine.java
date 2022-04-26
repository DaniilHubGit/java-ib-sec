package lower.lesson16;

public class CoffeeMachine {

    public Cup cup;

    protected CoffeePod coffeePod;

    private MilkTank milkTank;

    private WaterTank waterTank;

    private boolean isOn;

    private boolean isProgramInProgress;

    public CoffeeMachine() {
        this.isOn = false;
        this.isProgramInProgress = false;
        this.milkTank = new MilkTank();
        this.waterTank = new WaterTank();

    }
    //on button
    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean getIsOn(){
        return this.isOn;

    }


    public void setCoffeePod(CoffeePod coffeePod){
        if (this.isProgramInProgress) throw new IllegalStateException (" You cannot change the coffee pod right now");{
            this.coffeePod = coffeePod;
        }
    }

    public CoffeePod getCoffeePod(){
        return this.coffeePod;

    }


    public void coffeeProgram250ml() throws InterruptedException{

    
    
    }
}