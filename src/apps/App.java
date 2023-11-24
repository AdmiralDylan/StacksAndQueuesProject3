package apps;

import adts.*;
public class App {

    public static void main(String[] args){
    
        ALStack<String> alStringStack = new ALStack<>();


        for(int i = 96; i<123; i++){
            alStringStack.push((char)i + "");
        }

        System.out.println(alStringStack);
        while(!alStringStack.isEmpty()){
            alStringStack.pop();
        }
        System.out.println(alStringStack);
    

    //AL Queu
    ALQueue<String> alStringQueue = new ALQueue<>();


        for(int i = 96; i<123; i++){
            alStringQueue.enqueue((char)i + "");
        }

        System.out.println(alStringQueue);
        while(!alStringQueue.isEmpty()){
            alStringQueue.dequeue();
        }
        System.out.println(alStringQueue);

        alStringQueue.enqueue("hello");
        alStringQueue.enqueue("yes");
        alStringQueue.enqueue("this");
        System.out.println(alStringQueue);
        System.out.println(alStringQueue.dequeue());
        alStringQueue.enqueue("is");
        System.out.println(alStringQueue);
        System.out.println(alStringQueue.dequeue());
        System.out.println(alStringQueue.dequeue());



        //ABL2Stack
        ABL2Stack<String> abl2StringStack = new ABL2Stack<>();

        abl2StringStack.push("the");
        abl2StringStack.push("is");
        abl2StringStack.push("this");
        abl2StringStack.push("yes");

        System.out.println(abl2StringStack.toString());

        System.out.println(abl2StringStack.pop());
        abl2StringStack.push("hello");

        System.out.println(abl2StringStack.toString());
        
        //ABL2 Queue
        ABL2Queue<String> abl2StringQueue = new ABL2Queue<>();
        abl2StringQueue.enqueue("yuh");
        abl2StringQueue.enqueue("yuh");
        abl2StringQueue.enqueue("yuh");
        System.out.println(abl2StringQueue.isFull());
        abl2StringQueue.enqueue("ey");
        System.out.println(abl2StringQueue.isFull());
        System.out.println(abl2StringQueue.toString());
        
        abl2StringQueue.dequeue();
        abl2StringQueue.enqueue("yeah");
        System.out.println(abl2StringQueue.toString());
        abl2StringQueue.enqueue("null");
        
    }

    
}
