package com.zdlly.v2exclient.bean;

import java.io.Serializable;

/**
 * Created by zdlly on 2017/3/16.
 */

public class Latest implements Serializable{

    /**
     * id : 347929
     * title : 统计套利、高频交易、算法交易？
     * url : http://www.v2ex.com/t/347929
     * content : ## 统计套利、高频交易、算法交易？

     程序化交易、算法交易、量化投资、高频交易、统计套利，看你们天天聊这些高大上的词汇，感觉是不是你们都在做一秒钟几百万的生意？？黑人问号？？今天就踏踏实实的认识一下这几个词儿。

     <img src="http://www.raquant.com/qa/?qa=blob&qa_blobid=3983743215214330638"/>


     # 1. 程序化交易： program trading

     很简单的字面意思，意味着你利用程序(program)进行交易。具体的交易时机，交易仓位，止损止盈获利标准可能包含在程序本身，也可能独立于程序之外，程序本身只是执行的方式。与程序交易对应的是人工交易。一般利用程序交易有几大优势，比如说较快的速度，脱离了人为情绪的影响，执行力有保证等等。

     同时也应注意交易程序和交易系统的区别。交易系统是一个完整的系统，具体执行的程序可能只是其中的一部分。一个良好的交易系统应该还有风险控制，资金利用，仓位管理等方面的内容，而不仅仅是买卖信号的产生。



     # 2. 算法交易： algorithm trading

     意味着你的交易决定是根据一条或多条算法 (algorithm) 进行的，算法即是你交易的基础(trading logic)。算法本身千差万别，难以一概而论，常见的有以均价为基准的 VWAP,通过固定时间间隔执行的 TWAP, 趋势跟随的 momentum trader 等等，如果你自己编一个根据 MACD ， RSI 什么的产生指标的东西，也可以勉强称为 algorithm 的。算法交易的执行可以是手工的，也可以是纯自动化的。如果利用交易程序来执行的话，就是程序化算法交易。现在大部分的算法交易都由程序化来实现，原因在上一条最后有提到。



     # 3. 量化投资： quantitative investment

     一般概指通过概率，微积分等数学工具去研究金融市场各种资产价格的结构性原因来决定的投资。最有代表性的就是曾经盛极一时的 Long term capital management,题主可以自行 google 之。进行量化投资对投资者的数学能力要求很高，所以一般专门进行量化投资的基金和投资公司都喜欢招数学，物理等理科的 phd 。一般的量化投资都涉及到比较复杂的数学模型，至于是否有效则仁者见仁智者见智。


     <img src="http://www.raquant.com/qa/?qa=blob&qa_blobid=1396152274302919242"/>



     # 4. 高频交易： high frenquency trading

     意味着每次交易从开仓到平仓只有很短的时间间隔，一般从十几分钟到几微秒不等。主要目的是通过市场短暂的价格波动而获利。无论是趋势追随交易还是套利交易，只要速度达到了都可以被称为高频交易。人工达到高频交易的标准很难，所以一般都是通过程序交易：设置好算法，策略之后由下单软件执行。为了达到有竞争力的速度还需要软硬件共同配合。现在高频交易大概占美国市场电子交易的 60%-70%。这是一个 winner takes all 的游戏，所以到最后大家都在比拼硬件设施，比拼跟 exchange 的 co-location 以获得几微秒的优势。



     # 5. 统计套利: statistics arbitrage

     统计套利是套利交易的一种，意味着通过历史数据统计来发现套利机会并试图从中获利。比如历史上玉米与大豆的价格比率(玉米价格除以大豆价格)一直维持在某个区间，假设这个区间为 1 到 5 。以往的历史数据显示至今为止只有两次玉米与大豆的价格比率突破了 5 ，而且在突破后迅速回落至正常的区间。现在市场上玉米与大豆的比率突然再次突破了 5 达到了 6 ，作为统计套利者，你很可能就会想要卖出这个比率(卖玉米买大豆)，期待比率迅速回归正常区间。如果比率真的迅速回落至 4 或者 3 ，这时你再平仓(买回玉米卖出大豆)就可以获得可观利润。

     当然这只是个粗浅的比方，实际市场比这个复杂的多。如何确定正确的套利区间，如何决定最佳套利比(几手对几手)，有没有季节性影响，有没有可能的突发事件影响等等，都需要纳入考虑的范畴。

     还有就是要注意套利与对冲的区别，套利一般意味着零风险或者很低的风险，比如你同时买卖一个在不同交易所交易的同一产品，举个例子，买上海铜卖伦敦铜，或者买近月大豆，卖远月大豆。对冲则意味着你只是通过关联性降低了风险敞口，举个例子，你买了橡胶之后又卖了铜进行对冲，因为这两者的关联性相当高。

     如果你真的是程序员，欢迎去镭矿论坛看看一起探讨研究。
     * content_rendered : <h2>统计套利、高频交易、算法交易？</h2>
     <p>程序化交易、算法交易、量化投资、高频交易、统计套利，看你们天天聊这些高大上的词汇，感觉是不是你们都在做一秒钟几百万的生意？？黑人问号？？今天就踏踏实实的认识一下这几个词儿。</p>
     <img src="http://www.raquant.com/qa/?qa=blob&amp;qa_blobid=3983743215214330638">
     <h1>1. 程序化交易： program trading</h1>
     <p>很简单的字面意思，意味着你利用程序(program)进行交易。具体的交易时机，交易仓位，止损止盈获利标准可能包含在程序本身，也可能独立于程序之外，程序本身只是执行的方式。与程序交易对应的是人工交易。一般利用程序交易有几大优势，比如说较快的速度，脱离了人为情绪的影响，执行力有保证等等。</p>
     <p>同时也应注意交易程序和交易系统的区别。交易系统是一个完整的系统，具体执行的程序可能只是其中的一部分。一个良好的交易系统应该还有风险控制，资金利用，仓位管理等方面的内容，而不仅仅是买卖信号的产生。</p>
     <h1>2. 算法交易： algorithm trading</h1>
     <p>意味着你的交易决定是根据一条或多条算法 (algorithm) 进行的，算法即是你交易的基础(trading logic)。算法本身千差万别，难以一概而论，常见的有以均价为基准的 VWAP,通过固定时间间隔执行的 TWAP, 趋势跟随的 momentum trader 等等，如果你自己编一个根据 MACD ， RSI 什么的产生指标的东西，也可以勉强称为 algorithm 的。算法交易的执行可以是手工的，也可以是纯自动化的。如果利用交易程序来执行的话，就是程序化算法交易。现在大部分的算法交易都由程序化来实现，原因在上一条最后有提到。</p>
     <h1>3. 量化投资： quantitative investment</h1>
     <p>一般概指通过概率，微积分等数学工具去研究金融市场各种资产价格的结构性原因来决定的投资。最有代表性的就是曾经盛极一时的 Long term capital management,题主可以自行 google 之。进行量化投资对投资者的数学能力要求很高，所以一般专门进行量化投资的基金和投资公司都喜欢招数学，物理等理科的 phd 。一般的量化投资都涉及到比较复杂的数学模型，至于是否有效则仁者见仁智者见智。</p>
     <img src="http://www.raquant.com/qa/?qa=blob&amp;qa_blobid=1396152274302919242">
     <h1>4. 高频交易： high frenquency trading</h1>
     <p>意味着每次交易从开仓到平仓只有很短的时间间隔，一般从十几分钟到几微秒不等。主要目的是通过市场短暂的价格波动而获利。无论是趋势追随交易还是套利交易，只要速度达到了都可以被称为高频交易。人工达到高频交易的标准很难，所以一般都是通过程序交易：设置好算法，策略之后由下单软件执行。为了达到有竞争力的速度还需要软硬件共同配合。现在高频交易大概占美国市场电子交易的 60%-70%。这是一个 winner takes all 的游戏，所以到最后大家都在比拼硬件设施，比拼跟 exchange 的 co-location 以获得几微秒的优势。</p>
     <h1>5. 统计套利: statistics arbitrage</h1>
     <p>统计套利是套利交易的一种，意味着通过历史数据统计来发现套利机会并试图从中获利。比如历史上玉米与大豆的价格比率(玉米价格除以大豆价格)一直维持在某个区间，假设这个区间为 1 到 5 。以往的历史数据显示至今为止只有两次玉米与大豆的价格比率突破了 5 ，而且在突破后迅速回落至正常的区间。现在市场上玉米与大豆的比率突然再次突破了 5 达到了 6 ，作为统计套利者，你很可能就会想要卖出这个比率(卖玉米买大豆)，期待比率迅速回归正常区间。如果比率真的迅速回落至 4 或者 3 ，这时你再平仓(买回玉米卖出大豆)就可以获得可观利润。</p>
     <p>当然这只是个粗浅的比方，实际市场比这个复杂的多。如何确定正确的套利区间，如何决定最佳套利比(几手对几手)，有没有季节性影响，有没有可能的突发事件影响等等，都需要纳入考虑的范畴。</p>
     <p>还有就是要注意套利与对冲的区别，套利一般意味着零风险或者很低的风险，比如你同时买卖一个在不同交易所交易的同一产品，举个例子，买上海铜卖伦敦铜，或者买近月大豆，卖远月大豆。对冲则意味着你只是通过关联性降低了风险敞口，举个例子，你买了橡胶之后又卖了铜进行对冲，因为这两者的关联性相当高。</p>
     <p>如果你真的是程序员，欢迎去镭矿论坛看看一起探讨研究。</p>

     * replies : 0
     * member : {"id":217713,"username":"raquant","tagline":"","avatar_mini":"//v2ex.assets.uxengine.net/avatar/db87/baec/217713_mini.png?m=1488176075","avatar_normal":"//v2ex.assets.uxengine.net/avatar/db87/baec/217713_normal.png?m=1488176075","avatar_large":"//v2ex.assets.uxengine.net/avatar/db87/baec/217713_large.png?m=1488176075"}
     * node : {"id":12,"name":"qna","title":"问与答","title_alternative":"Questions and Answers","url":"http://www.v2ex.com/go/qna","topics":84472,"avatar_mini":"//v2ex.assets.uxengine.net/navatar/c20a/d4d7/12_mini.png?m=1488428101","avatar_normal":"//v2ex.assets.uxengine.net/navatar/c20a/d4d7/12_normal.png?m=1488428101","avatar_large":"//v2ex.assets.uxengine.net/navatar/c20a/d4d7/12_large.png?m=1488428101"}
     * created : 1489648026
     * last_modified : 1489648026
     * last_touched : 1489633626
     */

