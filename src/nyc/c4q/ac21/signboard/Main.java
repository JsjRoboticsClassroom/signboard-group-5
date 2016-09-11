package nyc.c4q.ac21.signboard;

import java.util.Random;

public class Main {


    public static void flashFreshHotScene_ME(SignBoard board, int cycles) {
        Random random = new Random();
        int width = board.getWidth();
        int leftPosition = width / 4 - 12;
        int rightPosition = 3 * width / 4 - 7;
        int y = board.getHeight() / 2;

        for (int i = 0; i < cycles -2; ++i) {
            SignBoard.Frame frame = board.newFrame();

            // Choose a color at random.
            int color = random.nextInt(4);
            if (color == 0)
                frame.setGreen();
            else if (color == 1)
                frame.setRed();
            else if (color == 2)
                frame.setWhite();
            else
                frame.setYellow();
            // Write a word.

            if (i % 2 == 0) {
                frame.write(leftPosition, y - 2, "|  _____||  | |  ||  _____||  | |  ||   | ");
                frame.write(leftPosition, y - 1, "| |_____ |  |_|  || |_____ |  |_|  ||   | ");
                frame.write(leftPosition, y,     "|_____  ||       ||_____  ||       ||   | ");
                frame.write(leftPosition, y + 1, " _____| ||       | _____| ||   _   ||   | ");
                frame.write(leftPosition, y + 2, "|_______||_______||_______||__| |__||___| ");
            } else {
                frame.write(rightPosition, y - 2, " (`' )   (`' )  (`' ) ");
                frame.write(rightPosition, y - 1, "(_ o _) (_ o _)(_ o _)");
                frame.write(rightPosition, y,     " (_,_)(`' ),_)(`' )_) ");
                frame.write(rightPosition, y + 1, "     (_ o _) (_ o _)  ");
                frame.write(rightPosition, y + 2, "      (_,_)   (_,_)   ");
            }
            frame.finish(0.70);
        }
    }

    public static void flashFreshHotScene(SignBoard board, int cycles) {
        Random random = new Random();
        int width = board.getWidth();
        int leftPosition = width / 4 - 12;
        int rightPosition = 2 * width / 4 - 7;
        int y = board.getHeight() / 2;

        for (int i = 0; i < cycles * 3; ++i) {
            SignBoard.Frame frame = board.newFrame();

            // Choose a color at random.
            int color = random.nextInt(4);
            if (color == 0)
                frame.setGreen();
            else if (color == 1)
                frame.setRed();
            else if (color == 2)
                frame.setWhite();
            else
                frame.setYellow();
            // Write a word.
            if (i % 6 == 0) {
                frame.write(leftPosition, y - 2, "  SSSS U    U   SSSS H   H IIII");
                frame.write(leftPosition, y - 1, "SS     U    U SS     H   H  II ");
                frame.write(leftPosition, y, "  SS   U    U   SS   HHHHH  II ");
                frame.write(leftPosition, y + 1, "    SS  U  U      SS H   H  II ");
                frame.write(leftPosition, y + 2, "SSSS     UU   SSSS   H   H IIII");
            } else {
                frame.write(rightPosition, y - 2, "RRRR    OOO   L     L       SSSS");
                frame.write(rightPosition, y - 1, "R   R  O   O  L     L     SS    ");
                frame.write(rightPosition, y, "RRRR  O     O L     L       SS  ");
                frame.write(rightPosition, y + 1, "R  R   O   O  L     L         SS");
                frame.write(rightPosition, y + 2, "R   R   OOO   LLLLL LLLLL SSSS  ");
            }
        }
    }

    public static void flashFreshHotScene_M(SignBoard board, int cycles) {
        Random random = new Random();
        int width = board.getWidth();
        int leftPosition = width / 4 - 12;
        int rightPosition = 3 * width / 4 - 7;
        int y = board.getHeight() / 2;

        for (int i = 0; i < cycles - 2; ++i) {
            SignBoard.Frame frame = board.newFrame();

            // Choose a color at random.
            int color = random.nextInt(4);
            if (color == 0)
                frame.setGreen();
            else if (color == 1)
                frame.setRed();
            else if (color == 2)
                frame.setWhite();
            else
                frame.setYellow();
            // Write a word.

            if (i % 2==0) {
                frame.write(leftPosition, y - 2, "|  _____| |  | |  ||  | |  ||  |_|  | |   _   ||  | ");
                frame.write(leftPosition, y - 1, "| |_____  |  |_|  ||  |_|  ||       | |  |_|  ||  | ");
                frame.write(leftPosition, y,     "|_____  | |       ||       ||       | |       ||  | ");
                frame.write(leftPosition, y + 1, " _____| | |   _   ||       || ||_|| | |   _   ||  | ");
                frame.write(leftPosition, y + 2, "|_______| |  | |  ||_______||_|   |_| |  | |  ||__| ");

            }else {
                frame.write(rightPosition, y - 2, " ^^^^^^^,:/ ^^^^^^^^ ");
                frame.write(rightPosition, y - 1, "     ,,///;,  ,;/     ");
                frame.write(rightPosition, y,     "  OO:::::::::///     ");
                frame.write(rightPosition, y + 1, "   >:::::::::\\\\    ");
                frame.write(rightPosition, y + 2, "     ''\\\\' ';\\\\  ");

            }

            frame.finish(0.70);
        }
    }

