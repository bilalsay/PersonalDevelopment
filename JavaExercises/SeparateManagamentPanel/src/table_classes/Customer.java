/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table_classes;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author bilalsay
 */
public class Customer {
    public String customerId;
    public String nameSurname;
    public String password;
    public String email;
    public String phone;
    public String memberShipCode;
    public String memberShipMod;
    public String customerMod;
    
    public Customer(String customerId, String nameSurname,String password, String email, String phone, String memberShipCode, String memberShipMod, String customerMod) {
        this.customerId = customerId;
        this.nameSurname = nameSurname;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.memberShipCode = memberShipCode;
        this.memberShipMod = memberShipMod;
        this.customerMod = customerMod;
    }
    
}
