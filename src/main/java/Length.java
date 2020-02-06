public class Length {
    private final double value;
    private UnitEnum unitEnum;

    public Length(double value, UnitEnum unitEnum) {
        this.value = value;
        this.unitEnum = unitEnum;
    }

    public Length as(UnitEnum unitEnum) {
        return new Length(calculator(unitEnum), unitEnum);
    }

    private double calculator(UnitEnum unitEnum) {
        double resultValue = this.value;
        if (this.unitEnum == UnitEnum.FOOT) {
            if (unitEnum == UnitEnum.YARD) {
                resultValue = this.value / 3;
            } else if (unitEnum == UnitEnum.INCH) {
                resultValue = this.value * 12;
            }
        }

        if (this.unitEnum == UnitEnum.YARD) {
            if (unitEnum == UnitEnum.INCH) {
                resultValue = this.value * 36;
            } else if (unitEnum == UnitEnum.FOOT){
                resultValue = this.value * 3;
            }
        }

        if (this.unitEnum == UnitEnum.INCH) {
            if (unitEnum == UnitEnum.FOOT) {
                resultValue = this.value / 12;
            } else if (unitEnum == UnitEnum.YARD) {
                resultValue = this.value / 36;
            }
        }
        return resultValue;
    }

    public double getVal() {
        return this.value;
    }

    public UnitEnum getUnitEnum() {
        return unitEnum;
    }
}
