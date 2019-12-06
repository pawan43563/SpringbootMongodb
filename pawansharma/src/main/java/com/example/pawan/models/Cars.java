package com.example.pawan.pawansharma.models;import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;public class Cars {
  @Id
  public ObjectId _id;
 
  public String car_name;
  public String date_of_sale;
  public String model_no;
  public String price;
 
  // Constructors
  public Cars() {}
 
  public Cars(ObjectId _id, String car_name, String date_of_sale, String model_no,String price) {
    this._id = _id;
    this.car_name = car_name;
    this.date_of_sale = date_of_sale;
    this.model_no = model_no;
    this.price=price;
  }
 
  // ObjectId needs to be converted to string
  public String get_id() { return _id.toHexString(); }
  public void set_id(ObjectId _id) { this._id = _id; }
 
  public String getcar_name() { return car_name; }
  public void setcar_name(String car_name) { this.car_name = car_name; }
 
  public String getdate_of_sale() { return date_of_sale; }
  public void setdate_of_sale(String date_of_sale) { this.date_of_sale = date_of_sale; }
 
  public String getmodel_no() { return model_no; }
  public void setmodel_no(String model_no) { this.model_no = model_no; }

  public String getprice() { return price; }
  public void setprice(String price) { this.price = price; }
}