package File.inArrayAndFile.Student;

public class Student12 {

        int tuoi;
        String name;



        String noiO;
        public Student12(){};
        public Student12(int tuoi){
            this.tuoi=tuoi;
        }
        public Student12(int tuoi,String name){
            this.tuoi=tuoi;
            this.name=name;
        }
        public Student12(int tuoi,String name,String noiO){
            this.tuoi=tuoi;
            this.name=name;
            this.noiO=noiO;
        }
        public String getName() {
            return name;
        }

        public String getNoiO() {
            return noiO;
        }

        public int getTuoi() {
            return tuoi;
        }

        public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setNoiO(String noiO) {
            this.noiO = noiO;
        }
        @Override
        public  String toString(){
            return this.name+this.tuoi+this.noiO;
        }
    }


