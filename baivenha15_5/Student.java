package File.baivenha15_5;

import java.io.Serializable;

public class Student  implements Serializable {
    String name ;
    int tuoi;
    public Student(String tuyên, int i, String bacninh){}
    public Student (String name){
        this.name=name;

    }
    public Student (String name,int tuoi){
        this.name=name;
        this.tuoi=tuoi;

    }

    public String getName() {
        return name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "name    "+ this.getName() +"   tuoi  "+this.getTuoi();
    }



}
