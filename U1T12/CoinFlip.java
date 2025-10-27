public class CoinFlip {
    private CoinFlip(){}

    public String flip(){
        int num = (int)(Math.random()*2);
        if (num==1){
            return "Heads";
        } else {
            return "Tails";
        }
    }

    public double simulate(int num){
        int heads = 0;
        int tails = 0;
        for (int i = 0; i < num; i++)  {
            String result = flip();
            if (result.equals("Heads")){
                heads++;
            } else {
                tails++;
            }
        }
        return (double)heads/tails;
    }
}
