public class Car {
    public String name;
    public int maxSpeed;
    private int currentSpeed;

    public void startEngine(){
        this.currentSpeed = 0;
        System.out.println("Engine started");
    }

    public void stopEngine(){
        this.currentSpeed = 0;
        System.out.println("Engine stopped");
    }

    public void increaseSpeed (int addSpeed ) {
        this.currentSpeed = this.currentSpeed + addSpeed;
    }

    public void driveWithSpeed (int speed ) {
        if (speed != this.maxSpeed) {
            this.currentSpeed = speed;
        }
        else {
            System.out.println("You cannot drive faster than max speed which is " + this.maxSpeed + " :<");
        }
    }


    public String getMaxSpeed (){
        return "Max speed is: " + this.maxSpeed;
    }
/*
    public String getCurrentSpeed (){
        return "Current speed is: " + this.currentSpeed;
    }
}
*/



