package com.org.jdevexperts.effectivejava;

/**
 * Trying to implement strategy pattern before java 8
 */
public enum  Operation {


  ADD{
    @Override
    public int apply(int first, int second) {
      return first + second;
    }
  },

  SUBTRACT{
    @Override
    public int apply(int first, int second) {
      return first - second;
    }
  } ,

  MULTIPLY {
    @Override
    public int apply(int first, int second) {
      return first * second;
    }
  },

  DIVIDE {
    @Override
    public int apply(int first, int second) {
      return first/second;
    }
  };

  public abstract int apply(int first,int second);
}
