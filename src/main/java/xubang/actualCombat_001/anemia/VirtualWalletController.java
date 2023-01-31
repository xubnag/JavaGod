package xubang.actualCombat_001.anemia;

import java.math.BigDecimal;

/**
 * @author XuBang
 * @version 1.0
 * @date 2023/1/31 15:39
 * @Description 贫血模型的MVC三层架构
 */

public class VirtualWalletController {
    // 通过构造函数或者IOC框架注入
    private VirtualWalletService virtualWalletService;

    public BigDecimal getBalance(Long walletId) {
        return new BigDecimal(0);
    } //查询余额

    public void debit(Long walletId, BigDecimal amount) {
    } //出账

    public void credit(Long walletId, BigDecimal amount) {
    } //入账

    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {
    } //转账
    //省略查询transaction的接口
}