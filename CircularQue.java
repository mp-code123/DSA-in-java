class CircularQue{
    static class Queue{
        static int arr[];
        static int size ;
        static int front = -1;
        static int rear = -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return front == -1 && rear == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            // Also increase front since element is being insert
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data; 
        }
        public static int remove(){
             if(isEmpty()){
                System.out.println("Queue is Empty already");
                return -1;
            }
            int result = arr[front];
            // removing element for single element where front = rear =0
            if(rear == front){
                rear = front = -1;
            }else {
                front = (front + 1) % size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(5);
         q.add(45);
        q.add(34);
        q.add(67);
        q.add(77);
        q.add(80);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}