import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {

    //------------------RUN--------------------------------------------------------//

        public static void main(String[] args) {
            Intro intro = new Intro();
            intro.frame.setVisible(true);
            intro.frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            try{
                for (int i = 0; i<=100; i++){
                    Thread.sleep(20);
                    intro.pb.setValue(i);
                    if(i==100){
                        intro.pb.setVisible(false);
                        intro.frame.setVisible(false);
                        intro.frame.dispose();
                        Menu menu = new Menu();
                        menu.setVisible(true);
                    }
                }
            } catch (InterruptedException ex) {

            }
        }


}
