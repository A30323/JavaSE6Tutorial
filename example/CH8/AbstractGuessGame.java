public abstract class AbstractGuessGame {
    private int number;
 
    public void setNumber(int number) {
        this.number = number;
    }
 
    public void start() {
        showMessage("�w��");
 
        int guess = 0;
        do {
            guess = getUserInput();
            if(guess > number) {
                showMessage("��J���Ʀr���j");
            }
            else if(guess < number) {
                showMessage("��J���Ʀr���p");
            }
            else {
                showMessage("�q���F");
            }
        } while(guess != number);
    }

    protected abstract void showMessage(String message);
    protected abstract int getUserInput();
}