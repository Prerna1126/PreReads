import processing.core.PApplet;

public class Oops4balls extends PApplet {

    private static final int HEIGHT = 600 ;
    private static final int WIDTH=480;
    private static final int DIAMETER=20;

    Ball b1,b2,b3,b4;
    private static final int startingPoint=0;



    public static void main(String[] args) {
        PApplet.main("Oops4balls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        b1=new Ball(startingPoint,(HEIGHT)/5,DIAMETER,1);
        b2=new Ball(startingPoint,(HEIGHT*2)/5,DIAMETER,2);
        b3=new Ball(startingPoint,(HEIGHT*3)/5,DIAMETER,3);
        b4=new Ball(startingPoint,(HEIGHT*4)/5,DIAMETER,4);
    }

    @Override
    public void draw() {

        b1.getEllipse();
        b2.getEllipse();
        b3.getEllipse();
        b4.getEllipse();

    }

    public class Ball{
        int start;
        int height;
        int diameter;
        int speed;

        public Ball(int start,int height,int diameter, int speed){
            this.start=start;
            this.height=height;
            this.diameter=diameter;
            this.speed=speed;
        }
        void getEllipse(){
            ellipse(start,height,diameter,diameter);
            start=start+speed;

        }

    }
}
