    public class StudentGrade {
        public static void main(String[] args) {

            Student obj=new Student();

            obj.name="Manoj";
            obj.rollnumber=1270;
            //obj.marks=95;

    obj.calculteGrade(95);
    obj.calculteGrade(78);
    obj.calculteGrade(66);
    obj.calculteGrade(45);

            
        }
        
    }


    class Student{

        String name;
        int rollnumber;
        double marks;

        void calculteGrade(double marks){

            if (marks>=90){
                System.out.println("Name:"+this.name +" "+"RollNumber:"+this.rollnumber +" "+ "Grade:A"+"1");
            
            }

            else if(marks>75 && marks<89){
                System.out.println("Name:"+this.name +" "+"RollNumber:"+this.rollnumber +" "+ "Grade:B"+"2");
            
            }

            else if (marks>50 && marks<74){
                System.out.println("Name:"+this.name +" "+"RollNumber:"+this.rollnumber +" "+ "Grade:c" +"3");
                
            }

            else{

                System.out.println("Name:"+this.name +" "+"RollNumber:"+this.rollnumber +" "+ "Grade:D"+"4");
                
            }


        }


}