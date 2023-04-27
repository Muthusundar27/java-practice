class Computer{

    public void playMusic()
    {
        System.out.println("Music playing..");
    }
    public String getMeApen(int cost){
    if (cost >= 10)
        return "Pen";
    return "Nothing";
    
}
}


public class methd {
    
    public static void main(String args[])
    {  
      Computer comp = new Computer();
      comp.playMusic();

    String str = comp.getMeApen(2);
    System.out.println(str);
    }

}
