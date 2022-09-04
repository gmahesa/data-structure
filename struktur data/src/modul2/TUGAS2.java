package modul2;

public class TUGAS2 {
	int arr[] ;
	int head = -1;
	int tail = 0;	
    
	public void insert(int angka){
        if(head != arr.length){
            head++; // head increment
            arr[head] = angka; // angka insert            
        }
    }
    
    public void remove(){
        if(head != -1){
            tail++; // tail increment            
        }
    }
    
    public void peekFront() {
    	System.out.println(arr[0]);
    }
    
    public void size(int n) {
    	arr = new int[n];
    }
    
    public void isFull(){
        if(head == arr.length-1){
            System.out.println("TRUE");
        }else {
        	System.out.println("FALSE");
        }
    }
    
    public void isEmpty(){
        if(head == -1){
        	System.out.println("TRUE");
        }else {
        	System.out.println("FALSE");
        }
    }
    
    public void view(){
        if(head != arr.length && head > -1){  
            System.out.print("queue : ");
            for (int i = tail ; i <= head ; i++) {
                System.out.print( arr[i] + " ");
            }
            System.out.println();
        }else{
            System.out.println("queue kosong mas bro");
            System.out.println();
        }
    }
}