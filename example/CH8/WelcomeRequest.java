public class WelcomeRequest implements IRequest {
    private String place;
 
    public WelcomeRequest(String place) {
        this.place = place;
    }
 
    public void execute() {
        System.out.printf("�w��Ө� %s�I%n", place);
    }
}