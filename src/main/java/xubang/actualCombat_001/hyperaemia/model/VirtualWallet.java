package xubang.actualCombat_001.hyperaemia.model;

/**
 * @author XuBang
 * @version 1.0
 * @date 2023/1/31 16:23
 * @Description Domain领域模型（充血模型）
 */

public class VirtualWallet { // Domain领域模型(充血模型)
    private Long id;
    private Long createTime = System.currentTimeMillis();;
    private BigDecimal balance = BigDecimal.ZERO;

    public VirtualWallet(Long preAllocatedId) {
        this.id = preAllocatedId;
    }

    public BigDecimal balance() {
        return this.balance;
    }

    public void debit(BigDecimal amount) {
        if (this.balance.compareTo(amount) < 0) {
            throw new InsufficientBalanceException(...);
        }
        this.balance = this.balance.subtract(amount);
    }

    public void credit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidAmountException(...);
        }
        this.balance = this.balance.add(amount);
    }
}