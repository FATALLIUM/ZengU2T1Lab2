public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot chatBot1 = new ChatBot("Garfield", 10);
//
//        chatBot1.greeting("Mr. Fishington");
//        chatBot1.weather();
//
//        double meters = chatBot1.convertFeetToMeters(56);
//        System.out.println("Did you know? (This is a false fact) I once ate a chicken " + meters + " meters wide!");
//
//        chatBot1.favoriteNumber(611);
//
//        int nums = chatBot1.addNumbers(4,5,6);
//        System.out.println("I have around " + nums + " toothbrush(es).");
//
//        String bye = chatBot1.goodbye();
//        System.out.println(bye);

        String season = chatBot1.getSeason();
        chatBot1.haiku(season);
    }
}
