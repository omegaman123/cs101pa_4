package com.company;
import java.lang.*;
// Vector.java
// A class that implements the Vector ADT.
//
// For this assignment, you must complete this code skeleton.
// You may not change the function prototypes.
// You are expected to fill in the functions to make them work
// as expected, and you can add as much as you need or want.
// We recommend implementing the Vector ADT using x and y coordinates.

// Notes:
// Angles are always in radians, not degrees.

class Vector {
  // Fields

    float xCoord;
    float yCoord;
    float magnitude;
    float angle;

  // Constructgors

  // The default constructor should create a new Vector with no magnitude.
  public Vector() {
    this.xCoord = 0;
    this.yCoord = 0;
    this.magnitude = 0;
  }

  // This constructor takes an x and a y coordinate for the Vector.
  public Vector(float x, float y) {
    this.xCoord = x;
    this.yCoord = y;
    this.magnitude = (float)Math.sqrt((Math.pow(x,2) + Math.pow(y,2)));
    this.angle = (float)java.lang.Math.atan2(y,x);
  }

  // This "constructor" takes an angle and a magnitude for the Vector.
  // It is not a traditional constructor because only one function can have
  //   the signature Vector(float, float).
  public static Vector polarVector(float angle, float magnitude) {

  }



  // Access functions

  /** getX
   *  Returns the x coordinate of the Vector.
   */
  public float getX() {
    return this.xCoord;
  }

  /** getY
   *  Returns the y coordinate of the Vector.
   */
  public float getY() {
    return this.yCoord;
  }

  /** getAngle
   *  Returns the angle of the Vector.
   */
  public float getAngle() {
    return this.angle;
  }

  /** getMagnitude
   *  Returns the magnitude of the Vector.
   */
  public float getMagnitude() {
    return this.magnitude;
  }

  /** add
   *  Returns the sum of this Vector with the given Vector.
   */
  public Vector add(Vector other) {

  }

  /** subtract
   *  Returns the difference between this Vector and the given Vector.
   */
  public Vector subtract(Vector other) {

  }

  /** dotProduct
   *  Returns the dot product of this Vector and the given Vector.
   */
  public float dotProduct(Vector other) {

  }

  /** scalarMultiply
   *  Returns this Vector scaled by the given scalar.
   */
  public Vector scalarMultiply(float scalar) {
      this.xCoord = this.xCoord*scalar;
      this.yCoord = this.yCoord*scalar;
      this.magnitude = (float)Math.sqrt((Math.pow(this.xCoord,2) + Math.pow(this.yCoord,2)));
      return this;
  }

  /** normalize
   *  Returns the normalized version of this Vector, a Vector with the same
   *    angle with magnitude 1.
   */
  public Vector normalize() {

  }



  // Manipulation functions
  // None.  Vectors are immutable.

}
