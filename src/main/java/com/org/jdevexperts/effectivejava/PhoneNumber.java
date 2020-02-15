package com.org.jdevexperts.effectivejava;


import com.google.common.base.Preconditions;

import java.util.Objects;

/**
 * Why use static factory method over constructor ?
 *
 * 1:) They have names.
 * 2:) We can use same or reusable same instance. lets suppose we have precaulculate Phone Number on the basic of
 * well known area code and phone number.
 * 3:) we can use any subtype of phone number depending upon the params.
 * 4:) we can return 
 *
 */
public class PhoneNumber {


  private final int areaCode;
  private final int number;

  private PhoneNumber(int areaCode, int number) {
    this.areaCode = areaCode;
    this.number = number;
  }


  public static PhoneNumber of(int areaCode, int number) {
    Preconditions.checkArgument(areaCode > 0);
    Preconditions.checkArgument(number > 1000);
    return new PhoneNumber(areaCode, number);
  }


  @Override
  public boolean equals(Object obj) {
    if (obj instanceof PhoneNumber) {
      PhoneNumber phoneNumber = (PhoneNumber) obj;
      return Objects.equals(this,phoneNumber);

    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.areaCode,this.number);
  }
}
