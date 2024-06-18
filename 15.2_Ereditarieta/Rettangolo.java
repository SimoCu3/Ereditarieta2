public class Rettangolo extends Forma{

    private float a;
    private float b;

    public Rettangolo(float a, float b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void calcolaArea(){
        float area = (a * b);
        System.out.println("Area Rettangolo: " + area);
    }
}