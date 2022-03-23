package be.intecbrussel;

public class Car  {
    private int numberOfWheels;
    private boolean workingMotor;
    private int radioStation;

    public Car(int numberOfWheels, boolean workingMotor, int radioStation) {
        this.numberOfWheels = numberOfWheels;
        this.workingMotor = workingMotor;
        this.radioStation = radioStation;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) throws Exception {
        if (numberOfWheels<4)throw new Exception("Too few wheels for a car");

        if(numberOfWheels>4)throw new MyExceptions("Too many Wheels");
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isWorkingMotor() {
        return workingMotor;
    }

    public void setWorkingMotor(boolean workingMotor) {
        this.workingMotor = workingMotor;
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        this.radioStation = radioStation;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfWheels=" + numberOfWheels +
                ", workingMotor=" + workingMotor +
                ", radioStation=" + radioStation +
                '}';
    }
}
