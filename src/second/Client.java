package second;

public class Client {
    public Chair chair;

    public void sit() {
        if(chair.hasLegs())
            System.out.println("Sitting on...");
        else System.out.println("I can't sit on this type of chair...");
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

}