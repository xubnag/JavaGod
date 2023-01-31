## 实战介绍
> 业务介绍：基于充血模型的DDD开发模式，开发一个虚拟钱包系统
> 充值、提现、支付、查询余额、查询交易流水等常用功能 + 冻结、透支、转赠等非常规功能，一般在"虚拟钱包系统" + "三方支付系统"之间流传。
> 此处，仅仅考虑"虚拟钱包系统"的实现，进而对比"贫血模型的传统开发模式"和"充血模型的DDD开发模式"



```JAVA
public class VirtualWalletService { // 通过构造函数或者IOC框架注入 private VirtualWalletRepository walletRepo; private VirtualWalletTransactionRepository transactionRepo; public VirtualWalletBo getVirtualWallet(Long walletId) { VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId); VirtualWalletBo walletBo = convert(walletEntity); return walletBo; } public BigDecimal getBalance(Long walletId) { return walletRepo.getBalance(walletId); } @Transactional public void debit(Long walletId, BigDecimal amount) { VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId); BigDecimal balance = walletEntity.getBalance(); if (balance.compareTo(amount) < 0) { throw new NoSufficientBalanceException(...); } VirtualWalletTransactionEntity transactionEntity = new VirtualWalletTransactionEntity(); transactionEntity.setAmount(amount); transactionEntity.setCreateTime(System.currentTimeMillis()); transactionEntity.setType(TransactionTy
```