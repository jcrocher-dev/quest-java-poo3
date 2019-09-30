public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();

        Eagle eyeCherry = new Eagle("Eye Cherry");
               
        eyeCherry.takeOff();
        eyeCherry.ascends(120);
        eyeCherry.ascends(30);
        eyeCherry.glide();
        eyeCherry.descend(140);
        eyeCherry.land();
        eyeCherry.descend(9);
        eyeCherry.land();
        
    }
}
