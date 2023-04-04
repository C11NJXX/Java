package c11njxx.learn.no1interfacedemo2;

public class Test {
    public static void main(String[] args) {
        BasketballPlayer basketballPlayer = new BasketballPlayer(23,"Luca");
        BasketballCoach basketballCoach = new BasketballCoach(45,"Rivers");
        PingPangPlayer pingPangPlayer = new PingPangPlayer(26,"MaLong");
        PingPangCoach pingPangCoach = new PingPangCoach(54,"Li");
//        basketballPlayer.learn();
//        basketballCoach.teach();
//        pingPangCoach.teach();
//        pingPangCoach.speakEng();
//        pingPangPlayer.learn();
//        pingPangCoach.speakEng();
        //接口多态
        learn(basketballPlayer);
        learn(pingPangPlayer);
        teach(basketballCoach);
        teach(pingPangCoach);
    }
    public static void learn(Learn l) {
        l.learn();
    }
    public static void teach(Teach t) {
        t.teach();
    }
}
