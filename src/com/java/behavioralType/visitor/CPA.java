package com.java.behavioralType.visitor;

/**
 * 会计师类（具体访问者角色）
 */
public class CPA implements AccountBookViewer {

    /**
     * 会计师在看账本时，如果是支出并且是工资，则需要看应该交的税交了没
     */
    @Override
    public void viewConsumeBill(ConsumeBill bill) {
        if (bill.getItem().equals("工资")) {
            System.out.println("会计师查看工资是否交个人所得税。");
        }
    }

    /**
     * 如果是收入，则所有的收入都要交税
     */
    @Override
    public void viewIncomeBill(IncomeBill bill) {
        System.out.println("会计师查看收入交税了没。");
    }
}
