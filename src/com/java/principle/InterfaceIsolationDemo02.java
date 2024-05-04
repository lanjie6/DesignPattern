package com.java.principle;

/**
 * 接口隔离原则-正例
 */
public class InterfaceIsolationDemo02 {

    public static void main(String[] args) {
        //保安队长给保安安排任务
        SafetyCaptain1 safetyCaptain = new SafetyCaptain1();
        safetyCaptain.makeCompanySafety(new SafetyKeeper1());

        //项目经理给程序员安排任务
        ProjectManager1 projectManager = new ProjectManager1();
        projectManager.arrangeProgrammingTask(new Coder1());
    }
}

/**
 * 互联网公司保安员工接口
 */
interface SafetyEmployee {

    /**
     * 能打
     */
    void canFighting();

    /**
     * 长得凶神恶煞
     */
    void looksFierce();

}

/**
 * 互联网公司程序员员工接口
 */
interface CoderEmployee {

    /**
     * 会编程
     */
    void canProgramming();

    /**
     * 取得高中学历
     */
    void canGetHighSchoolEducation();

}

/**
 * 互联网公司保安员工
 */
class SafetyKeeper1 implements SafetyEmployee {

    public void canFighting() {
        System.out.println("保安能打！经常叫嚣：我要打十个！");
    }

    public void looksFierce() {
        System.out.println("保安长得凶神恶煞！能够震慑宵小之徒！");
    }

}

/**
 * 互联网公司程序员员工
 */
class Coder1 implements CoderEmployee {

    public void canProgramming() {
        System.out.println("程序员会运用Java语言进行编程！");
    }

    public void canGetHighSchoolEducation() {
        System.out.println("程序员取得高中学历具有一定的逻辑思维");
    }

}

/**
 * 互联网公司项目经理
 */
class ProjectManager1 {

    /**
     * 安排编程任务
     */
    public void arrangeProgrammingTask(CoderEmployee emp) {
        emp.canGetHighSchoolEducation();
        emp.canProgramming();
    }
}

/**
 * 互联网公司保安队长
 */
class SafetyCaptain1 {

    /**
     * 确保公司安全
     */
    public void makeCompanySafety(SafetyEmployee emp) {
        emp.looksFierce();
        emp.canFighting();
    }
}
