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

//    public static void scrollTextScene_M(SignBoard board, String text) {
//        int width = board.getWidth();
//        int y = board.getHeight() / 2;
//        for (int x = -text.length(); x <= width; ++x) {
//            SignBoard.Frame frame = board.newFrame();
//
//            if (x >= width)
//                break;
//
//            if (x < 0)
//                // Scrolling on to the left side.
//                frame.write(0, y, text.substring(-x));
//            else if (x + text.length() <= width)
//                // Fully on the board.
//                frame.write(x, y, text);
//            else
//                // Scrolling off the board.
//                frame.write(x, y, text.substring(0, width - x));
//
//            frame.finish(0.02);
//        }
//    }

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
                    frame.write(x, y, "*");
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








    public static void main(String[] args) {
        SignBoard signBoard = new SignBoard(8);

//        // Run the sign board forever.
        while (true) {
            ribbonScene_M(signBoard, 40);
            flashFreshHotScene_ME(signBoard, 8);
            //scrollTextScene_M(signBoard, "###  F A L A F E L  ###");
            flashFreshHotScene_M(signBoard, 8);
            ribbonScene_M(signBoard, 8);


        }
    }
}