    public static void ribbonScene_M(SignBoard board, int numCycles) {
        int width = board.getWidth();
        int height = board.getHeight();
        for (int i = 0; i < numCycles; ++i) {
            SignBoard.Frame frame = board.newFrame();

            for (int x = -2; x < width; ++x) {
                int y = (2 * height - 2 + x + i) % (2 * height - 2);
                if (y >= height)
                    y = 2 * height - y - 2;
                if (0 < x) {
                    frame.setYellow();
                    frame.write(x, y, "-");
                }
                if (0 < x + 1 && x + 1 < width) {
                    frame.setYellow();
                    frame.write(x + 1, y, "*");
                }
                if (x + 2 < width) {
                    frame.setWhite();
                    frame.write(x + 2, y, "*");
                }
                if (x + 3 < width) {
                    frame.setWhite();
                    frame.write(x + 3, y, "*");
                }
                if (x + 4 < width) {
                    frame.setRed();
                    frame.write(x + 4, y, "*");
                }
                if (x + 5 < width) {
                    frame.setRed();
                    frame.write(x + 5, y, "*");
                }
                if (x + 6 < width) {
                    frame.setWhite();
                    frame.write(x + 6, y, "*");
                }
            }

            frame.finish(0.02);
        }
    }




    /**
     * Draws a scene which flashes the words "FRESH" and "HOT".
     * @param board
     *   The board on which to draw.
     * @param cycles
     *   The number of cycles to draw for.
     */

    public static void scrollTextScene(SignBoard board, String text) {
        int width = board.getWidth();
        int y = (board.getHeight() / 2) - 3;//ORIGINALLY DIDNT HAVE -3
        for (int x = -text.length(); x <= width; ++x) {
            SignBoard.Frame frame = board.newFrame();

            if (x >= width)
                break;

            if (x < 0)
                // Scrolling on to the left side.
                frame.write(0, y, text.substring(-x));
            else if (x + text.length() <= width)
                // Fully on the board.
                frame.write(x, y, text);
            else
                // Scrolling off the board.
                frame.write(x, y, text.substring(0, width - x));

            frame.finish(0.02);
        }
    }

