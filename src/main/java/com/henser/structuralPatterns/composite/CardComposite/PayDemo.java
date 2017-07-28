package com.henser.structuralPatterns.composite.CardComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * 首先：
    1.我们的部件有，总店，分店，加盟店！
    2.我们的部件共有的行为是：刷会员卡
    3.部件之间的层次关系，也就是店面的层次关系是，总店下有分店、分店下可以拥有加盟店。
    有了我们这几个必要条件后，我的要求就是目前店面搞活动当我在总店刷卡后，就可以累积相当于在所有下级店面刷卡的积分总额
 * Created by henser on 17-7-24.
 */
public class PayDemo {

    public abstract class Market {
        String name;

        public abstract void add(Market m);

        public abstract void remove(Market m);

        public abstract void PayByCard();
    }

    // 分店 下面可以有加盟店
    public class MarketBranch extends Market {
        // 加盟店列表
        List<Market> list = new ArrayList<Market>();

        public MarketBranch(String s) {
            this.name = s;
        }

        @Override
        public void add(Market m) {
            // TODO Auto-generated method stub
            list.add(m);
        }

        @Override
        public void remove(Market m) {
            // TODO Auto-generated method stub
            list.remove(m);
        }

        // 消费之后，该分店下的加盟店自动累加积分
        @Override
        public void PayByCard() {
            // TODO Auto-generated method stub
            System.out.println(name + "消费,积分已累加入该会员卡");
            for (Market m : list) {
                m.PayByCard();
            }
        }
    }

    // 加盟店 下面不在有分店和加盟店，最底层
    public class MarketJoin extends Market {
        public MarketJoin(String s) {
            this.name = s;

        }

        @Override
        public void add(Market m) {
            // TODO Auto-generated method stub

        }

        @Override
        public void remove(Market m) {
            // TODO Auto-generated method stub

        }

        @Override
        public void PayByCard() {
            // TODO Auto-generated method stub
            System.out.println(name + "消费,积分已累加入该会员卡");
        }
    }

    public static void main(String[] args) {
        PayDemo demo = new PayDemo();

        MarketBranch rootBranch = demo.new MarketBranch("总店");
        MarketBranch qhdBranch = demo.new MarketBranch("秦皇岛分店");
        MarketJoin hgqJoin = demo.new MarketJoin("秦皇岛分店一海港区加盟店");
        MarketJoin btlJoin = demo.new MarketJoin("秦皇岛分店二白塔岭加盟店");

        qhdBranch.add(hgqJoin);
        qhdBranch.add(btlJoin);
        rootBranch.add(qhdBranch);
        rootBranch.PayByCard();
    }

}
