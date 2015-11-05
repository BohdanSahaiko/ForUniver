package Laboratorn;

public class Main  {
    public static void main(String[] args) {
    SkiMuneris skiMuneris = new SkiMuneris(1,42,"Правий бік");
        skiMuneris.addSnow();
        skiMuneris.addSnow();
        skiMuneris.addSnow();
        System.out.println("Count:"+skiMuneris.addSnow());
        System.out.println("Total price with other "+skiMuneris.getTotalPrice());
        System.out.println("All inform "+skiMuneris.getId()+ " " + skiMuneris.getShoeSSize()+" "+skiMuneris.getDirection());
        System.out.println();
        System.out.println();
        SkiMuneris skiMuneris1 = new SkiMuneris(2,43,"Лівий бік");
        skiMuneris1.addSnow();
        skiMuneris1.addSnow();
        skiMuneris1.addSnow();
        System.out.println("Count:"+skiMuneris1.addSnow());
        System.out.println("Total price with other "+skiMuneris1.getTotalPrice());
        System.out.println("All inform "+skiMuneris1.getId()+ " " + skiMuneris1.getShoeSSize()+" "+skiMuneris1.getDirection());
    }
}
