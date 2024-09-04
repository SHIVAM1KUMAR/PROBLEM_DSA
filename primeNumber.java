public class primeNumber{
    public static void main(String[] args) {
        int n=91,Count=1;
     
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    Count++;
                   
                    if((n/i)!=i){
                        Count++;
                    }
                }

               
        }
        if(Count>2){
            System.out.println("not prime number");
        }else
        System.out.println("Prime number");
        System.out.println("Stteak");
    }
    
    }
