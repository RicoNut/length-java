public class Length {

    private final double value;

    private UnitEnum unitEnum;

    public Length(double value, UnitEnum unitEnum) {
        this.value = value;
        this.unitEnum = unitEnum;
    }

    public Length as(UnitEnum unit) {
        Length len = this;
        if (this.unitEnum == UnitEnum.FOOT) {
            if (unit == UnitEnum.YARD) {
                len = new Length(this.value / 3, unit);
            } else if (unit == UnitEnum.INCH) {
                len = new Length(this.value * 12, unit);
            }
        }

        if (this.unitEnum == UnitEnum.YARD) {
            if (unit == UnitEnum.INCH) {
                len = new Length(this.value * 36, unit);
            } else if (unit == UnitEnum.FOOT) {
                len = new Length(this.value * 3, unit);
            }
        }

        if (this.unitEnum == UnitEnum.INCH) {
            if (unit == UnitEnum.FOOT) {
                len = new Length(this.value / 12, unit);
            } else if (unit == UnitEnum.YARD) {
                len = new Length(this.value / 36, unit);
            }
        }

        return len;
    }

    public double getVal() {
        return this.value;
    }
    public UnitEnum getUnitEnum() {
        return this.unitEnum;
    }
}