    public static void flashSalmonScene(SignBoard board, int cycles) {
        Random random = new Random();
        int width = board.getWidth();
        int leftPosition = width / 4 - 12;
        int rightPosition = 3 * width / 4 - 7;
        int y = board.getHeight() / 2;

        for (int i = 0; i < cycles * 3; ++i) {
            SignBoard.Frame frame = board.newFrame();

            // Choose a color at random.
            int color = random.nextInt(4);
            if (color == 0)
                frame.setWhite();
            else if (color == 1)
                frame.setWhite();
            else if (color == 2)
                frame.setWhite();
            else
                frame.setYellow();
            // Write a word.
            int row = 6;
            if (i % row == 0) {
                frame.write(rightPosition, y - 2, "");
                frame.write(rightPosition, y - 1, "");
                frame.write(rightPosition, y,     "                     ***");
                frame.write(rightPosition, y + 1, "                    * @ *");
                frame.write(rightPosition, y + 2, "                     ***");
            } else if (i % row == 1) {
                frame.write(rightPosition, y - 2, "");
                frame.write(rightPosition, y - 1, "");
                frame.write(rightPosition, y,     "             ***     ***");
                frame.write(rightPosition, y + 1, "            * @ *   * @ *");
                frame.write(rightPosition, y + 2, "             ***     ***");
            } else if (i % row == 2) {
                frame.write(rightPosition, y - 2, "                 ***");
                frame.write(rightPosition, y - 1, "                * @ *");
                frame.write(rightPosition, y,     "             *** *** ***");
                frame.write(rightPosition, y + 1, "            * @ *   * @ *");
                frame.write(rightPosition, y + 2, "             ***     ***");
            } else if (i % row == 3) {
                frame.write(rightPosition, y - 2, "                 ***");
                frame.write(rightPosition, y - 1, "                * @ *");
                frame.write(rightPosition, y,     "     ***     *** *** ***");
                frame.write(rightPosition, y + 1, "    * @ *   * @ *   * @ *");
                frame.write(rightPosition, y + 2, "     ***     ***     ***");
            } else if (i % row == 4) {
                frame.write(rightPosition, y - 2, "         ***     ***");
                frame.write(rightPosition, y - 1, "        * @ *   * @ *");
                frame.write(rightPosition, y,     "     *** *** *** *** ***");
                frame.write(rightPosition, y + 1, "    * @ *   * @ *   * @ *");
                frame.write(rightPosition, y + 2, "     ***     ***     ***");
            } else {
                frame.write(leftPosition, y - 2, " SSSS     AA    L      MM   MM  OOOO  NN   N");
                frame.write(leftPosition, y - 1, "S        A  A   L      M M M M O    O N N  N");
                frame.write(leftPosition, y,     " SSSS   AAAAAA  L      M  M  M O    O N  N N");
                frame.write(leftPosition, y + 1, "     S  A    A  L      M     M O    O N   NN");
                frame.write(leftPosition, y + 2, " SSSS   A    A  LLLLLL M     M  OOOO  N    N");
            }
            frame.finish(0.25);
        }
    }
    public static void eatingOnigiri(SignBoard board, int cycles) {
        Random random = new Random();
        int width = board.getWidth();
        int leftPosition = width / 4 - 12;
        int rightPosition = 3 * width / 4 - 7;
        int y = board.getHeight() / 2;

        for (int i = 0; i < cycles * 2; ++i) {
            SignBoard.Frame frame = board.newFrame();

            // Choose a color at random.
            int color = random.nextInt(4);
            if (color == 0)
                frame.setWhite();
            else if (color == 1)
                frame.setWhite();
            else if (color == 2)
                frame.setWhite();
            else
                frame.setWhite();

            if (i % 3 == 0) {
                frame.write(leftPosition, y - 3, "                      ^  ");
                frame.write(leftPosition, y - 2, "                   /:::::\\ ");
                frame.write(leftPosition, y - 1, "                 /:::::::::\\  " );
                frame.write(leftPosition, y    , "               /:::::::::::::\\ ");
                frame.write(leftPosition, y + 1, "              /::::|     |::::\\ ");
                frame.write(leftPosition, y + 2, "             |:::::|^   ^|:::::| ");
                frame.write(leftPosition, y + 3, "              '.___|  3  |___.'  ");

            }
//
            else if (i % 3 == 2) {

                frame.write(leftPosition, y - 3, "                                    * *    " );
                frame.write(leftPosition, y - 2, "                                   gurgle  *  " );
                frame.write(leftPosition, y - 1, "                                )^   *  * " );
                frame.write(leftPosition, y    , "                               ):::\\ ");
                frame.write(leftPosition, y + 1, "                           )^  |::::\\ ");
                frame.write(leftPosition, y + 2, "                       )^:x   x|:::::| ");
                frame.write(leftPosition, y + 3, "                     .___|  -  |___.'  ");

            }
            else {
                frame.write(leftPosition, y - 3, "                          `    *ouch!* ");
                frame.write(leftPosition, y - 2, "                        ):::::\\    *  ");
                frame.write(leftPosition, y - 1, "                       ^:::::::\\ ");
                frame.write(leftPosition, y,     "                     )::::::::::\\ ");
                frame.write(leftPosition, y + 1, "                    ^:|     |::::\\ ");
                frame.write(leftPosition, y + 2, "                   )::|>   <|:::::|  ");
                frame.write(leftPosition, y + 3, "                 '.___|  ~  |___.'  ");
            }

            frame.finish(0.35);
        }
    }
    public static void main(String[] args) {
        SignBoard signBoard = new SignBoard(8);

//        // Run the sign board forever.
        while (true) {
            ribbonScene_M(signBoard, 40);
            scrollTextScene(signBoard,  "***Japanese Food Is Japanese Food Because Japanese Food***");
            flashFreshHotScene_ME(signBoard, 8);
            flashFreshHotScene_M(signBoard, 8);
            flashFreshHotScene(signBoard, 8);
            flashSalmonScene(signBoard, 8);
            eatingOnigiri(signBoard, 8);
        }
    }
}
