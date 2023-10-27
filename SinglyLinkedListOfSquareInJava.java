import java.util.*;

class Square {
    private double sideLength;
    private LocalDateTime creationDateTime;

    public Square() {
        this.sideLength = 0.0;
        this.creationDateTime = LocalDateTime.now();
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
        this.creationDateTime = LocalDateTime.now();
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + sideLength +
                ", creationDateTime=" + creationDateTime +
                '}';
    }
}

class Node {
    public Square data;
    public Node next;

    public Node(Square square) {
        this.data = square;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addSquare(Square square) {
        Node newNode = new Node(square);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data.toString());
            current = current.next;
        }
    }
}

public class SinglyLinkedListOfSquareInJava {
    public static void main(String[] args) {
        LinkedList squareList = new LinkedList();

        Square square1 = new Square(5.0);
        Square square2 = new Square(7.0);

        squareList.addSquare(square1);
        squareList.addSquare(square2);

        squareList.displayList();
    }
}
