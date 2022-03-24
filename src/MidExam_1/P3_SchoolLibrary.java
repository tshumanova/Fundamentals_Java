package MidExam_1;

import java.util.*;

public class P3_SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> bookLibrary = readStringList(scanner);

        String command = scanner.nextLine();
        //   Add Book | {book name}
        //  Take Book | {book name}
        //  Swap Books | {book1} | {book2}
        //  Insert Book | {book name}
        //  Check Book | {index}
        //"Done"
        while (!"Done".equals(command)) {
            String[] tokens = command.split(" \\| ");
            String currentCommand = tokens[0];

            switch (currentCommand) {
                case "Add Book":
                    String AddBookName = tokens[1];
                    if (!bookLibrary.contains(AddBookName)) {
                        bookLibrary.add(0, AddBookName);
                    }
                    break;
                case "Take Book":
                    String TakeBookName = tokens[1];
                    bookLibrary.remove(TakeBookName);
                    break;
                case "Swap Books":
                    String swapBookOne = tokens[1];
                    String swapBookTwo = tokens[2];
                    if (bookLibrary.contains(swapBookOne)
                            && bookLibrary.contains(swapBookTwo)) {
                        int indexOfBookOne = bookLibrary.indexOf(swapBookOne);
                        int indexOfBookTwo = bookLibrary.indexOf(swapBookTwo);
                        Collections.swap(bookLibrary, indexOfBookOne, indexOfBookTwo);
                    }
                    break;
                case "Insert Book":
                    String InsertBookName = tokens[1];
                    bookLibrary.add(InsertBookName);
                    break;
                case "Check Book":
                    int index = Integer.parseInt(tokens[1]);
                    if (index > 0 && index < bookLibrary.size()) {
                        System.out.println(bookLibrary.get(index));
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        String outputBookLibrary = String.join(", ", bookLibrary);
        System.out.println(outputBookLibrary);
    }

    private static List<String> readStringList(Scanner scanner) {
        String[] input = scanner.nextLine().split("&");
        return new ArrayList<>(Arrays.asList(input));
    }
}