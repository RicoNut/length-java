public class Length {
    private final double value;
    private final Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Length as(Unit target) {
        return new Length(calculator(target, this.value), target);
    }

    private double calculator(Unit target, double resultValue) {
        if (this.unit == Unit.FOOT) {
            if (target == Unit.YARD) {
                resultValue = this.value / 3;
            } else if (target == Unit.INCH) {
                resultValue = this.value * 12;
            }
        }

        if (this.unit == Unit.YARD) {
            if (target == Unit.INCH) {
                resultValue = this.value * 36;
            } else if (target == Unit.FOOT) {
                resultValue = this.value * 3;
            }
        }

        if (this.unit == Unit.INCH) {
            if (target == Unit.FOOT) {
                resultValue = this.value / 12;
            } else if (target == Unit.YARD) {
                resultValue = this.value / 36;
            }
        }
        return resultValue;
    }

    public double getValue() {
        return this.value;
    }

    public Unit getUnit() {
        return unit;
    }
}
