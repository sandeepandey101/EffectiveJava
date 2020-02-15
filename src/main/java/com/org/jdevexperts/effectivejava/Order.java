package com.org.jdevexperts.effectivejava;

import java.util.Date;

/**
 * @author sandeepandey
 */
public class Order {
  private final Date date;


  private Order(Date date) {
    // create the defensive copy first
    this.date = new Date(date.getTime());

  }

  public static Order of(Date date) {
    return new Order(date);
  }


  public Date getDate() {
    // return defnesive copy as well to make the immutable class 
    return new Date(this.date.getTime());
  }

}
