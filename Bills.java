public class Bills {
    public static void main(String[] args) {
        int []a={5,5,5,10,20};
        int five=0;
        int ten=0;
        int flag=0;
        
        for(int i=0;i<a.length;i++){
            if(a[i]==5){
                five++;
            }else if (a[i]==10) {
                ten++;
                if(five>0){
                   five--;
                }else{
                    flag = 1;
                    System.out.println("Not found");
                    break;
                }
            } else{
                // if(a[i]==twenty){
                //     twenty++;
                    if(five>0 && ten>0){
                        ten--;five--;
                    }else if( five>2){
                            five = five-3;
                    }else{
                        flag = 1;
                        System.out.println("not found");
                        break;
                    }
                }
            }
            if(flag==0)
           System.out.println("true");
        }
        
    }

