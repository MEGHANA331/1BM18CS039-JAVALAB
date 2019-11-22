
class T1 implements Runnable{
Thread t;
T1(){
t=new Thread(this,"T1");
t.start();
}
public void run(){
while(true){
System.out.println("BMS college of engineering");
try{
Thread.sleep(10000);}
catch(InterruptedException e){
System.out.println("BMS thread interrupted");
}
}
}
}

class T2 implements Runnable{
Thread t1;
T2(){
t1=new Thread(this,"T2");
t1.start();
}
public void run(){
while(true){
System.out.println("cse");
try{
Thread.sleep(2000);}
catch(InterruptedException ex){
System.out.println("cse thread interrupted");
}
}
}
}

class mt{
public static void main(String args[]){
T1 ob1=new T1();
T2 ob2=new T2();

}
}

