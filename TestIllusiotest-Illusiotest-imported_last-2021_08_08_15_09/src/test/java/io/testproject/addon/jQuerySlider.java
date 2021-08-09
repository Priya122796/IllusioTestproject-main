package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;

/**
 * Proxy for jQuery - Slider Addon */
public class jQuerySlider {
  /**
   * Factory method for GetCurrentValue */
  public static GetCurrentValue getGetCurrentValue() {
    return new GetCurrentValue();
  }

  /**
   * Factory method for MoveByOffset */
  public static MoveByOffset getMoveByOffset() {
    return new MoveByOffset();
  }

  /**
   * Factory method for MoveByOffset
   * @param steps Number of steps to move */
  public static MoveByOffset moveByOffset(int steps) {
    return new MoveByOffset(steps);
  }

  /**
   * Factory method for MoveToPosition */
  public static MoveToPosition getMoveToPosition() {
    return new MoveToPosition();
  }

  /**
   * Factory method for MoveToPosition
   * @param position New position */
  public static MoveToPosition moveToPosition(int position) {
    return new MoveToPosition(position);
  }

  /**
   * Get slider value. null */
  public static class GetCurrentValue extends ActionProxy {
    /**
     * Current value (OUTPUT) */
    public long value;

    public GetCurrentValue() {
      this.setDescriptor(new ProxyDescriptor("_L0Vtj8dakeVCzGCgzAKig", "GetCurrentValue"));
    }
  }

  /**
   * Move slider by offset. null */
  public static class MoveByOffset extends ActionProxy {
    /**
     * Number of steps to move (INPUT) */
    public int steps;

    public MoveByOffset() {
      this.setDescriptor(new ProxyDescriptor("_L0Vtj8dakeVCzGCgzAKig", "MoveByOffset"));
    }

    public MoveByOffset(int steps) {
      this();
      this.steps = steps;
    }
  }

  /**
   * Move slider to position. null */
  public static class MoveToPosition extends ActionProxy {
    /**
     * New position (INPUT) */
    public int position;

    public MoveToPosition() {
      this.setDescriptor(new ProxyDescriptor("_L0Vtj8dakeVCzGCgzAKig", "MoveToPosition"));
    }

    public MoveToPosition(int position) {
      this();
      this.position = position;
    }
  }
}
