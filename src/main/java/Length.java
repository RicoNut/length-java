public class Length {
    private final double value;
    private final String unit;

    public Length(double val, String targetUnit) {
        this.value = val;
        this.unit = targetUnit;
    }

    public Length convertAs(String targetUnit) {
        Length len = this;
        if (this.unit.equals(UnitConstant.FOOT)) {
            if (targetUnit.equals(UnitConstant.YARD)) {
                len = new Length(this.value / 3, targetUnit);
            } else if (targetUnit.equals(UnitConstant.INCH)) {
                len = new Length(this.value * 12, targetUnit);
            }
        }

        if (this.unit.equals(UnitConstant.YARD)) {
            if (targetUnit.equals(UnitConstant.INCH)) {
                len = new Length(this.value * 36, targetUnit);
            } else if (targetUnit.equals(UnitConstant.FOOT)){
                len = new Length(this.value * 3, targetUnit);
            }
        }

        if (this.unit.equals(UnitConstant.INCH)) {
            if (targetUnit.equals(UnitConstant.FOOT)) {
                len = new Length(this.value / 12, targetUnit);
            } else if (targetUnit.equals(UnitConstant.YARD)) {
                len = new Length(this.value / 36, targetUnit);
            }
        }

        return len;
    }

    public double getVal() {
        return this.value;
    }

    public String getUinnt() {
        return this.unit;
    }
}
