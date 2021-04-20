package polimorfisme;

public class linkaran extends BangunDatar{
    int r;

    public linkaran(int r) {
        this.r = r;
    }

    @Override
    public float luas(){
        return (float) (Math.PI * r * r);
    }

    @Override
    public float keliling(){
        return (float) (2 * Math.PI * r);
    }
}
