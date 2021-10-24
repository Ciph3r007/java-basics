package com.ciph3r.oop;

public final class CheckBox extends UIControl implements UIEvent, UIEvent2{
  @Override
  public void render() {
    System.out.println("Render CheckBox");
  }

  @Override
  public void onClick() {
    UIEvent.super.onClick();
  }

//  @Override
//  public void onClick() {
//
//  }
}
