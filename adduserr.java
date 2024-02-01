import java.util.Scanner;
public class adduserr {
  public static void main(String[] arg) {
    int count = 0;
    String[] username = {
      "Book",
      "Copybook",
      "Pen",
      "Notebook"
    };
    Scanner s = new Scanner(System.in);
    String newname = s.nextLine();
    for (int i = 0; i < username.length; i++) {
      if (username[i].equals(newname)) {
        count = 1;
        System.out.println("This username is in the array");
        break;
      }
      if (count == 0) {
        System.out.println("This username isn't in the array");
        break;
      }

    }

  }
}
