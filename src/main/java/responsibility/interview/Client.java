package responsibility.interview;

/**
 * 客户端类
 */
public class Client {
    public static void main(String[] args) {
        Handler telephoneInterviewHandler = new TelephoneInterviewHandler();
        telephoneInterviewHandler.setNextHandler(new FaceInterviewHandler())
                .setNextHandler(new WrittenTestHandler());
        telephoneInterviewHandler.handle(85);
    }
}
