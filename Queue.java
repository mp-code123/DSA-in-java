class QueueClass{
    static class Queue{
        int arr[];
        int size;
        int rear= -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public boolean isEmpty(){
            return rear == -1;
        }
        public boolean isFull(){
            return rear == size -1;
        }
        //Enque
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
            }
            //increase rear since element is enqued
            rear++;
            arr[rear] = data;
        }
        //Deque
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty already");
            }
            int front = arr[0];
            //shift elements since front element is dequed
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            //update rear since front element is dequed
            rear--;
            return front;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty already");
            }
            return arr[0];
        }
    }

    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(90);
        q.add(101);
        q.add(50);
        q.add(88);
        q.add(56);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
