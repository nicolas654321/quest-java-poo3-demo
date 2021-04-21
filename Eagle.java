
public class Eagle extends Animal implements Fly {

    public Eagle(String aName, int aAge) {
        super(aName, aAge);
        flying = false;
        altitude = 0;
    }

    private int altitude;
    private boolean flying;
    
    @Override
    public void takesOf() {
        if (flying) {
            System.out.println(this.getName() + " can't take of, already flying !");
        } else {
            System.out.println(this.getName() + " takes off in the sky !");
            altitude = 10;
            flying = true;
        }
    }

    @Override
    public void fliesUp() {
        if (flying) {
            altitude += 10;
            System.out.println(this.getName() + " flies upward, altitude " + altitude);
        } else {
            System.out.println(this.getName() + "Can't flies up, not flying !");
        }
    }

    @Override
    public void fliesdown() {
        if (flying) {
            if (altitude>10) {
                altitude -= 10;
                System.out.println(this.getName() + " flies downward, altitude " + altitude);
            } else {
                System.out.println(this.getName() + "Can't flies down, too low ! Altitude : "+ altitude);
            }
        } else {
            System.out.println(this.getName() + "Can't flies down, not flying !");
        }
    }

    @Override
    public void glides() {
        if (flying) {
            System.out.println(this.getName() + " glides into the air.");
        } else {
            System.out.println(this.getName() + "Can't glides, not flying !");
        }
        
    }

    @Override
    public void lands() {
        if (flying) {
            if (altitude<=10) {
                altitude = 0;
                flying = false;
                System.out.println(this.getName() + " lands on the ground");
            } else {
                System.out.println(this.getName() + " is too high, it can't lands.");
            }
        } else {
            System.out.println(this.getName() + " can't lands, not flying !");
        }
    }

    
}
