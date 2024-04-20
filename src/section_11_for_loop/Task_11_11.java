package section_11_for_loop;

public class Task_11_11 {

    public void action() {
        for (int i = 0; i < 11; i++) {
            int randomNumber = (int) (Math.random() * 90) + 10;

            int firstDigit = randomNumber / 10;
            int lastDigit = randomNumber % 10;

            if (randomNumber % 5 == 0) {
                System.out.print("(" + (firstDigit + lastDigit) + ")");
            } else {
                System.out.print("[" + (firstDigit * lastDigit) + "]");
            }
            System.out.print(" ");
        }
    }
}
