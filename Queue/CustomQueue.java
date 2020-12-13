import java.io.*;
import java.util.*;

public class CustomQueue {
    int data[];
    int size;
    int front;

    CustomQueue(int capacity) {
        this.data = new int[capacity];
        this.size = 0;
        this.front = 0;
    }

    void enqueue(int val) {

        if (size == data.length) {
            System.out.println("Queue overflow");
            return;
        }
        int ind = (front + size) % data.length;
        data[ind] = val;
        size++;
    }

    int dequeue() {

        if (size == 0) {
            System.out.println("Queue underflow");
            return -1;
        }
        int rv = data[front];
        front = (front + 1) % data.length;
        size--;
        return rv;
    }

    int queueSize() {
        return this.size;
    }

    int peek() {
        if (size == 0) {
            System.out.println("Queue underflow");
            return -1;
        }
        return data[front];
    }

    void display() {
        for (int i = 0; i < size; i++) {
            int item = data[(front + i) % data.length];
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
