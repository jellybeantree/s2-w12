public class HW_Student_Main{
    HW_Student[] studs = new HW_Student[10];
    
    public HW_Student_Main(){
        int x = 0;
        while(x < 10){
            studs[x] = new HW_Student(x*10);
            x++;
        }
        //this are in order by id
        print();

        shuffle(studs);

        //are they out of order?
        print();
    }
    
    public void shuffle(HW_Student[] s){
        //write this
    }

    public void print(){
        for(HW_Student s: studs){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        new HW_Student_Main();
    }

}