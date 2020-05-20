package com.new_tx.mi.entity;


public class User {

  private String id;
  private String userLoginName;
  private String userLoginPassword;
  private String userName;
  private String userState;
  private String userIsdel;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getUserLoginName() {
    return userLoginName;
  }

  public void setUserLoginName(String userLoginName) {
    this.userLoginName = userLoginName;
  }


  public String getUserLoginPassword() {
    return userLoginPassword;
  }

  public void setUserLoginPassword(String userLoginPassword) {
    this.userLoginPassword = userLoginPassword;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserState() {
    return userState;
  }

  public void setUserState(String userState) {
    this.userState = userState;
  }


  public String getUserIsdel() {
    return userIsdel;
  }

  public void setUserIsdel(String userIsdel) {
    this.userIsdel = userIsdel;
  }

}
