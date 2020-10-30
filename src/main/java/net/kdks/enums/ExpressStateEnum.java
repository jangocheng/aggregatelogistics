package net.kdks.enums;

/**
 * 快递状态
 * @author wangze
 * @date 2020-10-10 15:52:04
 */
public enum ExpressStateEnum implements ValueEnum<Integer> {

    /**
     * 在途
     */
    TRANSITING(0),
    /**
     * 揽收
     */
    COLLECTED(1),
    /**
     * 疑难
     */
    EXCEPTION(2),
    /**
     * 签收
     */
    SIGNED(3),
    /**
     * 退回
     */
    BACK(4),
    /**
     * 派件
     */
    DELIVERING(5),
    /**
     * 代理
     */
    AGENT(6),

    /**
     * 转投
     */
    FORWARD(7);

    private final Integer value;

    ExpressStateEnum(Integer value) {
        this.value = value;
    }

    /**
     * Get enum value.
     *
     * @return enum value
     */
    @Override
    public Integer getValue() {
        return value;
    }
}