package com.oop.mahadi.demo1cores;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CourseResController {

    @FXML
    private ComboBox<String> SelCouseChoiscoxFxid;

    @FXML
    private TextField StudentIdfxid;

    @FXML
    private TextField schilarshopInPercentfxid;

    @FXML
    private CheckBox scholarshipChoisboxFxid;

    @FXML
    private ComboBox<String> selSectionCombobodFxid;

    @FXML
    private TextField showNoOfCredittextfildFxid;

    @FXML
    private TextArea textAreaFxif;

    ArrayList<Course> c2arr =new ArrayList<>();



    @FXML
    void AddCOnAction(ActionEvent event) {
        textAreaFxif.clear();

        if (hset.size()==0){

            hset.add(SelCouseChoiscoxFxid.getValue());

            c2arr.add(hs2.get(SelCouseChoiscoxFxid.getValue()));
        }

        else if (!hset.add(SelCouseChoiscoxFxid.getValue())){

            textAreaFxif.setText("Uour selected \ncoure already added \n  Add a new course");
        }
        else {
            hset.add(SelCouseChoiscoxFxid.getValue());

            c2arr.add(hs2.get(SelCouseChoiscoxFxid.getValue()));



        }


        String s="";
        for(Course c:c2arr){
            s=s+c.toString()+"\n";




        }
        textAreaFxif.appendText("\n\n"+s);



    }
HashSet<String> hset=new HashSet<>();


    @FXML
    void ProCOnAction(ActionEvent event) {

        textAreaFxif.clear();
        String s="Student ID : "+StudentIdfxid.getText();

        if (scholarshipChoisboxFxid.isSelected()){

            Integer cr=0;
            for(Course sk : c2arr){
                cr=cr+sk.getCer();

            }

            s=s+", Scholarship : true , "+schilarshopInPercentfxid.getText()
            +"  Tusion fee per credit : 6000 taka\n Registerd course :\n ";


            for(Course c:c2arr){
                s=s+"Course"+c.toString()+"\n";




            }




            float x=(float) Integer.parseInt(schilarshopInPercentfxid.getText())/100.f;

            s=s+"\n\n\n\n\n  Credit enroled : "+cr+". Total payble amount :"+


                    ((cr*6000)-((cr*6000)* x))


                    +" taka only";
System.out.println();
        }
        else{


        }



        textAreaFxif.setText(s);

    }
ArrayList<Course> coarr= new ArrayList<>();

    HashMap<String,String> hs =new HashMap<>();
    HashMap<String,Course> hs2 =new HashMap<>();
    @FXML
    void initialize() {


//        (String name, String type, Integer sec, Integer cer) {
        Course c2L =new Course("c2L","L",10,1);
        Course c2T =new Course("c2T","T",10,3);

        Course c1L =new Course("c1L","L",100,1);
        Course c1T =new Course("c1T","T",100,3);


        Course c3L =new Course("c3L","L",101,1);
        Course c3T =new Course("c3T","T",101,3);


        Course c4L =new Course("c4L","L",1011,1);
        Course c4T =new Course("c4T","T",1011,3);

        Course c5L =new Course("c5L","L",110,1);
        Course c5T =new Course("c5T","T",110,3);
        coarr.add(c2L);
        coarr.add(c2T);
        coarr.add(c1L);
        coarr.add(c1T);
        coarr.add(c3L);
        coarr.add(c3T);
        coarr.add(c4L);
        coarr.add(c4T);
        coarr.add(c5L);
        coarr.add(c5T);
        for( Course co : coarr){
            SelCouseChoiscoxFxid.getItems().add(co.toString());
            hs.put(co.toString(),co.getCer().toString());
            hs2.put(co.toString(),co);


        }

    }


    @FXML
    public void combowboxCouseOnAction(ActionEvent actionEvent) {


        showNoOfCredittextfildFxid.setText(hs.get(SelCouseChoiscoxFxid.getValue()));
    }
}
