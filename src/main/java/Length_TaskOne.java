/**
 * 体验的过程中，我希望你同时思考一下这些问题，它们是重构过程的一些重要关节：
 * <p>
 * 这份代码有哪些坏味道？
 * 1. 魔法值
 * 2. 条件嵌套过深，可读性降低
 * <p>
 * 你会先从哪里开始入手重构？
 * 1. 先抽取魔法值作为静态变量
 * 2. 降低if-else的嵌套复杂度
 * 你的重构是否能够随时停下，仍然保持代码可工作？
 * 能，每改动一行代码，有意识的运行一下单元测试
 * 运行测试的频率高吗？
 * 每进行一个重构操作，就运行一次代码，最小粒度是每改动 一行代码，执行一次单元测试
 * 你觉得重构最重要的是什么？
 * 小步快走，步子要小，并确保重构过程中，代码仍然能够正常工作，不破坏代码原有的功能
 */

public class Length_TaskOne {
    public static final String YARD = "yard";
    public static final String FOOT = "f";
    public static final String INCH = "inch";
    private final double value;
    private final String unit;

    public Length_TaskOne(double val, String uinnt) {
        this.value = val;
        this.unit = uinnt;
    }

    public Length_TaskOne as(String targetUnit) {
        Length_TaskOne len = this;
        switch (this.unit) {
            case FOOT:
                len = convertFromFoot(targetUnit, len);
                break;
            case YARD:
                len = convertFromYard(targetUnit, len);
                break;
            case INCH:
                len = convertFromInch(targetUnit, len);
                break;
        }
        return len;
    }

    private Length_TaskOne convertFromInch(String u, Length_TaskOne len) {
        if (u.equals(FOOT)) {
            len = new Length_TaskOne(this.value / 12, u);
        } else if (u.equals(YARD)) {
            len = new Length_TaskOne(this.value / 36, u);
        }
        return len;
    }


    private Length_TaskOne convertFromYard(String targetUnit, Length_TaskOne len) {
        if (targetUnit.equals(INCH)) {
            len = new Length_TaskOne(this.value * 36, targetUnit);
        } else if (targetUnit.equals(FOOT)) {
            len = new Length_TaskOne(this.value * 3, targetUnit);
        }
        return len;
    }

    private Length_TaskOne convertFromFoot(String unit, Length_TaskOne len) {
        if (unit.equals(YARD)) {
            len = new Length_TaskOne(this.value / 3, unit);
        } else if (unit.equals(INCH)) {
            len = new Length_TaskOne(this.value * 12, unit);
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