    private int id;
    private String title;
    private String url;
    private String content;
    private String content_rendered;
    private int replies;
    private MemberBean member;
    private NodeBean node;
    private int created;
    private int last_modified;
    private int last_touched;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent_rendered() {
        return content_rendered;
    }

    public void setContent_rendered(String content_rendered) {
        this.content_rendered = content_rendered;
    }

    public int getReplies() {
        return replies;
    }

    public void setReplies(int replies) {
        this.replies = replies;
    }

    public MemberBean getMember() {
        return member;
    }

    public void setMember(MemberBean member) {
        this.member = member;
    }

    public NodeBean getNode() {
        return node;
    }

    public void setNode(NodeBean node) {
        this.node = node;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(int last_modified) {
        this.last_modified = last_modified;
    }

    public int getLast_touched() {
        return last_touched;
    }

    public void setLast_touched(int last_touched) {
        this.last_touched = last_touched;
    }

    public static class MemberBean implements Serializable{
        /**
         * id : 217713
         * username : raquant
         * tagline :
         * avatar_mini : //v2ex.assets.uxengine.net/avatar/db87/baec/217713_mini.png?m=1488176075
         * avatar_normal : //v2ex.assets.uxengine.net/avatar/db87/baec/217713_normal.png?m=1488176075
         * avatar_large : //v2ex.assets.uxengine.net/avatar/db87/baec/217713_large.png?m=1488176075
         */

        private int id;
        private String username;
        private String tagline;
        private String avatar_mini;
        private String avatar_normal;
        private String avatar_large;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getTagline() {
            return tagline;
        }

        public void setTagline(String tagline) {
            this.tagline = tagline;
        }

        public String getAvatar_mini() {
            return avatar_mini;
        }

        public void setAvatar_mini(String avatar_mini) {
            this.avatar_mini = avatar_mini;
        }

        public String getAvatar_normal() {
            return avatar_normal;
        }

        public void setAvatar_normal(String avatar_normal) {
            this.avatar_normal = avatar_normal;
        }

        public String getAvatar_large() {
            return avatar_large;
        }

        public void setAvatar_large(String avatar_large) {
            this.avatar_large = avatar_large;
        }
    }

    public static class NodeBean implements Serializable {
        /**
         * id : 12
         * name : qna
         * title : 问与答
         * title_alternative : Questions and Answers
         * url : http://www.v2ex.com/go/qna
         * topics : 84472
         * avatar_mini : //v2ex.assets.uxengine.net/navatar/c20a/d4d7/12_mini.png?m=1488428101
         * avatar_normal : //v2ex.assets.uxengine.net/navatar/c20a/d4d7/12_normal.png?m=1488428101
         * avatar_large : //v2ex.assets.uxengine.net/navatar/c20a/d4d7/12_large.png?m=1488428101
         */

        private int id;
        private String name;
        private String title;
        private String title_alternative;
        private String url;
        private int topics;
        private String avatar_mini;
        private String avatar_normal;
        private String avatar_large;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle_alternative() {
            return title_alternative;
        }

        public void setTitle_alternative(String title_alternative) {
            this.title_alternative = title_alternative;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getTopics() {
            return topics;
        }

        public void setTopics(int topics) {
            this.topics = topics;
        }

        public String getAvatar_mini() {
            return avatar_mini;
        }

        public void setAvatar_mini(String avatar_mini) {
            this.avatar_mini = avatar_mini;
        }

        public String getAvatar_normal() {
            return avatar_normal;
        }

        public void setAvatar_normal(String avatar_normal) {
            this.avatar_normal = avatar_normal;
        }

        public String getAvatar_large() {
            return avatar_large;
        }

        public void setAvatar_large(String avatar_large) {
            this.avatar_large = avatar_large;
        }
    }
}
