import processing.core.PApplet;

public class ProcessingMethod extends PApplet {

    public static final int HEIGHT = 600;
    public static final int WIDTH = 480;
    public static final int DIAMETER = 20;
    int start1=0;
    int start2=0;
    int start3=0;
    int start4=0;


    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        drawCircle1(HEIGHT/5, DIAMETER,1);
        drawCircle2((HEIGHT*2)/5,DIAMETER,2);
        drawCircle3((HEIGHT*3)/5,DIAMETER,3);
        drawCircle4((HEIGHT*4)/5,DIAMETER,4);

        //drawCircle1(0,HEIGHT/5, DIAMETER1,);

    }

    private void drawCircle1(int y,int d,int x ){
        ellipse(start1,y,d,d );
        start1+=x;
    }
    private void drawCircle2(int y,int d,int x ){
        ellipse(start2,y,d,d );
        start2+=x;
    }
    private void drawCircle3(int y,int d,int x ){
        ellipse(start3,y,d,d );
        start3+=x;
    }
    private void drawCircle4(int y,int d,int x ){
        ellipse(start4,y,d,d );
        start4+=x;
    }

    public static void main(String[] args) {
        PApplet.main("ProcessingMethod",args);
    }

}
