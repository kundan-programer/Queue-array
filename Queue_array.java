import java.util.Queue;
import java.util.Scanner;

class Queue1 {
  Scanner sc = new Scanner(System.in);
  int f = -1;
  int r = -1;
  int n = 10;
  int arr[] = new int[n];

  void enqueue(Scanner sc) {
    if (r == (n - 1)) {
      System.out.println("OverFlow");
    }

    else {
      System.out.print("Enter data: ");
      int i = sc.nextInt();

      if (f == -1 && r == -1) {
        f = 0;
        r = 0;
        arr[r] = i;
      }

      else {
        r = r + 1;
        arr[r] = i;
      }
    }
  }

  void Dequeue() {
    if (f == -1 && r == -1) {
      System.out.println("UnderFlow");
    }

    else {
      f = f + 1;
    }
  }

  void display() {
    for (int i = f; i <= r; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}

public class Queue_array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Queue1 s = new Queue1();
    int l;
    do {

      System.out.println("Press 1 to Enqueuq: ");
      System.out.println("Press 2 to Dequeue: ");
      System.out.println("Press 3 to display: ");
      System.out.println();
      System.out.print("Enter your chice: ");
      int c = sc.nextInt();

      switch (c) {
        case 1:
          s.enqueue(sc);
          break;

        case 2:
          s.Dequeue();
          break;

        case 3:
          s.display();
          break;
      }
      System.out.print("\nEnter 0 to go back to the main menu: ");
      l = sc.nextInt();
      System.out.println();
    }

    while (l == 0);
    System.out.print("Exit sucessfully");
  }
}
